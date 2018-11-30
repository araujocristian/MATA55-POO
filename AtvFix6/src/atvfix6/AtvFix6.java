/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvfix6;

/**
 *
 * @author cristian
 */
public class AtvFix6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aviao a1 = new Aviao(1000, "VASP", 200, 300, 4);
        Balao b1 = new Balao(1000, "Balao", 10, 20, 100);
        Carro c1 = new Carro(1000, "Sedan", "Logan", 4, 30);
        Bicicleta b2 = new Bicicleta("Comum", "BMX", 2, 20, 15);
        
        a1.abastecer(150);
        a1.ligarMotor();
        
        c1.abastecer(20);
        c1.ligarMotor();
        
        a1.curvar(20);
        c1.curvar(15);
        b2.curvar(10);    }
    
}
