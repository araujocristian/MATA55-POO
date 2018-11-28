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
public class Livro {
    private String titulo, autor;
    private short numeroDePaginas, anoDeEdicao;

    public Livro(String titulo, String autor, short numeroDePaginas, short anoDeEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDeEdicao = anoDeEdicao;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + ", anoDeEdicao=" + anoDeEdicao + '}';
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(short numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public short getAnoDeEdicao() {
        return anoDeEdicao;
    }

    public void setAnoDeEdicao(short anoDeEdicao) {
        this.anoDeEdicao = anoDeEdicao;
    }
    
    
}
