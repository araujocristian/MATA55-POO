package exfixacao3;

import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Mercado {
    ArrayList<Cliente> clientes;
    ArrayList<Produto> produtos;


    public Mercado() {
        produtos = new ArrayList();
        clientes = new ArrayList();
    }

    public boolean addProduto(Produto produto) {
        return produtos.add(produto);
    }

    public boolean addCliente(Cliente cliente) {
        return clientes.add(cliente);
    }

    public boolean removeProduto(Produto produto) {
        return produtos.remove(produto);
    }

    public boolean removeCliente(Cliente cliente) {
        return clientes.remove(cliente);
    }
    
    
}
