package cliente;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class Cliente {
    
    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("127.0.0.1",12345);
            // cria variaveis de entrada e saida de dados
            ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            
            // array de lembretes
            ArrayList<Lembrete> lembretes = new ArrayList<>();
            
            int cont = 0;
            
            // pega dados dos lembretes
            Scanner teclado = new Scanner(System.in);
            int n;
            String nome;
            String hora;
            
            System.out.println("Informe a quantidade de lembretes: ");
            n = teclado.nextInt();
            
            for(int j=0; j < n; j++){
                System.out.println("Informe o nome do Lembrete: ");
                nome = teclado.nextLine();

                System.out.printf("Informe a hora do Lembrete no formato HH:mm:ss :\n");
                hora = teclado.next();

                Lembrete lembrete = new Lembrete(nome,hora);
                lembretes.add(lembrete);
                
                // envia dados para o servidor
                saida.flush();
                saida.writeObject(hora);
            }
            
            // verifica entrada e esperar para lembrar
            while(cont < n){
                String horaLembrete = (String) entrada.readObject();

                for(Lembrete lem: lembretes){
                    if(lem.getHora().equals(horaLembrete)){
                        cont++;
                        JOptionPane.showMessageDialog(null,"Lembrar de " + lem.getNome());
                    }
                }
            }
            
            entrada.close();
            System.out.println("Conexão encerrada");
        }
        catch(Exception e) {
          System.out.println("Erro: " + e.getMessage());
        }
    }
}
