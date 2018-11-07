/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvfix5;

/**
 *
 * @author cristian.araujo
 */
public class Titulo {
    private String nome, editora;
    private double preco;
    
    public Titulo(String nome, String editora, double preco) {
        this.nome = nome;
        this.editora = editora;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\nEditora: "+editora+" "+ "\nPreço:"+preco;
    }

    
    
}
