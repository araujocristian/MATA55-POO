/*
*
* Protocolo Lembrete 
*/

package servidor;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Cristian Araujo
 */
public class Lembrete {

    public Lembrete() {}
    
    public LocalTime formatarHora(String hora){
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime horaLembrete = LocalTime.parse(hora, dtf);
        
        return horaLembrete;
    }
    
    public boolean alarmar(LocalTime hora){
        return hora.equals(LocalTime.now());
    }
    
    public void textoAlarmeAdd(LocalTime horaLembrete){
        System.out.println("\nLembrete Adicionado!");
        System.out.println("Horario: " + horaLembrete + "\n");
    }
}

