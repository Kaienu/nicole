package clases;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Factura {
    
    private String dniEmpleado,idCliente,idfactura;
    private BigDecimal importe;
    private Timestamp fecha;

    public Factura(String idFactura, String idCliente, String dni, Timestamp fecha, BigDecimal importe){
        this.setIdFactura(idFactura);
        this.setIdCliente(idCliente);
        this.setDni(dni);
        this.setFecha(fecha);
        this.setImporte(importe);
    }
    
    public Factura(String idCliente, String dni, BigDecimal importe){
        this.setIdCliente(idCliente);
        this.setDni(dni);
        this.setImporte(importe);
    }

    public Factura() {
    }
    
    public void setIdFactura(String idFactura) {
	this.idfactura = idFactura;
    }
    
    public String getIdFactura(){
        return this.idfactura;
    }
    
    public void setIdCliente(String idCliente) {
	this.idCliente = idCliente;
    }
    
     public String getIdCliente(){
        return this.idCliente;
    }
    
    public void setDni(String dniEmpleado) {
	this.dniEmpleado = dniEmpleado;
    }
    
    public String getDniEmpleado(){
        return this.dniEmpleado;
    }
    
    public void setImporte(BigDecimal importe) {
	this.importe = importe;
    }
    
    public Timestamp getFecha(){
        return this.fecha;
    }
    
    public void setFecha(Timestamp fecha) {
	this.fecha = fecha;
    }
    
    public BigDecimal getImporte(){
        return this.importe;
    }
    
    public String fechaActual(){
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return hourdateFormat.format(fecha);
    }
    
    public boolean comparacion(String filtro) {
        String text = filtro.toUpperCase();
        if (this.dniEmpleado.toUpperCase().contains(text)) return true;
        else if (this.idCliente.toUpperCase().contains(text)) return true;
        else if (fechaActual().contains(text)) return true;
        else if (this.idfactura.toUpperCase().contains(text)) return true;
        else return false;
    }
    
    @Override
    public String toString() {
        return "Factura nº"+idfactura+", Empleado:"+dniEmpleado+", Cliente:"+
                idCliente+", importe:"+importe.toEngineeringString()+"€.";
    }
    
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Factura) {
            return this.getIdFactura().equals(((Factura)obj).idfactura);
        } else return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.dniEmpleado);
        hash = 67 * hash + Objects.hashCode(this.idCliente);
        hash = 67 * hash + Objects.hashCode(this.idfactura);
        hash = 67 * hash + Objects.hashCode(this.importe);
        hash = 67 * hash + Objects.hashCode(this.fecha);
        return hash;
    }

    

   
    
}
