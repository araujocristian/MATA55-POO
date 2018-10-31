package cliente;

import java.io.Serializable;

/**
 *
 * @author cristian
 */
public class Lembrete implements Serializable {
    private String nome;
    private String hora;

    public Lembrete(String nome, String hora) {
        this.nome = nome;
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHora() {
        return hora;
    }

    public void setData(String hora) {
        this.hora = hora;
    }
    
    
}

