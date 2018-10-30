package atvfix4_2;

/**
 *
 * @author ime
 */
public class AtvFix4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("7859", 5);
        ContaCorrente cc2 = new ContaCorrente("7853", 5);
        
        System.out.println(ContaCorrente.getNumContas());
        cc1.debitar(500);
        cc2.creditar(800);
        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());
    }
    
}
