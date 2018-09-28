package clases;

import java.util.Objects;

public class Producto {
    
    private int idProducto,precioUnitario;
    private String marca,modelo;

    public Producto(int idProducto, int precioUnitario, String marca, String modelo) {
        this.idProducto = idProducto;
        this.precioUnitario = precioUnitario;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Producto(){
        
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Producto) return (this.getIdProducto() == ((Producto) obj).idProducto);
        else return false;
    }

    @Override
    public String toString() {
        return modelo;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idProducto;
        hash = 37 * hash + this.precioUnitario;
        hash = 37 * hash + Objects.hashCode(this.marca);
        hash = 37 * hash + Objects.hashCode(this.modelo);
        return hash;
    }
    
}
