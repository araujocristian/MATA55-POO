package atvdetran;

/**
 *
 * @author cristian
 */
public class Carteira {
    private int numero, pontos;
    private String status, categoria;

    public Carteira(int numero, int pontos, String status, String categoria) {
        this.numero = numero;
        this.pontos = pontos;
        this.status = status;
        this.categoria = categoria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
