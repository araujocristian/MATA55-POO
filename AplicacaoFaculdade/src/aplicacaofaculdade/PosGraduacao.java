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
public class PosGraduacao extends Curso {
    
    private int cargaMax;
    private static double taxa = 200;
    
    public PosGraduacao(String cod, String nome, String area, int numVagas, int cargaMax) {
        super(cod, nome, area, numVagas);
        this.cargaMax = cargaMax;
    }
    
    @Override
    public String toString(){
        return super.toString() + "/n" + "Carga Horaria do curso: " + cargaMax;
    }

    public static double getTaxa() {
        return taxa;
    }

    public static void setTaxa(double taxa) {
        PosGraduacao.taxa = taxa;
    }
    
    
    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
    
    
    
}
