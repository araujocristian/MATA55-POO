package servidor;

/**
 *
 * @author cristian
 */
import java.io.IOException;
import static java.lang.System.in;
import	java.net.*;
import java.util.Scanner;

public class Servidor	{
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");

        // VERIFICAR CLIENTE
        Socket cliente = servidor.accept();
        // imprime o ip do cliente
        System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
        
        //LER DADOS DO CLIENTE
        Scanner dados = new Scanner(cliente.getInputStream());
        while (dados.hasNextLine()) {
            System.out.println(dados.nextLine());
        }
        
        dados.close();
        cliente.close();
        servidor.close();
    }
}