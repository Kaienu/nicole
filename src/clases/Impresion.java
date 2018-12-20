package clases;

import java.awt.print.*;
import java.util.ArrayList;

public class Impresion {
    
    public static void main(ArrayList<String> lista) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new TicketImpresion(lista));
        if (job.printDialog()){
            try{
                job.print();
            } catch (PrinterException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
}
