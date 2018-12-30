package clases;

import java.awt.Font;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class R {
    
    /***************************************************************************
     * Herramientas Fecha
     **************************************************************************/    
    
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
    
    /***************************************************************************
     * Herramientas de login y autentificación
     **************************************************************************/
    
    private static Empleado empleadoLogado;
    public static final Cliente CONTADO = new Cliente("Cliente","Contado","",0,"00000000","",Timestamp.valueOf(LocalDateTime.MIN));
    public static final Empleado SUPERVISOR = new Empleado("Supervisor","","",000000000,"12345678A");

    public static Empleado getEmpleadoLogado() {
        return empleadoLogado;
    }

    public static void setEmpleadoLogado(Empleado empleadoLogado) {
        R.empleadoLogado = empleadoLogado;
    }
    
    public static String hashWith256(String textToHash) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(R.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] byteOfTextToHash = textToHash.getBytes(StandardCharsets.UTF_8);
        byte[] hashedByetArray = digest.digest(byteOfTextToHash);
        String encoded = Base64.getEncoder().encodeToString(hashedByetArray);
        return encoded;
    }
    
    /***************************************************************************
     * Herramientas de texto
     **************************************************************************/
    
    public static final int REGULAR = 0;
    public static final int BOLD = 1;
    public static final int LIGHT = 2;
    public static final int CONDENSED = 3;
    public static final int MEDIUM = 4;
    public static final int BLACK = 5;
    
    public static final int PLAIN = 0;
    public static final int ITALIC = 2;
    
    
    public static Font fuenteRoboto(float size, int type, int style) {
        Fuentes fuenteSistema = new Fuentes();
        return fuenteSistema.fuenteRoboto(size, type, style);
    }
    
    public static final Font ESTANDAR() {
        return new Font("Arial", Font.PLAIN, 12);
    }
    
    /***************************************************************************
     * Herramientas de Impresión
     **************************************************************************/
    
    public static void impresion(ArrayList<Producto> lista, Factura factu, Empleado emp, Cliente cli) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new TicketImpresion(lista,factu,emp,cli));
        if (job.printDialog()){
            try{
                job.print();
            } catch (PrinterException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static String limitarModelo(String modelo) {
        if (modelo.length()>24) return modelo.substring(0, 23);
        else return modelo;
    }
    
}
