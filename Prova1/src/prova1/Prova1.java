/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author cristian
 */
public class Prova1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro1 = new Carro("modelo1", "preto");
        Date date1 = new Date();
        Servico servico1 = new Servico("nome1","descri 1",50.45);
        Servico servico2 = new Servico("nome2","descri 2",40.45);
        
        ArrayList<Servico> servicos1 = new ArrayList();
        
        servicos1.add(servico1);
        servicos1.add(servico2);
        
        Agendamento agendamento1 = new Agendamento(carro1, date1, servicos1);
        
        System.out.println(agendamento1.PodeAgendar());
        System.out.println(agendamento1.PrecoTotal());
        
        
    }
    
}
