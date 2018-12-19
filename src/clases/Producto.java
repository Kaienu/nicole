package clases;

import java.math.BigDecimal;
import java.util.Objects;

public class Producto {
    
    private BigDecimal precioUnitario;
    private BigDecimal precioTotalAcumulado = new BigDecimal(0);
    private int count = 1;
    private String idProducto,tipo,marca,modelo,observaciones;

    public Producto(String idProducto, String tipo, String marca, String modelo, BigDecimal precioUnitario, String observaciones) {
        this.idProducto = idProducto;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.precioUnitario = precioUnitario;
        this.observaciones = observaciones;
    }
    
     public Producto(String tipo, String marca, String modelo, BigDecimal precioUnitario, String observaciones) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.precioUnitario = precioUnitario;
        this.observaciones = observaciones;
    }
    
    public Producto(){
        
    }
    
    public String getTipo(){
        return tipo;
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
    public String getObservaciones(){
        return observaciones;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.precioUnitario);
        hash = 17 * hash + Objects.hashCode(this.precioTotalAcumulado);
        hash = 17 * hash + this.count;
        hash = 17 * hash + Objects.hashCode(this.idProducto);
        hash = 17 * hash + Objects.hashCode(this.tipo);
        hash = 17 * hash + Objects.hashCode(this.marca);
        hash = 17 * hash + Objects.hashCode(this.modelo);
        hash = 17 * hash + Objects.hashCode(this.observaciones);
        return hash;
    }



    @Override
    public String toString() {
        return modelo;
    }
   
}
