
package aplicacaofaculdade;

/**
 *
 * @author cristian.araujo
 */
public abstract class Curso {
    private String cod, nome, area;
    private int numVagas;

    public Curso(String cod, String nome, String area, int numVagas) {
        this.cod = cod;
        this.nome = nome;
        this.area = area;
        this.numVagas = numVagas;
    }
    
    @Override
    public String toString(){
        return nome;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }
}
