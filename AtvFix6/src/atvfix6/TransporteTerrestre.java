/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvfix6;


public abstract class TransporteTerrestre extends Transporte {
    private String tipo;

    public TransporteTerrestre(String tipo, String nome, int numeroPassageiros, int velocidadeActual) {
        super(nome, numeroPassageiros, velocidadeActual);
        this.tipo = tipo;
    }
    
    public void estacionar(){
        this.setVelocidadeActual(0);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
