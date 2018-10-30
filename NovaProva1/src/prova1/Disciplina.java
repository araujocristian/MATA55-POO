package prova1;

/**
 *
 * @author CRISTIAN
 */
public class Disciplina {
    private String codigo;
    private double nota;

    public Disciplina(String codigo, double nota) {
        this.codigo = codigo;
        this.nota = nota;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}
