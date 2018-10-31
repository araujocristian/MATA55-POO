/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author cristian
 */
import java.io.*;

public class JogoVelha {
    private char[][] tabuleiro = new char[3][3];
    private char jogador;
    
    public JogoVelha() {}
    
    public JogoVelha(char jogador) {
        this.jogador = jogador;
    }
    
    public void criarTabuleiro() {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                tabuleiro[i][j] = ' ';
    }
    
    public void mostrarTabuleiro() {
        System.out.println("O tabuleiro segue esquema abaixo: \n");
        
        for(int i=1;i<10;i++)
                if((i==3)||(i==6))
                    System.out.println(i+"\n----------");
                else if(i==9)
                    System.out.println(i);
                else
                    System.out.print(i+" | ");
        
        
        System.out.println("\n\nTabuleiro atual: ");
        
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if((i==0 && j==2)||(i==1 && j==2))
                    System.out.println(tabuleiro[i][j]+"\n----------");
                else if (i==2 && j==2)
                    System.out.println(tabuleiro[i][j]);
                else
                    System.out.print(tabuleiro[i][j]+" | ");
    }
    
    public String jogada() throws Exception {
        BufferedReader doUsuario = new BufferedReader(new InputStreamReader(System.in));
        String situacaoTabuleiro = "";
        String jogada;
        int jogadaInt; 
                
            do {
                System.out.print("Escolha a sua prÃ³xima jogada(1 a 9, 0 termina o jogo): ");
                jogada = doUsuario.readLine();
                try {
                    jogadaInt = Integer.parseInt(jogada);

                    if (Integer.signum(jogadaInt) == -1) {
                        jogadaInt = 10;
                        System.out.println("Essa jogada nÃ£o Ã© vÃ¡lida. Jogue Novamente.");
                    } else if(jogadaInt == 0)
                    {
                        System.exit(0);
                    }

                } catch (NumberFormatException e) {
                    jogadaInt = 10;
                    System.out.println("Essa jogada nÃ£o Ã© vÃ¡lida. Jogue Novamente.");
                }
            } while (jogadaInt > 9);

        switch (jogadaInt) {
            case (1):
                tabuleiro[0][0] = jogador;
                break;
            case (2):
                tabuleiro[0][1] = jogador;
                break;
            case (3):
                tabuleiro[0][2] = jogador;
                break;
            case (4):
                tabuleiro[1][0] = jogador;
                break;
            case (5):
                tabuleiro[1][1] = jogador;
                break;
            case (6):
                tabuleiro[1][2] = jogador;
                break;
            case (7):
                tabuleiro[2][0] = jogador;
                break;
            case (8):
                tabuleiro[2][1] = jogador;
                break;
            case (9):
                tabuleiro[2][2] = jogador;
                break;
        }

        mostrarTabuleiro();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                situacaoTabuleiro += tabuleiro[i][j];
            }
        }
        
        return situacaoTabuleiro;
    }
    
    public void atualizarTabuleiro(String situacao) {
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = situacao.charAt(cont);
                cont++;
            }
        }
        
        mostrarTabuleiro();
    }
    
    public boolean vitoria() {
        if(tabuleiro[0][0]!=' ' && tabuleiro[0][0]==tabuleiro[0][1] && tabuleiro[0][1]==tabuleiro[0][2])
            return true;
        else if (tabuleiro[1][0]!=' ' && tabuleiro[1][0]==tabuleiro[1][1] && tabuleiro[1][1]==tabuleiro[1][2])
            return true;
        else if (tabuleiro[2][0]!=' ' && tabuleiro[2][0]==tabuleiro[2][1] && tabuleiro[2][1]==tabuleiro[2][2])
            return true;
        else if (tabuleiro[0][0]!=' ' && tabuleiro[0][0]==tabuleiro[1][0] && tabuleiro[1][0]==tabuleiro[2][0])
            return true;
        else if (tabuleiro[0][1]!=' ' && tabuleiro[0][1]==tabuleiro[1][1] && tabuleiro[1][1]==tabuleiro[2][1])
            return true;
        else if (tabuleiro[0][2]!=' ' && tabuleiro[0][2]==tabuleiro[1][2] && tabuleiro[1][2]==tabuleiro[2][2])
            return true;
        else if (tabuleiro[0][0]!=' ' && tabuleiro[0][0]==tabuleiro[1][1] && tabuleiro[1][1]==tabuleiro[2][2])
            return true;
        else if (tabuleiro[0][2]!=' ' && tabuleiro[0][2]==tabuleiro[1][1] && tabuleiro[1][1]==tabuleiro[2][0])
            return true;
        
        return false;
    }
}