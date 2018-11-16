package bar;

/**
 *
 * @author cristian
 */
public class Pedido {
    private int numero, status;
    private Produto produto;

    public Pedido(int numero, Produto produto) {
        this.numero = numero;
        this.produto = produto;
        this.status = 0;
    }

    public Pedido(int numero, int status, Produto produto) {
        this(numero, produto);
        this.status = status;
    }
   
    public void servir() {
        setStatus(1);
    }
    
    public void cancelar() {
        setStatus(9);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }   
}
