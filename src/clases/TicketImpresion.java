package clases;

import java.awt.*;
import java.awt.print.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicketImpresion implements Printable {
    private Factura factu;

    private ArrayList<Producto> ticket;
    private final String denom = "Centro de Peluquería y Estética Nicole";
    private final String cif = "CIF: 30263512C";
    private final String direccion = "Torreblascopedro nº2, 41016 Sevilla";
    private final String tlf = "Tlf.: 640 727 831";
    private final int x = 3;
    
    public Font fuente() throws FontFormatException, IOException{
        Font titulo = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/recursos/monofonto.ttf"));
        return titulo;
    }
    
        
    
    public String fechaActual(){
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return hourdateFormat.format(date);
    }
    
    public TicketImpresion(ArrayList<Producto> ticket, Factura factu){
        this.ticket = ticket;
        this.factu = factu;
    }
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        String cabeceraTabla = "CANT   ARTÍCULO                PRECIO   IMPORTE";
        int linea = 90;
        if (pageIndex == 0) {
            try {
                graphics.setFont(fuente().deriveFont(Font.BOLD, 9f));
            } catch (FontFormatException | IOException ex) {
                Logger.getLogger(TicketImpresion.class.getName()).log(Level.SEVERE, null, ex);
            }
            graphics.drawString(denom, x, 10);
            try {
                graphics.setFont(fuente().deriveFont(Font.PLAIN, 8f));
            } catch (FontFormatException | IOException ex) {
                Logger.getLogger(TicketImpresion.class.getName()).log(Level.SEVERE, null, ex);
            }
            graphics.drawString(cif, x, 25);
            graphics.drawString(direccion, x, 35);
            graphics.drawString(tlf, x, 45);
            graphics.drawString(fechaActual(), x, 55);
            graphics.drawString(cabeceraTabla, x, 75);
            for (Producto p : ticket){
                graphics.drawString(descripcionProd(p), x, linea);
                linea = Integer.sum(linea, 10);
            }
            try {
                graphics.setFont(fuente().deriveFont(Font.BOLD, 9f));
            } catch (FontFormatException | IOException ex) {
                Logger.getLogger(TicketImpresion.class.getName()).log(Level.SEVERE, null, ex);
            }
            graphics.drawString("Precio total: " + factu.getImporte().toEngineeringString()+"€", x, (linea+20));
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
        for (int saltos = detalle.length(); saltos<28; saltos++) {
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
        for (int saltos = detalle.length(); saltos<38; saltos++) {
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
