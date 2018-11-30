/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvfix6;


public class Bicicleta extends TransporteTerrestre implements Conduzivel {
    private int numeroRaios;

    public Bicicleta(String tipo, String nome, int numeroPassageiros, int velocidadeActual, int numeroRaios) {
        super(tipo, nome, numeroPassageiros, velocidadeActual);
        this.numeroRaios = numeroRaios;
    }
    
    @Override
    public boolean estaParado(){
        return (this.getVelocidadeActual() == 0);
    }
    
    @Override
    public void estacionar(){
        this.setVelocidadeActual(0);
    }
    
    public void pedalar(){
        
    }

    @Override
    public void curvar(float angulo) {
        
    }
    
    public int getNumeroRaios() {
        return numeroRaios;
    }

    public void setNumeroRaios(int numeroRaios) {
        this.numeroRaios = numeroRaios;
    }
}