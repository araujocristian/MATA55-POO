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
        
        // cria variaveis de entrada e saida
        ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
        ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
        
        // cria Array de horas de lembretes
        ArrayList<LocalTime> horaLembretes = new ArrayList<LocalTime>();
        String clienteDado = "";
        
        // armazena dados do cliente
        while(true){            
            clienteDado = (String) entrada.readObject();
            
            if(clienteDado.equals("f")) break;

            DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
            LocalTime horaLembrete = LocalTime.parse(clienteDado, dtf);

            horaLembretes.add(horaLembrete);
            System.out.println("\nLembrete Adicionado!");
            System.out.println("Horario: " + horaLembrete + "\n");
        }
        
        while(true){
            for(LocalTime h: horaLembretes){
                if(h.equals(LocalTime.now())){
                    saida.flush();
                    saida.writeObject(h);
                    horaLembretes.remove(h);
                }
            }
            
            if(horaLembretes.isEmpty()) saida.close();
        }
      }  
    }   
    catch(Exception e) {
       System.out.println("Erro: " + e.getMessage());
    }
  }   
    
}
