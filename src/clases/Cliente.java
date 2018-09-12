package clases;

public class Cliente extends Persona{
    
    private int idCliente;
    
    public Cliente(){
        
    }
    
    public Cliente(Persona cliente,int idCliente){
        this.setNombre(cliente.getNombre());
        this.setCorreo(cliente.getCorreo());
    }
    
    public Cliente(String nombre, String apellidos, String correo, int telefono, int idCliente) {
        super(nombre, apellidos, correo, telefono);
        this.idCliente = idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public int getIdCliente(){
        return this.idCliente;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.idCliente;
        return hash;
    }
    
}
