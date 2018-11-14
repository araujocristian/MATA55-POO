package aplicacaoemprestimo;

public class ChefeDepartamento extends Funcionario{
    private String depto;
    public ChefeDepartamento(String nome, double salario, String depto){
        super(nome, salario);
        this.depto = depto;
    }
    public String toString(){
        return super.toString() + "\nDepartamento: " + depto;
    }
    public String qualDepto(){
        return this.depto;
    }
    @Override
    public double valorEmprestimo(){
        double emprestimo = 3 * super.qualSalario();
        return emprestimo;
    }    
}
