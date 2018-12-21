package clases;

import java.awt.*;
import java.awt.print.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TicketImpresion implements Printable {

    private ArrayList<Producto> ticket;
    private final String denom = "Centro de Peluquería y Estética Nicole";
    private final String cif = "CIF: 30263512C";
    private final String direccion = "Torreblascopedro nº2, 41016 Sevilla";
    private final String tlf = "Tlf: 640 727 831";
    
    public String fechaActual(){
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return hourdateFormat.format(date);
    }
    
    public TicketImpresion(ArrayList<Producto> ticket){
        this.ticket = ticket;
    }
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        String cabeceraTabla = "CANT   ARTÍCULO                    PRECIO   IMPORTE";
        Font titulo = new Font("Lucida Sans Typewriter", Font.BOLD, 12);
        Font cuerpo = new Font("Lucida Sans Typewriter", Font.PLAIN, 10);
        int linea = 130;
        if (pageIndex == 0) {
            graphics.setFont(titulo);
            graphics.drawString(denom, 50, 25);
            graphics.setFont(cuerpo);
            graphics.drawString(cif, 50, 45);
            graphics.drawString(direccion, 50, 60);
            graphics.drawString(tlf, 50, 75);
            graphics.drawString(fechaActual(), 50, 90);
            graphics.drawString(cabeceraTabla, 50, 115);
            for (Producto p : ticket){
                graphics.drawString(descripcionProd(p), 50, linea);
                linea = Integer.sum(linea, 15);
            }
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }
    
    public String descripcionProd (Producto prod) {
        String cantidad = String.format("%02d", prod.getCount());
        String detalle = " ";
        detalle = detalle + cantidad;
        detalle = detalle + " " + prod.getModelo() + " ";
        for (int saltos = detalle.length(); saltos<32; saltos++) {
            detalle = detalle + " ";
        }
        String precio = prod.getPrecioUnitario().toEngineeringString()+"€";
        switch (precio.length()) {
            case 5:
                detalle = detalle + "    ";
                break;
            default:
                detalle = detalle + "   ";
                break;
        }
        detalle = detalle + prod.getPrecioUnitario().toEngineeringString()+"€";
        for (int saltos = detalle.length(); saltos<42; saltos++) {
            detalle = detalle + " ";
        }
        String total = prod.getPrecioTotalAcumulado().toEngineeringString() + "€";
        switch (total.length()) {
            case 5:
                detalle = detalle + "    ";
                break;
            case 7:
                detalle = detalle + "  ";
                break;
            default:
                detalle = detalle + "   ";
                break;
        }
        detalle = detalle + total;
        return detalle;
    }
    
}
