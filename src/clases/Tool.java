package clases;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tool {
    
    /**
     * Herramientas Fecha
     */    
    
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
    
    /**
     * Herramientas de login y autentificación
     */
    
    private static Empleado empleadoLogado;

    public static Empleado getEmpleadoLogado() {
        return empleadoLogado;
    }

    public static void setEmpleadoLogado(Empleado empleadoLogado) {
        Tool.empleadoLogado = empleadoLogado;
    }
    
    public static String hashWith256(String textToHash) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Tool.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] byteOfTextToHash = textToHash.getBytes(StandardCharsets.UTF_8);
        byte[] hashedByetArray = digest.digest(byteOfTextToHash);
        String encoded = Base64.getEncoder().encodeToString(hashedByetArray);
        return encoded;
    }
    
}
