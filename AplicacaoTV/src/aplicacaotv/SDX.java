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
public class SDX extends TV implements ControleRemoto {
    
    public SDX(int tamanho) {
        super(tamanho);
    }
    
    @Override
    public void desligar(){
        this.setLigada(false);
        System.out.println("Tchau!");
    }

        @Override
    public void mudarCanal(int canal) {
        this.setCanal(canal);
    }

    @Override
    public void aumentarVolume() {
        this.setVolume(this.getVolume()+1);
    }

    @Override
    public void diminuirVolume() {
        this.setVolume(this.getVolume()-1);
    }

    @Override
    public void ligar() {
        this.setLigada(true);
    }
}
