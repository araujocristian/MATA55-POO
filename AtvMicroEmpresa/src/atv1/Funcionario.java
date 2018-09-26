package atv1;

/**
 *
 * @author guest-gueeki
 */
public class Funcionario {
    double salario;
    int numMat;
    String funcao, depto, nome;

    public Funcionario(double salario, int numMat, String funcao, String depto, String nome) {
        this.salario = salario;
        this.numMat = numMat;
        this.funcao = funcao;
        this.depto = depto;
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumMat() {
        return numMat;
    }

    public void setNumMat(int numMat) {
        this.numMat = numMat;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
