/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaofaculdade;

import java.util.ArrayList;

/**
 *
 * @author cristian.araujo
 */
public class AplicacaoFaculdade {
    private ArrayList<Curso> cursos = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void criarGraduaçao(String cod, String nome, String area, int numVagas, int numObg, int numOpt){
        Graduacao g1 = new Graduacao(cod, nome, area, numVagas, numObg, numOpt);
        cursos.add(g1);
    }
    
    public void criarPosGraduaçao(String cod, String nome, String area, int numVagas, int cargaMax){
        PosGraduacao pg1 = new PosGraduacao(cod, nome, area, numVagas, cargaMax);
        cursos.add(pg1);
    }
    
    public void buscarCurso(String cod){
        for(Curso curso: cursos ){
            if(curso.getCod().equals(cod)){
                curso.toString();
            }
        }
    }
    
    public double consultarPreco(String cod){
        double taxa = 0;
        for(Curso curso: cursos ){
            if(curso.getCod().equals(cod)){
                if(curso instanceof Graduacao){
                    taxa = Graduacao.getTaxa()*0.10;
                } else {
                    taxa = PosGraduacao.getTaxa()*0.05;
                }
            }
        }
        
        return taxa;
    }
    
}
