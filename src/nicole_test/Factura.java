package nicole_test;

import java.sql.Date;
import java.util.Objects;

public class Factura {
    
    private String dniEmpleado;
    private int idCliente,idfactura,importe;
    private Date fecha;
    
    public void Factura(int idFactura, int idCliente, String dni, Date fecha, int importe){
        this.setIdFactura(idFactura);
        this.setIdCliente(idCliente);
        this.setDni(dniEmpleado);
        this.setFecha(fecha);
        this.setImporte(importe);
    }
    
    public void setIdFactura(int idFactura) {
	this.idfactura = idFactura;
    }
    
    public int getIdFactura(){
        return this.idfactura;
    }
    
    public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
    }
    
     public int getIdCliente(){
        return this.idCliente;
    }
    
    public void setDni(String dniEmpleado) {
	this.dniEmpleado = dniEmpleado;
    }
    
    public String getDniEmpleado(){
        return this.dniEmpleado;
    }
    
    public void setImporte(int importe) {
	this.importe = importe;
    }
    
    public Date getFecha(){
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
	this.fecha = fecha;
    }
    
    public int getImporte(){
        return this.importe;
    }
    
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Factura) {
            return ((Factura) obj).getIdFactura() == this.getIdFactura();
        } else return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.dniEmpleado);
        hash = 53 * hash + this.idCliente;
        hash = 53 * hash + this.idfactura;
        hash = 53 * hash + this.importe;
        hash = 53 * hash + Objects.hashCode(this.fecha);
        return hash;
    }
    
}
