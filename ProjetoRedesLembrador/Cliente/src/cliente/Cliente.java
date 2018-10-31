package cliente;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
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
            ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            
            // PEGAR DADOS DO LEMBRETE
            Scanner teclado = new Scanner(System.in);
            
            String s;
            String hora;

            System.out.printf("Informe o nome do Lembrete:\n");
            s = teclado.nextLine();

            System.out.printf("Informe a hora do Lembrete no formato HH:mm:ss :\n");
            hora = teclado.next();
            
            Lembrete lembrete = new Lembrete(s,hora);
            
            saida.flush();
            saida.writeObject(hora);

            String horaLembrete = (String) entrada.readObject();
            JOptionPane.showMessageDialog(null,"Lembrar de " + lembrete.getNome());
            entrada.close();
            System.out.println("Conexão encerrada");
        }
        catch(Exception e) {
          System.out.println("Erro: " + e.getMessage());
        }
    }
}
