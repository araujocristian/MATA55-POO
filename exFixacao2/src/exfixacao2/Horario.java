package exfixacao2;

/**
 *
 * @author cristian
 */
public class Horario {
    private int hora, minuto;

    public Horario() {
        this(00,00);
    }

    public Horario(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
