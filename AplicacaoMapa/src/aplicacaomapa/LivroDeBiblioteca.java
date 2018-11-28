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

    public LivroDeBiblioteca(String titulo, String autor, short numeroDePaginas, short anoDeEdicao) {
        super(titulo, autor, numeroDePaginas, anoDeEdicao);
    }

    @Override
    public void empresta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void devolve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String descricao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
