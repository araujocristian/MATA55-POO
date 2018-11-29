package bar;

import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Bar {
    private static ArrayList<Movimento> movimentos =  new ArrayList<>();
    private static ArrayList<Produto> produtos =  new ArrayList<>();
    private static ArrayList<Pagamento> pagamentos = new ArrayList<>();

    public Bar() {
    }
    
    public static void addMovimento(Movimento movimento) {
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
    
    public static void removeMovimento(int mesa) {
        for(Movimento m : movimentos) {
            if(m.getMesa() == mesa) movimentos.remove(m);
        }
        
    }
    
    public static void addProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public static void removeProduto(int codigo) {
        for(Produto p : produtos) {
            if(p.getCodigo() == codigo) produtos.remove(p);
        }
    }

    public void addPagamento(Pagamento e) {
        pagamentos.add(e);
    }

    public void removePagamento(int id) {
        for(Pagamento p : pagamentos) {
            if(p.getId() == id) pagamentos.remove(p);
        }
    }
    
    public static void ListaFormasPagamento(){
        for(Pagamento x : pagamentos){
            if(x instanceof Debito){
                Debito p = (Debito) x;
                System.out.println("Nome: " + p.getNome() + " ID: " + p.getId() + 
                        " Ativo: " + p.isAtivo() + " Taxa de retenção: " + 
                        p.getTaxaDeRetencao() + " Conta corrente: " + 
                        p.getContaCorrente());
            } else if(x instanceof Credito){
                Credito p = (Credito) x;
                System.out.println("Nome: " + p.getNome() + " ID: " + p.getId() + 
                        " Ativo: " + p.isAtivo() + " Taxa de retenção: " + 
                        p.getTaxaDeRetencao() + " Prazo de pagamento: " + 
                        p.getPrazoDePagamento());
            } else if(x instanceof Voucher){
                Voucher p = (Voucher) x;
                System.out.println("Nome: " + p.getNome() + " ID: " + p.getId() + 
                        " Ativo: " + p.isAtivo() + " Acrescente diária: " + 
                        p.getDiaria() + " Conta corrente: " + 
                        p.getContaCorrente());
            } else if(x instanceof Dinheiro){
                Dinheiro p = (Dinheiro) x;
                System.out.println("Nome: " + p.getNome() + " ID: " + p.getId() + 
                        " Ativo: " + p.isAtivo() + " Forma: " + 
                        p.getForma());
            }
        }
    }
    
}
