package clases;

public class Cliente{
    
    private String nombre,apellidos,correo;
    private int telefono,idCliente;
    
    public Cliente(){
        
    }
    
    public Cliente(String nombre, String apellidos, String correo, int telefono, int idCliente) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
     public Cliente(String nombre, String apellidos, String correo, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public int getIdCliente(){
        return this.idCliente;
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
	return "ID cliente " + this.getIdCliente() + " || " +
                this.getNombre() + " " +
                this.getApellidos() + " || " + 
                this.getCorreo() +" || " +
                this.getTelefono();
    }
    
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Cliente) {
            return (((Cliente) obj) .idCliente) == this.idCliente;
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
    
}
