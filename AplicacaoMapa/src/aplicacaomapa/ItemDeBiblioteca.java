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
public interface ItemDeBiblioteca {
    public final static int maximoDeDiasParaEmprestimo = 14;
    public void empresta();
    public void devolve();
    String descricao();
}
