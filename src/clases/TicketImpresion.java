package clases;

import java.awt.*;
import java.awt.print.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TicketImpresion implements Printable {

    private ArrayList<String> ticket;
    private final String denom = "Centro de Peluquería y Estética Nicole";
    private final String cif = "CIF: 30263512C";
    private final String direccion = "Torreblascopedro nº2, 41016 Sevilla";
    private final String tlf = "Tlf: 640 727 831";
    private int linea = 110;
    
    public String fechaActual(){
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return hourdateFormat.format(date);
    }
    
    public TicketImpresion(ArrayList<String> ticket){
        this.ticket = ticket;
    }
    
    public int siguienteLinea(int linea){
        this.linea = linea + 15;
        return this.linea;
    }
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            graphics.drawString(denom, 15, 30);
            graphics.drawString(cif, 15, 45);
            graphics.drawString(direccion, 15, 60);
            graphics.drawString(tlf, 15, 75);
            graphics.drawString(fechaActual(), 15, 90);
            for (String s : ticket){
                graphics.drawString(s, 15, siguienteLinea(linea));
            }
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }
    
}
