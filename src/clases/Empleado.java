package clases;

import java.util.Objects;

public class Empleado extends Persona{
    
    private String dni;
    
    public Empleado(String nombre, String apellidos, String correo, int telefono, String dni) {
        super(nombre, apellidos, correo, telefono);
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
    
    @Override
    public String toString() {
	return "ID cliente " + this.getDni() + " || " +
                this.getNombre() + " " +
                this.getApellidos() + " || " + 
                this.getCorreo() +" || " +
                this.getTelefono();
    }
    
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Empleado) {
            return this.dni.equals(((Empleado) obj) .dni); //(((Empleado) obj) .dni) == this.dni;
        } else return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.dni);
        return hash;
    }

}
