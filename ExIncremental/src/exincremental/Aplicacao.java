package exincremental;
import java.util.Calendar;

/**
 *
 * @author Cristian Araujo
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Produto produto1 = new Produto(25,0,"Sabão");
        Pedido pedido1 = new Pedido(1,produto1);
        Movimento movimento1 = new Movimento(c,10);
        System.out.println("Data e Hora atual:"+c.getTime());
        
        System.out.println(produto1.getNome());
        System.out.println(pedido1.getStatus());
        System.out.println(movimento1.getDataAbertura());
        
    }
    
}
