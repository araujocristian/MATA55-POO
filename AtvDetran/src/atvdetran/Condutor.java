package atvdetran;

/**
 *
 * @author cristian
 */
public class Condutor {
    private String nome, rg, cpf;
    private Carteira carteira;

    public Condutor(String nome, String rg, String cpf, Carteira carteira) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.carteira = carteira;
    }
    
    public Condutor(String nome, String rg, String cpf, int numero, int pontos, String status, String categoria) {
        this.carteira = new Carteira(numero, pontos, status, categoria);
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Condutor(String nome, String rg, String cpf) {
        this(nome, rg, cpf, null);
    }
    
    public boolean isCancelada() {
        return carteira.getPontos() > 30;
    }
    
    public void incluirPontos(int pontos) {
        carteira.setPontos(carteira.getPontos() + pontos);
    }
    
    public void modificarCategoria(String categoria){
        carteira.setCategoria(categoria);
    }
    
    public int consultarPontos(){
        return carteira.getPontos();
    }
    
}
