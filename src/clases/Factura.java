package clases;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

public class Factura {
    
    private String dniEmpleado,idCliente,idfactura;
    private BigDecimal importe;
    private Date fecha;

    public Factura(String idFactura, String idCliente, String dni, Date fecha, BigDecimal importe){
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

    Factura() {
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
    
    public Date getFecha(){
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
	this.fecha = fecha;
    }
    
    public BigDecimal getImporte(){
        return this.importe;
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
