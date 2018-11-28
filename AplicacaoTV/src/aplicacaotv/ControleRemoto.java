/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaotv;

/**
 *
 * @author cristian.araujo
 */
public interface ControleRemoto {
    void mudarCanal(int canal);
    void aumentarVolume();
    void diminuirVolume();
    void ligar();
    void desligar();
}
