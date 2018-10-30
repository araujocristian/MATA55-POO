package exincremental;

import java.util.Calendar;

/**
 *
 * @author cristian
 */
public class Movimento {
    private int mesa, status;
    private java.util.Calendar dataAbertura, dataFechamento;
    private Pedido[] pedidos;

    public Movimento(java.util.Calendar dataAbertura, int mesa) {
        this.mesa = mesa;
        this.dataAbertura = dataAbertura;
        this.status = 0;
    }
    
    public void pagar(java.util.Calendar dataFechamento) {
        setDataFechamento(dataFechamento);
        setStatus(1);
    }
    
    public void fechar(java.util.Calendar dataFechamento) {
        setDataFechamento(dataFechamento);
        setStatus(9);
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public java.util.Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(java.util.Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public java.util.Calendar getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(java.util.Calendar dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
    
    
}
