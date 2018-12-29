package clases;

import java.sql.Timestamp;

public class Empleado{
    
    private String dni,nombre,apellidos,correo;
    private int telefono;
    private Timestamp fechaAlta = Tool.FECHAERROR;
    
    
    public Empleado(){    
    }
    
    public Empleado(String nombre, String apellidos, String correo, int telefono, String dni) {
        this.nombre = nombre;
	this.apellidos = apellidos;
	this.correo = correo;
	this.telefono = telefono;
        this.dni = dni;
    }
    
    public Empleado(String nombre, String apellidos, String correo, int telefono, String dni,Timestamp fechaAlta) {
        this(nombre, apellidos, correo, telefono, dni);
        this.fechaAlta = fechaAlta;
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

    public Timestamp getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Timestamp fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    public String getNombreCompleto(){
        return this.nombre+" "+this.getApellidos();
    }
    
    public void asignarPass(String pass) {
        String passwd = Tool.hashWith256(pass);
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
    
}
