package clases;

import java.util.Calendar;

/**
 *
 * @author Bryner
 */
public class ClaseTiempo {

    /**
     * @param args the command line arguments
     */
   Calendar calendario = Calendar.getInstance();
   
     String hora;
     String minuto;
     String segundo;

    public ClaseTiempo(String hora, String minuto, String segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public ClaseTiempo(String hora, String minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = "0";
    }
    public ClaseTiempo(String hora ) {
        this.hora = hora;
        this.minuto ="0";
        this.segundo ="0";
    }

    public Calendar getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }
    
    
    
    
    
    }
    
    
    
    

