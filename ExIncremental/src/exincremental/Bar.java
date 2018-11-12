package exincremental;

import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Bar {
    private static ArrayList<Movimento> movimentos =  new ArrayList<>();
    private static ArrayList<Produto> produtos =  new ArrayList<>();
    
    public static void AddMovimento(Movimento movimento) {
        /**
         *Não é permitida a criação de objetos de Movimento nesta coleção de objetos com um número de mesa já
         *existente ou, caso já exista, com o status diferente de 9 (encerrada). Ou seja, para criar é preciso ter
         *certeza que não existe nenhum movimento para àquela mesa e, se existir, já esteja encerrado.
         */
    }
    
    public static void RemoveMovimento(int mesa) {
        
    }
    
    public static void AddProduto(Produto produto) {
        
    }
    
    public static void RemoveProduto(int codigo) {
        
    }
    
}
