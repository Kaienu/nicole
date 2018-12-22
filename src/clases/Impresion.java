package clases;

import java.awt.print.*;
import java.util.ArrayList;

public class Impresion {
    
    public static void main(ArrayList<Producto> lista, Factura factu) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new TicketImpresion(lista,factu));
        if (job.printDialog()){
            try{
                job.print();
            } catch (PrinterException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
}
