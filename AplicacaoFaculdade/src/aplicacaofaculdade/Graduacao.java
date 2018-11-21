/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaofaculdade;

/**
 *
 * @author cristian.araujo
 */
public class Graduacao extends Curso {
    private int numObg, numOpt;
    private static double taxa = 100;
   
    public Graduacao(String cod, String nome, String area, int numVagas, int numObg, int numOpt) {
        super(cod, nome, area, numVagas);
        this.numObg = numObg;
        this.numOpt = numOpt;
    }

    @Override
    public String toString(){
        return super.toString() + "/n" + "Numero total de disciplinas obrigatorias: " + numObg;
    }
    public static double getTaxa() {
        return taxa;
    }

    public static void setTaxa(double taxa) {
        Graduacao.taxa = taxa;
    }
    
    public int getNumObg() {
        return numObg;
    }

    public void setNumObg(int numObg) {
        this.numObg = numObg;
    }

    public int getNumOpt() {
        return numOpt;
    }

    public void setNumOpt(int numOpt) {
        this.numOpt = numOpt;
    }
    
}
