/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvfix6;


public class Carro extends TransporteTerrestre implements Motorizado, Conduzivel{
    private int numeroCilindrada;

    public Carro(int numeroCilindrada, String tipo, String nome, int numeroPassageiros, int velocidadeActual) {
        super(tipo, nome, numeroPassageiros, velocidadeActual);
        this.numeroCilindrada = numeroCilindrada;
    }
    
    @Override
    public boolean estaParado(){
        return (this.getVelocidadeActual() == 0);
    }
    
    @Override
    public void estacionar(){
        this.setVelocidadeActual(0);
    }
    
    public void embraiar(){
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
    
    public int getNumeroCilindrada() {
        return numeroCilindrada;
    }

    public void setNumeroCilindrada(int numeroCilindrada) {
        this.numeroCilindrada = numeroCilindrada;
    }
    
    
}
