package prova1;

/**
 *
 * @author cristian
 */
public class Carro {
    private String modelo;
    private String cor;
    private String categoria;

    public Carro(String modelo, String cor, String categoria) {
        this.modelo = modelo;
        this.cor = cor;
        this.categoria = categoria;
    }

    public Carro(String modelo, String cor) {
        this(modelo, cor, "médio");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
