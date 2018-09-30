package exfixacao3;

import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Venda {
    Mercado mercado = new Mercado();
    Cliente cliente;
    ArrayList<ItemVenda> itemVenda;

    public Venda(Mercado mercado, String codigo) {
        this.mercado = mercado;
        itemVenda = new ArrayList();
        boolean isCliente = false;
        
        for(int i= 0; i < mercado.clientes.size(); i++) {
            if (mercado.clientes.get(i).getCodigo().equals(codigo)) {
                isCliente = true;
                cliente = mercado.clientes.get(i);
                break;
            }
        }
        
        if(isCliente){
            //A VENDA PODE SER INSTANCIADA ????
        } else {
            //A VENDA NAO PODE SER INSTANCIADA ??
        }
        
    }
    
    
    
    
}
