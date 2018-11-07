package atvfix5;

/**
 *
 * @author cristian.araujo
 */
public class Revista extends Titulo{
    private String periodicidade;
    
    public Revista(String nome, String editora, double preco, String periodicidade) {
        super(nome, editora, preco);
        this.periodicidade = periodicidade;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
    
    public boolean verificarMesmaEditora(Revista r1){
        return r1.getEditora().equals(this.getEditora());
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nPeriodicidade: "+periodicidade;
    }
}
