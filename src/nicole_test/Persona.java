package nicole_test;

import java.util.Objects;

public class Persona {
	
    private String nombre,apellidos,correo;
    private int telefono;
        
    public Persona(){
            
    }
        
    public Persona(String nombre, String apellidos, String correo, int telefono) {
	this.setNombre(nombre);
	this.setApellidos(apellidos);
	this.setCorreo(correo);
	this.setTelefono(telefono);
	
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

    public int getTelefono() {
	return telefono;
    }

    public void setTelefono(int telefono) {
	this.telefono = telefono;
    }
	
    @Override
    public String toString() {
	return "Persona || " + this.getNombre() + " " +
                this.getApellidos() + " || " + 
                this.getCorreo() +" || " +
                this.getTelefono();
    }
	
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + Objects.hashCode(this.apellidos);
        hash = 43 * hash + Objects.hashCode(this.correo);
        hash = 43 * hash + this.telefono;
        return hash;
    }
}


