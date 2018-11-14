package aplicacaoemprestimo;

public class Pessoa
{
    private String nome;
    public Pessoa(String nome)
    {
        this.nome = nome;
    }
    @Override
    public String toString()
    {
        return "\nNome: " + nome;
    }
    public double valorEmprestimo(){
        return 1000.0;
    }
}
