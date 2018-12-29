package clases;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Util {
    
    public static final Timestamp FECHAVACIA = Timestamp.valueOf("1970-1-1 00:00:00");
    public static final Timestamp FECHAERROR = Timestamp.valueOf("1971-1-1 00:00:00");
        
    public static String fechaFormateada(Timestamp fecha) {
        if (fecha.equals(FECHAVACIA)){
            return "Nunca";
        } else if (fecha.equals(FECHAERROR)){
            return "##ERROR##";
        } else {
            DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            return hourdateFormat.format(fecha);   
        }
    }
    
    public static String fechaFormateadaCorta(Timestamp fecha) {
        if (fecha.equals(FECHAVACIA)){
            return "Nunca";
        } else if (fecha.equals(FECHAERROR)){
            return "##ERROR##";
        } else {
            DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return hourdateFormat.format(fecha);   
        }
    }
    
}
