/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvfix6;


public class Balao extends TransporteAereo {

    private int pesoLargada;

    public Balao(int pesoLargada, String nome, int numeroPassageiros, int velocidadeActual, int altitudeActual) {
        super(nome, numeroPassageiros, velocidadeActual, altitudeActual);
        this.pesoLargada = pesoLargada;
    }

    public int getPesoLargada() {
        return pesoLargada;
    }

    public void setPesoLargada(int pesoLargada) {
        this.pesoLargada = pesoLargada;
    }
    
    @Override
    public boolean estaParado(){
        return (this.getVelocidadeActual() == 0);
    }
    
    @Override
    public void subir(int metros) {
        this.setAltitudeActual(getAltitudeActual() + metros);
    }
    
    @Override
    public void descer(int metros) {
        this.setAltitudeActual(getAltitudeActual() - metros);
    }
    
    public void largarPeso(float peso){
    }
    
    public void aquecerAr(float temp){
        
    }
    
}
