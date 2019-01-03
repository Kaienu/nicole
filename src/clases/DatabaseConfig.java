package clases;

import java.io.Serializable;

public class DatabaseConfig implements Serializable {
    
    private String direccion,nombre,usuario,contraseña;

    public DatabaseConfig() {
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public String getAddress(){
        return "jdbc:mysql://"+getDireccion()+"/"+getNombre();
    }
    
}
