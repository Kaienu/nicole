package clases;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Util {
    
    public static final Timestamp FECHAVACIA = Timestamp.valueOf("1970-1-1 00:00:00");
    
    public static String fechaFormateada(Timestamp fecha) {
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return hourdateFormat.format(fecha);
    }
    
}
