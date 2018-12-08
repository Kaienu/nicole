package clases;

import java.math.BigDecimal;
import java.util.Objects;

public class Producto {
    
    private BigDecimal precioUnitario;
    private BigDecimal precioTotalAcumulado = new BigDecimal(0);
    private int count = 1;
    private String marca,modelo,idProducto;

    public Producto(String idProducto, BigDecimal precioUnitario, String marca, String modelo) {
        this.idProducto = idProducto;
        this.precioUnitario = precioUnitario;
        this.marca = marca;
        this.modelo = modelo;
    }
    
     public Producto(BigDecimal precioUnitario, String marca, String modelo) {
        this.precioUnitario = precioUnitario;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Producto(){
        
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCount() {
        return count;
    }

    public void increaseCount() {
        count = count + 1;
        actualizarPrecioTotal();
    }
    
    public void decreaseCount() {
        count = count - 1;
        actualizarPrecioTotal();
    }
    
    public void actualizarPrecioTotal(){
        precioTotalAcumulado = precioUnitario.multiply(BigDecimal.valueOf(count));
    }

    public BigDecimal getPrecioTotalAcumulado() {
        actualizarPrecioTotal();
        return precioTotalAcumulado;
    }

    public void setPrecioTotalAcumulado(BigDecimal precioTotalAcumulado) {
        this.precioTotalAcumulado = precioTotalAcumulado;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Producto) return this.getIdProducto().equals(((Producto)obj).getIdProducto());
        else return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.precioUnitario);
        hash = 89 * hash + Objects.hashCode(this.precioTotalAcumulado);
        hash = 89 * hash + this.count;
        hash = 89 * hash + Objects.hashCode(this.marca);
        hash = 89 * hash + Objects.hashCode(this.modelo);
        hash = 89 * hash + Objects.hashCode(this.idProducto);
        return hash;
    }

    @Override
    public String toString() {
        return modelo;
    }
   
}
