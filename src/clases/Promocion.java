package clases;

public class Promocion {
    
    private int idPromocion,porcenProm,denominacion;

    public Promocion(int idPromocion, int porcenProm, int denominacion) {
        this.setIdPromocion(idPromocion);
        this.setPorcenProm(porcenProm);
        this.setDenominacion(denominacion);
    }

    public int getDenominacion() {
        return denominacion;
    }

    public int getIdPromocion() {
        return idPromocion;
    }

    public int getPorcenProm() {
        return porcenProm;
    }

    public void setDenominacion(int denominacion) {
        this.denominacion = denominacion;
    }

    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }

    public void setPorcenProm(int porcenProm) {
        this.porcenProm = porcenProm;
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Promocion) {
                return ((Promocion) obj).getIdPromocion()== this.getIdPromocion();
        } else return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.idPromocion;
        hash = 29 * hash + this.porcenProm;
        hash = 29 * hash + this.denominacion;
        return hash;
    }

}
