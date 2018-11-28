/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaomapa;

/**
 *
 * @author cristian.araujo
 */
public class Mapa {
    private String titulo, descricaoSumaria;
    private double escala;

    public Mapa(String titulo, String descricaoSumaria, double escala) {
        this.titulo = titulo;
        this.descricaoSumaria = descricaoSumaria;
        this.escala = escala;
    }
    
    @Override
    public String toString(){
        return ("Titulo: " + titulo + "\n" + "Descrição Sumária: " + 
                descricaoSumaria + "\n" + "Escala" + escala);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricaoSumaria() {
        return descricaoSumaria;
    }

    public void setDescricaoSumaria(String descricaoSumaria) {
        this.descricaoSumaria = descricaoSumaria;
    }

    public double getEscala() {
        return escala;
    }

    public void setEscala(double escala) {
        this.escala = escala;
    }
    
    
}
