/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;


public class Debito extends Pagamento {
    
    private double taxaDeRetencao;
    private String contaCorrente;

    public Debito(double taxaDeRetencao, String contaCorrente, int id, String nome, boolean ativo) {
        super(id, nome, ativo);
        this.taxaDeRetencao = taxaDeRetencao;
        this.contaCorrente = contaCorrente;
    }

    public double getTaxaDeRetencao() {
        return taxaDeRetencao;
    }

    public void setTaxaDeRetenção(double taxaDeRetencao) {
        this.taxaDeRetencao = taxaDeRetencao;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    
    
}
