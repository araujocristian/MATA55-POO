package cliente;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Cristian Araujo
 */
public class Cliente extends JFrame {
    
    private static ArrayList<Lembrete> lembretes = new ArrayList<>();

    private static JTextField txtIP;
    private static JTextField txtPorta;
    private static JTextField txtQuant;
    private static JTextField txtNome;
    private static JTextField txtHora;
    private static String nome;
    private static String hora;
    private static int n;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // cria tela para pegar dados de conexção com o servidor 
            JLabel lblMessage = new JLabel("Conectar ao Servidor:");
            txtIP = new JTextField("127.0.0.1");
            txtPorta = new JTextField("12345");
            Object[] texts = {lblMessage, txtIP, txtPorta };
            JOptionPane.showMessageDialog(null, texts);

            // conecta cliente
            Socket cliente = new Socket(txtIP.getText(),Integer.parseInt(txtPorta.getText()));

            // cria variaveis de entrada e saida de dados
            ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
                        
            // pega dados dos lembretes
            // cria tela para pegar quantidade de lembretes
            JLabel lblMessage2 = new JLabel("Informe a quantidade de lembretes:");
            txtQuant = new JTextField("2");
            Object[] texts2 = {lblMessage2, txtQuant};
            JOptionPane.showMessageDialog(null, texts2);

            n = Integer.parseInt(txtQuant.getText());

            for(int j=0; j < n; j++){
                // cria tela para pegar informações do lembrete
                JLabel lblMessage3 = new JLabel("Informe dados do lembrete:");
                txtNome = new JTextField("Beber água");
                txtHora = new JTextField("22:48");
                Object[] texts3 = {lblMessage3, txtNome, txtHora};
                JOptionPane.showMessageDialog(null, texts3);

                nome = txtNome.getText();
                hora = txtHora.getText();
                
                // cria o localTime formatado
                DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
                LocalTime horaLembrete = LocalTime.parse(hora, dtf);
                
                // cria o lembrete
                Lembrete lembrete = new Lembrete(nome,horaLembrete);
                lembretes.add(lembrete);
                System.out.println("\n Lembrete Adicionado!");
                
                // envia dados para o servidor
                saida.flush();
                saida.writeObject(hora);
            }
            
            // envia sinal de fim 
            saida.flush();
            saida.writeObject("f");
            
            // verifica a resposta do servidor e esperar para lembrar
            while(!lembretes.isEmpty()){
                // recebe dados do servidor
                LocalTime horaLembrete = (LocalTime) entrada.readObject();
                
                // Pega o Lembrete que vai ser lembrado
                for(Lembrete lem: lembretes){
                    if(lem.getHora().equals(horaLembrete)){
                        JOptionPane.showMessageDialog(null,"Lembrar de " + lem.getNome());
                        lembretes.remove(lem);
                    }
                }
            }
            
            // encerra sessão
            entrada.close();
            cliente.close();
            System.out.println("Agradecemos por usar o Lembrador!");
        }
        catch(HeadlessException | IOException | ClassNotFoundException | NumberFormatException e) {
          System.out.println("Erro: " + e.getMessage());
        }
    }
}
