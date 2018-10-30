package exincremental;

/**
 *
 * @author cristian
 */
public class Produto {
    private int codigo, tipo;
    private String nome;
    private double preco;
    private boolean disponibilidade;

    public Produto(int codigo, int tipo, String nome) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nome = nome;
    }

    public Produto(int codigo, int tipo, String nome, double preco, boolean disponibilidade) {
        
        this(codigo, tipo, nome);
        this.preco = preco;
        this.disponibilidade = disponibilidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
}
