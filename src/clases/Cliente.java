package clases;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente{
    
    private String nombre,apellidos,correo,idCliente,observaciones;
    private Timestamp fechaAlta;
    private int telefono;
    
    public Cliente(){
        
    }
    
    public Cliente(String nombre, String apellidos, String correo, int telefono, String idCliente, String observaciones, Timestamp fechaAlta) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.observaciones = observaciones;
        this.fechaAlta = fechaAlta;
    }
    
     public Cliente(String nombre, String apellidos, String correo, int telefono, String observaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Timestamp getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Timestamp fechaAlta) {
        this.fechaAlta = fechaAlta;
    }   
    
    
    
    
    @Override
    public String toString() {
	return "ID cliente " + this.getIdCliente() + " || " +
                this.getNombre() + " " +
                this.getApellidos() + " || " + 
                this.getCorreo() +" || " +
                this.getTelefono() + " || " + 
                this.getObservaciones() + " || " +
                this.getFechaAlta();
    }
    
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Cliente) {
            return this.idCliente.equals(((Cliente)obj).idCliente);
        } else return false;
    }
    
    public final String fechaActual(){
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return hourdateFormat.format(fechaAlta);
    }
    
    public final String fechaAlta(){
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return hourdateFormat.format(fechaAlta);
    }
     /*
       @Override
    public boolean equals(Object obj) {
	if (obj instanceof Persona) {
            if (this.nombre.equals(((Persona) obj) .nombre)) {
                if (this.apellidos.equals(((Persona) obj) .apellidos)) {
                    if (this.correo.equals(((Persona) obj) .correo)) {
                        return this.telefono == (((Persona) obj) .telefono);
                    } else return false;
                } else return false;    
            } else return false;
        } else return false;
    }
    */
    
}
