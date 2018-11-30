/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvfix6;


public class Aviao extends TransporteAereo implements Motorizado, Conduzivel {
    private int numeroMotores;

    public Aviao(int numeroMotores, String nome, int numeroPassageiros, int velocidadeActual, int altitudeActual) {
        super(nome, numeroPassageiros, velocidadeActual, altitudeActual);
        this.numeroMotores = numeroMotores;
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

    
    @Override
    public void ligarMotor() {
        
    }

    @Override
    public void abastecer(int numLitros) {
        
    }

    @Override
    public void curvar(float angulo) {
        
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }
}
