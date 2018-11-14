package aplicacaoemprestimo;

public class Funcionario extends Pessoa
{
    private double salario;
    public Funcionario(String nome, double salario){
    super(nome);
    this.salario = salario;
    }
    @Override
    public String toString(){
        return super.toString() + "\nSalario: " + salario;
    }
    public double qualSalario(){
        return this.salario;
    }
    @Override
    public double valorEmprestimo(){
        double emprestimo = 2 * this.salario;
        return emprestimo;
    }    
}