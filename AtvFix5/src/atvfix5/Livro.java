package atvfix5;

/**
 *
 * @author cristian.araujo
 */
public class Livro extends Titulo{
    private String autor, resumo;

    public Livro(String nome,String autor, String editora, String resumo, double preco) {
        super(nome, editora, preco);
        this.autor = autor;
        this.resumo = resumo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String consultarResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nAutor: "+autor+"\nResumo: "+resumo;
    }
    
}
