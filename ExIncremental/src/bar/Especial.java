package bar;

/**
 *
 * @author cristian.araujo
 */
public class Especial extends Cliente {
    
    private String endereco, telefone, email;
    private char sexo;
    
    public Especial(int ID, int tipo, int categoria, String nome, String endereco, String telefone, String email, char sexo) {
        super(ID, tipo, categoria, nome);
        this.email = email;
        this.endereco = endereco;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
