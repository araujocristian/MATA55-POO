package servidor;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Cristian Araujo
 */
public class Servidor {
    private static final Lembrete LEMBRETE = new Lembrete();
    private static final ArrayList<LocalTime> horaLembretes = new ArrayList<>();
    
    private static String clienteDado = "";
    private static JTextField txtPorta;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
        
        // cria tela para porta do servidor
        JLabel lblMessage = new JLabel("Abrir porta do Servidor:");
        txtPorta = new JTextField("12345");
        Object[] texts = {lblMessage, txtPorta };
        JOptionPane.showMessageDialog(null, texts);
        
        // Instancia o ServerSocket ouvindo a porta da entrada
        ServerSocket servidor = new ServerSocket(Integer.parseInt(txtPorta.getText()));
        System.out.println("Servidor ouvindo a porta: " + Integer.parseInt(txtPorta.getText()));
      
        while(true) {
            // o método accept() bloqueia a execução até que o servidor receba um pedido de conexão
            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());

            // cria variaveis de entrada e saida
            ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());

            // armazena dados do cliente
            while(true){
                //recebe dados do cliente
                clienteDado = (String) entrada.readObject();

                if(clienteDado.equals("f")) break; // verifica se é o digito final

                LocalTime horaLembrete = LEMBRETE.formatarHora(clienteDado); // formata hora recebida 
                // add horario a lista
                horaLembretes.add(horaLembrete);
                LEMBRETE.textoAlarmeAdd(horaLembrete); //Imprime o texto de alarme adicionado
            }
            // verifica hora de lembrar
            while(true){
                for(LocalTime h: horaLembretes){
                    if(LEMBRETE.alarmar(h)){ //verifica se precisa alarmar
                        saida.flush();
                        saida.writeObject(h); //envia alarme para o cliente
                        horaLembretes.remove(h);
                    }
                }

                if(horaLembretes.isEmpty()) saida.close();
            }
         }  
    }   
    catch(HeadlessException | IOException | ClassNotFoundException | NumberFormatException e) {
       System.out.println("Erro: " + e.getMessage());
    }
  }   
    
}
