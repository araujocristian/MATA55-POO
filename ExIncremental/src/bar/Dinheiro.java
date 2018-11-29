/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;


public class Dinheiro extends Pagamento {
    private int forma; 

    public Dinheiro(int forma, int id, String nome, boolean ativo) {
        super(id, nome, ativo);
        this.forma = forma;
    }

    public int getForma() {
        return forma;
    }

    public void setForma(int forma) {
        this.forma = forma;
    }
     
    
}
