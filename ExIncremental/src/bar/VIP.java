package bar;

/**
 *
 * @author cristian
 */
public class VIP extends Especial{
    private double limite;
    private String gerente; 

    public VIP(int ID, int tipo, int categoria, String nome, 
            String endereco, String telefone, String email, char sexo,
            double limite, String gerente) {
        super(ID, tipo, categoria, nome, endereco, telefone, email, sexo);
        this.limite = limite;
        this.gerente = gerente;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    
}
