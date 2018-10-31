package servidor;

/**
 *
 * @author cristian
 */
import java.io.*;
import java.net.*;

public class Servidor {
    private static JogoVelha jogo = new JogoVelha('O');
    
    public static void main(String[] args) throws Exception {
        
        int porta = 6666;
        
        ServerSocket servidor = new ServerSocket(porta);
        
        
        while(true) {
            String situacaoTabuleiro;
            
            System.out.println("Esperando cliente...");
            Socket conexao = servidor.accept();
            System.out.println("Cliente Conectado...");
            
            BufferedReader entradaCliente = 
                    new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            
            DataOutputStream saidaCliente = new DataOutputStream(conexao.getOutputStream());
            
            System.out.println("Cadeias criadas...");
            
            jogo.criarTabuleiro();
            jogo.mostrarTabuleiro();
            
            while(true) {
                situacaoTabuleiro = jogo.jogada();
                
                saidaCliente.writeBytes(situacaoTabuleiro+"\n");
                
                if(jogo.vitoria())
                {
                    System.out.println("O servidor venceu!!");
                    break;
                }
                
                situacaoTabuleiro = entradaCliente.readLine();
                jogo.atualizarTabuleiro(situacaoTabuleiro);

                if(jogo.vitoria())
                {
                    System.out.println("O cliente venceu!!!");
                    break;
                }
            }
        }
    }
}