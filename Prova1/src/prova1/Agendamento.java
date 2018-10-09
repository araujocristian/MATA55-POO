package prova1;

import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author cristian
 */
public class Agendamento {
    private Carro carro;
    private Date data;
    private ArrayList<Servico> servicos;

    public Agendamento(Carro carro, Date data, ArrayList<Servico> servicos) {
        this.carro = carro;
        this.data = data;
        this.servicos = servicos;
        
        //servicos.add(servico);
    }
    
    public void AlterarData(Date novaData){
        if(this.data.after(novaData)){
            this.data = novaData;
        }
    }
    
    public boolean PodeAgendar(){
        int totalDuracao = 0;
        for(Servico s : servicos){
            totalDuracao += s.getDuracao();
        }
        
        return totalDuracao <= 120;
    }
    
    public double PrecoTotal(){
        double precoTotal = 0;
    
        if(carro.getCategoria().equals("pequeno")){
            for(Servico s : servicos){
            precoTotal += s.getPreco();
            } 
        } else if(carro.getCategoria().equals("médio")){
            for(Servico s : servicos){
            precoTotal += s.getPreco();
            }
            precoTotal = precoTotal +  precoTotal*0.30;

        } else if(carro.getCategoria().equals("grande")){
            for(Servico s : servicos){
            precoTotal += s.getPreco();
            }
            precoTotal = precoTotal +  precoTotal*0.50;
        }
        
        return precoTotal;
    }
}
