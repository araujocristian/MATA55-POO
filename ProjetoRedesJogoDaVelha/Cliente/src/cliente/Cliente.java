package cliente;

/**
 *
 * @author cristian
 */
import java.io.*;
import java.net.*;

public class Cliente {
    private static JogoVelha jogo = new JogoVelha('X');

    public static void main(String[] args) throws Exception {
        
        String host = "127.0.0.1";
        int porta = 6666;
        String situacaoTabuleiro;
        
        System.out.println("Rodando...");
        System.out.println("Conectando com servidor...");
        
        Socket socketCliente = new Socket(host, porta);
        System.out.println("Conectado...");
        
        System.out.println("Criando cadeias...");
        
        BufferedReader entradaServidor = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
        DataOutputStream saidaServidor = new DataOutputStream(socketCliente.getOutputStream());
        System.out.println("Cadeias criadas...");
        
        jogo.criarTabuleiro();
        
        while(true) {
            situacaoTabuleiro = entradaServidor.readLine();
            jogo.atualizarTabuleiro(situacaoTabuleiro);

            if(jogo.vitoria())
            {
                System.out.println("O servidor venceu!!!");
                break;
            }
            
            situacaoTabuleiro = jogo.jogada();
            
            saidaServidor.writeBytes(situacaoTabuleiro+"\n");
            
            if(jogo.vitoria())
            {
                System.out.println("O cliente venceu!!!");
                break;
            }
        }
        
        entradaServidor.close();
        saidaServidor.close();
        socketCliente.close();
    }
}