package bar;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author cristian
 */
public class Movimento {
    private int mesa, status;
    private Calendar dataAbertura, dataFechamento;
    private Pedido[] pedidos;
    private ArrayList<Cliente> clientes = new ArrayList<>(); 

    public Movimento(Calendar dataAbertura, int mesa) {
        this.mesa = mesa;
        this.dataAbertura = dataAbertura;
        this.status = 0;
    }
    
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void removeCliente(int ID){
        for(Cliente c : clientes) {
            if(c.getID() == ID) clientes.remove(c);
        }
    }
    
    public void pagar(Calendar dataFechamento) {
        setDataFechamento(dataFechamento);
        setStatus(1);
    }
    
    public void fechar(Calendar dataFechamento) {
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

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Calendar getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Calendar dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
    
    
}
