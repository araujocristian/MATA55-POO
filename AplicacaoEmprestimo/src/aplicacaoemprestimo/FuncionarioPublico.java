package aplicacaoemprestimo;

public class FuncionarioPublico extends Funcionario{
    private String orgao;
    public FuncionarioPublico(String nome, double salario, String orgao){
        super(nome, salario);
        this.orgao = orgao;
    }
    public String toString(){
        return super.toString() + "\nOrgao: " + orgao;
    }
    public String qualOrgao(){
        return this.orgao;
    }
    @Override
    public double valorEmprestimo(){
        double emprestimo = 1.5 * super.qualSalario();
        return emprestimo;
    }    
}
