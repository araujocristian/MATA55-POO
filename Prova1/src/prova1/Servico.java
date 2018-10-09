package prova1;

/**
 *
 * @author cristian
 */
public class Servico {
    private String nome;
    private String descricao;
    private int duracao;
    private double preco;

    public Servico(String nome, String descricao, int duracao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.preco = preco;
    }

    public Servico(String nome, String descricao, double preco) {
        this(nome, descricao, 60, preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
