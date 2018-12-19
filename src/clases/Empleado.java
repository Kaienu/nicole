package clases;

import java.util.Date;
import java.util.Objects;

public class Empleado{
    
    private String dni,nombre,apellidos,correo;
    private int telefono;
    
    public Empleado(String nombre, String apellidos, String correo, int telefono, String dni) {
        this.nombre = nombre;
	this.apellidos = apellidos;
	this.correo = correo;
	this.telefono = telefono;
        this.dni = dni;
    }
    
    public Empleado(){
        
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getDni(){
        return this.dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    @Override
    public String toString() {
        return this.getNombre()+" "+this.getApellidos();
	/*return "DNI " + this.getDni() + " || " +
                this.getNombre() + " " +
                this.getApellidos() + " || " + 
                this.getCorreo() +" || " +
                this.getTelefono();*/
    }
    
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Empleado) {
            return this.dni.equals(((Empleado) obj) .dni); //(((Empleado) obj) .dni) == this.dni;
        } else return false;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.dni);
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.apellidos);
        hash = 47 * hash + Objects.hashCode(this.correo);
        hash = 47 * hash + this.telefono;
        return hash;
    }

    

}
