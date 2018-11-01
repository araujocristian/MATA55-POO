package cliente;

import java.io.Serializable;
import java.time.LocalTime;

/**
 *
 * @author Cristian Araujo
 */
public class Lembrete implements Serializable {
    private String nome;
    private LocalTime hora;

    public Lembrete(String nome, LocalTime hora) {
        this.nome = nome;
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setData(LocalTime hora) {
        this.hora = hora;
    }
    
    
}

