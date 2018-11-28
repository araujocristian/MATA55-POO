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
public class AplicacaoTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TV001 tv1 = new TV001(42);
        SDX tv2 = new SDX(32);
        
        tv1.ligar();
        tv2.ligar();
        
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv2.aumentarVolume();
        tv2.aumentarVolume();
        
        tv1.diminuirVolume();
        tv2.diminuirVolume();
        
        tv1.desligar();
        tv2.desligar();
    }
    
}
