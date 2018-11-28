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
public class MapaDeBiblioteca extends Mapa implements ItemDeBiblioteca {
    private boolean emprestado;
    private static String localizacao = "Mapoteca";
    
    public MapaDeBiblioteca(String titulo, String descricaoSumaria, double escala) {
        super(titulo, descricaoSumaria, escala);
        this.setEmprestado(false);
    }
                
    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public static String getLocalizacao() {
        return localizacao;
    }

    public static void setLocalizacao(String localizacao) {
        MapaDeBiblioteca.localizacao = localizacao;
    }
    
    @Override
    public void empresta() {
        setEmprestado(true);
    }

    @Override
    public void devolve() {
        setEmprestado(false);
    }

    @Override
    public String descricao() {
        return super.toString()+"Emprestado: " + emprestado + "\n" + "Localização: " + localizacao;
        
    }
    
}
