/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvfix6;

/**
 *
 * @author cristian
 */
public abstract class Transporte {
    private String nome;
    private int numeroPassageiros, velocidadeActual;

    public Transporte(String nome, int numeroPassageiros, int velocidadeActual) {
        this.nome = nome;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeActual = velocidadeActual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getVelocidadeActual() {
        return velocidadeActual;
    }

    public void setVelocidadeActual(int velocidadeActual) {
        this.velocidadeActual = velocidadeActual;
    }
        
    public boolean estaParado() { 
        return (velocidadeActual == 0);
    }
}
