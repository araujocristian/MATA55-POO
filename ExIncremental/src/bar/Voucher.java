/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;


public class Voucher extends Pagamento {

    private double diaria;
    private int prazoPagamento;
    private String contaCorrente;

    public Voucher(double diaria, int prazoPagamento, String contaCorrente, int id, String nome, boolean ativo) {
        super(id, nome, ativo);
        this.diaria = diaria;
        this.prazoPagamento = prazoPagamento;
        this.contaCorrente = contaCorrente;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public int getPrazoPagamento() {
        return prazoPagamento;
    }

    public void setPrazoPagamento(int prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    
    
}
