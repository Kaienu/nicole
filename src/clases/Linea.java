package clases;

import java.math.BigDecimal;
import java.util.Objects;

public class Linea {
    
    private int cantidad;
    private String idLinea,idFactura,idProducto,idPromocion,modelo;
    private BigDecimal importeLinea;

    public Linea() {
    }

    public Linea(int cantidad, String idFactura, String idProducto, String idPromocion, BigDecimal importeLinea, String modelo) {
        this.cantidad = cantidad;
        this.idFactura = idFactura;
        this.modelo = modelo;
        this.idProducto = idProducto;
        this.idPromocion = idPromocion;
        this.importeLinea = importeLinea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public String getIdLinea() {
        return idLinea;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getIdPromocion() {
        return idPromocion;
    }

    public BigDecimal getImporteLinea() {
        return importeLinea;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public void setIdLinea(String idLinea) {
        this.idLinea = idLinea;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setIdPromocion(String idPromocion) {
        this.idPromocion = idPromocion;
    }

    public void setImporteLinea(BigDecimal importeLinea) {
        this.importeLinea = importeLinea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Linea) {
            return this.getIdLinea().equals(((Linea)obj).getIdLinea());
        } else return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.cantidad;
        hash = 41 * hash + Objects.hashCode(this.idLinea);
        hash = 41 * hash + Objects.hashCode(this.idFactura);
        hash = 41 * hash + Objects.hashCode(this.idProducto);
        hash = 41 * hash + Objects.hashCode(this.idPromocion);
        hash = 41 * hash + Objects.hashCode(this.modelo);
        hash = 41 * hash + Objects.hashCode(this.importeLinea);
        return hash;
    }

}
