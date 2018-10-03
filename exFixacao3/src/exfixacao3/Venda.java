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
        
        boolean isCliente = false;
        
        for(int i= 0; i < mercado.clientes.size(); i++) {
            if (mercado.clientes.get(i).getCodigo().equals(codigo)) {
                isCliente = true;
                cliente = mercado.clientes.get(i);
                break;
            }
        }
        
        if(isCliente){
           this.mercado = mercado;
           itemVenda = new ArrayList();
  
        } else {
            System.out.println("A venda não pode ser instanciada. Cliente não existe.");
        }
        
    }
    
    public void addItemVenda(String codigo, int quantidade) {
        if (mercado.getProduto(codigo) != null) {
            itemVenda.add(new ItemVenda(mercado.getProduto(codigo), quantidade));
        } else {
            System.out.println("Item não adicionado. Código não existente");
        }   
    }
    
    public void addItemVenda(String codigo) {
        addItemVenda(codigo, 1);  
    }
    
    public void removeItemVenda(int ordem){
        itemVenda.remove(ordem);
    }
    
    public void removeItemVenda(String codigo) {
        Produto itemRemovivel = mercado.getProduto(codigo);
        itemVenda.remove(itemRemovivel);
    }
    
    public double getPrecoTotal() {
        int sum = 0;
        for(int i=0; i < itemVenda.size(); i++) {
            sum += itemVenda.get(i).getProduto().getPreco();
        }
        
        return sum;
    }
    
}
