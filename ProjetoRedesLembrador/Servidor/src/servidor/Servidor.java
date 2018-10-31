package servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
      // Instancia o ServerSocket ouvindo a porta 12345
      ServerSocket servidor = new ServerSocket(12345);
      System.out.println("Servidor ouvindo a porta 12345");
      while(true) {
        // o método accept() bloqueia a execução até que o servidor receba um pedido de conexão
        Socket cliente = servidor.accept();
        System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
        
        ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
        ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
        
        ArrayList<LocalTime> lembretes = new ArrayList<LocalTime>();
        
        String horaLembrete = (String) entrada.readObject();
        
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime horaLembreteFormatada = LocalTime.parse(horaLembrete, dtf);
        
        lembretes.add(horaLembreteFormatada);
        
        while(!horaLembreteFormatada.equals(LocalTime.now())){
                
        }
        
        saida.flush();
        saida.writeObject(horaLembrete);
        saida.close();
        cliente.close();

      }  
    }   
    catch(Exception e) {
       System.out.println("Erro: " + e.getMessage());
    }
  }   
    
}
