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
public class TV001 extends TV implements ControleRemoto{
    
    public TV001(int tamanho) {
        super(tamanho);
    }
    
    @Override
    public void desligar(){
        this.setLigada(false);
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
