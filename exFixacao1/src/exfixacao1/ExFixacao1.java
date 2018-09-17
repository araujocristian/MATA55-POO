/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfixacao1;

/**
 *
 * @author cristian
 */
public class ExFixacao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cliente1 = new ContaCorrente(4520, 25, 0, 0, 200);
        
        System.out.println(cliente1.getDigV2());
    }
    
}
