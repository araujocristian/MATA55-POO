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
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean emprestado;
    private String localizacao;
    public LivroDeBiblioteca(String titulo, String autor, short numeroDePaginas, short anoDeEdicao) {
        super(titulo, autor, numeroDePaginas, anoDeEdicao);
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public  String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
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
