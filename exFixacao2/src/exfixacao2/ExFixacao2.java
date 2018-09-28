package exfixacao2;

/**
 *
 * @author cristian
 */
public class ExFixacao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataHora data = new DataHora(21, 12, 1992);
        
        System.out.println(data.getDia());
        System.out.println(data.getMes());
        System.out.println(data.getAno());
        System.out.println(data.hora.getHora());
        data.ajustar(12, 8, 2008);
        System.out.println(data.getDia());
        System.out.println(data.getMes());
        System.out.println(data.getAno());
        
    }
    
}
