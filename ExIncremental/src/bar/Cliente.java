package bar;

/**
 *
 * @author cristian.araujo
 */
public class Cliente {
    private int ID, tipo, categoria;
    private String nome;

    public Cliente(int ID, int tipo, int categoria, String nome) {
        this.ID = ID;
        this.tipo = tipo;
        this.categoria = categoria;
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
