package atv1;

/**
 *
 * @author guest-gueeki
 */
public class SetorPessoal {
    Funcionario[] funcionarios;
    int quantDeFuncionarios = 0;

    public SetorPessoal(int quant) {
        funcionarios = new Funcionario[quant];
    }    
    
    public void contratarFuncionario(Funcionario funcionario) {
        if(quantDeFuncionarios < funcionarios.length){
            funcionarios[quantDeFuncionarios] = funcionario;
            quantDeFuncionarios++;
        }
    }
    
    public void contratarFuncionario(String nome, String depto, String funcao, int numMat, double sal){
        if(quantDeFuncionarios < funcionarios.length){
            funcionarios[quantDeFuncionarios] = new Funcionario(sal, numMat, funcao, depto, nome);
            quantDeFuncionarios++;
        }
    }
    
}
