package bar;

import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Bar {
    private static ArrayList<Movimento> movimentos =  new ArrayList<>();
    private static ArrayList<Produto> produtos =  new ArrayList<>();
    
    public static void AddMovimento(Movimento movimento) {
        for(Movimento m : movimentos) {
            if(m.getMesa() == movimento.getMesa()){
                if(m.getStatus()== 9) {
                    movimentos.add(movimento);
                }
            } else {
                movimentos.add(movimento);
            }
        }
    }
    
    public static void RemoveMovimento(int mesa) {
        for(Movimento m : movimentos) {
            if(m.getMesa() == mesa) movimentos.remove(m);
        }
        
    }
    
    public static void AddProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public static void RemoveProduto(int codigo) {
        for(Produto p : produtos) {
            if(p.getCodigo() == codigo) produtos.remove(p);
        }
    }
    
}
