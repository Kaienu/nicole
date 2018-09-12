package nicole_test;

import java.util.Objects;

public class Cliente {
	
    private String nombre_cliente,apellidos_cliente,correo_cliente;
    private int telefono;
        
    public Cliente(){
            
    }
        
    public Cliente(String nombre_cliente, String apellidos_cliente, String correo_cliente, int telefono) {
	this.setNombre_cliente(nombre_cliente);
	this.setApellidos_cliente(apellidos_cliente);
	this.setCorreo_cliente(correo_cliente);
	this.setTelefono(telefono);
	
    }

    public String getNombre_cliente() {
	return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
	this.nombre_cliente = nombre_cliente;
    }

    public String getApellidos_cliente() {
	return apellidos_cliente;
    }

    public void setApellidos_cliente(String apellidos_cliente) {
	this.apellidos_cliente = apellidos_cliente;
    }

    public String getCorreo_cliente() {
	return correo_cliente;
    }

    public void setCorreo_cliente(String direccion_cliente) {
	this.correo_cliente = direccion_cliente;
    }

    public int getTelefono() {
	return telefono;
    }

    public void setTelefono(int telefono) {
	this.telefono = telefono;
    }
	
    @Override
    public String toString() {
	return "cliente " + this.getNombre_cliente() + " " +
                this.getApellidos_cliente() + " || " + 
                this.getCorreo_cliente() +" || " +
                this.getTelefono();
    }
	
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Cliente) {
            if (this.nombre_cliente.equals(((Cliente) obj) .nombre_cliente)) {
                if (this.apellidos_cliente.equals(((Cliente) obj) .apellidos_cliente)) {
                    if (this.correo_cliente.equals(((Cliente) obj) .correo_cliente)) {
                        return this.telefono == (((Cliente) obj) .telefono);
                    } else return false;
                } else return false;    
            } else return false;
        } else return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.nombre_cliente);
        hash = 43 * hash + Objects.hashCode(this.apellidos_cliente);
        hash = 43 * hash + Objects.hashCode(this.correo_cliente);
        hash = 43 * hash + this.telefono;
        return hash;
    }
	}


