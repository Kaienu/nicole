package clases;

import java.sql.Timestamp;

public class Empleado{
    
    private String dni,nombre,apellidos,correo;
    private int telefono, permisos;
    private Timestamp fechaAlta = R.FECHAERROR;

    public static final int SUPERUSER = 0;
    public static final int ADMIN = 1;
    public static final int USER = 2;
    
    
    public Empleado(){    
    }
    
    public Empleado(String nombre, String apellidos, String correo, int telefono, String dni) {
        this.nombre = nombre;
	this.apellidos = apellidos;
	this.correo = correo;
	this.telefono = telefono;
        this.dni = dni;
    }
    
    public Empleado(String nombre, String apellidos, String correo, int telefono, String dni, int permisos) {
        this(nombre, apellidos, correo, telefono, dni);
        this.permisos = permisos;
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

    public int getPermisos() {
        return permisos;
    }

    public void setPermisos(int permisos) {
        this.permisos = permisos;
    }
    
    public String getNombreCompleto(){
        if (this.permisos<2) {
            return "<html><b>"+this.nombre+" "+this.apellidos+"</b></html>";
        } else {
            return this.nombre+" "+this.apellidos;
        }
    }
    
    public void asignarPass(String pass) {
        String passwd = R.hashWith256(pass);
    }
    
    @Override
    public String toString() {
        return this.getNombre()+" "+this.getApellidos();
    }
    
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Empleado) {
            return this.dni.equals(((Empleado) obj) .dni); //(((Empleado) obj) .dni) == this.dni;
        } else return false;
    }
    
}
