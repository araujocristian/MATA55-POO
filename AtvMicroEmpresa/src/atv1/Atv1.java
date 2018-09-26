/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv1;

/**
 *
 * @author guest-gueeki
 */
public class Atv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SetorPessoal Setor1= new SetorPessoal(100);
        
        Setor1.contratarFuncionario("Fulano", "Dept1", "Professor", 210, 1000.0);
        
        System.out.println(Setor1.funcionarios[0].getFuncao());
    }
    
}
