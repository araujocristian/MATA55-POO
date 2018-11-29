/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;


public class Credito extends Pagamento {
    private double taxaDeRetencao;
    private int prazoDePagamento;
    
    public Credito(double taxaDeRetencao, int prazoDePagamento, int id, String nome, boolean ativo) {
        super(id, nome, ativo);
        this.taxaDeRetencao = taxaDeRetencao;
        this.prazoDePagamento = prazoDePagamento;
    }

    public double getTaxaDeRetencao() {
        return taxaDeRetencao;
    }

    public void setTaxaDeRetencao(double taxaDeRetencao) {
        this.taxaDeRetencao = taxaDeRetencao;
    }

    public int getPrazoDePagamento() {
        return prazoDePagamento;
    }

    public void setPrazoDePagamento(int prazoDePagamento) {
        this.prazoDePagamento = prazoDePagamento;
    }
    
    
    
}
