/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvfix6;


public abstract class TransporteAereo extends Transporte {
    private int altitudeActual;
    
    public TransporteAereo(String nome, int numeroPassageiros, int velocidadeActual, int altitudeActual) {
        super(nome, numeroPassageiros, velocidadeActual);
        this.altitudeActual = altitudeActual;
    }
    
    public void subir(int metros) {
        this.altitudeActual = this.altitudeActual + metros;
    }
    
    public void descer(int metros) {
        this.altitudeActual = this.altitudeActual - metros;
    }

    public int getAltitudeActual() {
        return altitudeActual;
    }

    public void setAltitudeActual(int altitudeActual) {
        this.altitudeActual = altitudeActual;
    }
    
    
}
