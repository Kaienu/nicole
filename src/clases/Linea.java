package clases;

public class Linea {
    
    private int idLinea,idFactura,idProducto,idPromocion,cantidad,importeLinea;
    
    public void Factura(int idLinea, int idFactura, int idProducto, int idPromocion, int cantidad, int importeLinea){
        this.setIdFactura(idFactura);
    }

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getImporteLinea() {
        return importeLinea;
    }

    public void setImporteLinea(int importeLinea) {
        this.importeLinea = importeLinea;
    }
    
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Linea) {
            if (((Linea) obj).getIdFactura() == this.getIdFactura()) {
                return ((Linea) obj).getIdLinea() == this.getIdLinea();
            } else return false;
        } else return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.idLinea;
        hash = 43 * hash + this.idFactura;
        hash = 43 * hash + this.idProducto;
        hash = 43 * hash + this.idPromocion;
        hash = 43 * hash + this.cantidad;
        hash = 43 * hash + this.importeLinea;
        return hash;
    }
    
}
