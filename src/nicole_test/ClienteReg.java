package nicole_test;

public class ClienteReg extends Cliente{
    
    private int idCliente;
    
    public ClienteReg(){
        
    }
    
    public ClienteReg(Cliente cliente,int idCliente){
        this.setNombre_cliente(cliente.getNombre_cliente());
        this.setCorreo_cliente(cliente.getCorreo_cliente());
    }
    
    public ClienteReg(String nombre_cliente, String apellidos_cliente, String direccion_cliente, int telefono, int idCliente) {
        super(nombre_cliente, apellidos_cliente, direccion_cliente, telefono);
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
                        this.getNombre_cliente() + " " +
                        this.getApellidos_cliente() + " || " + 
                        this.getCorreo_cliente() +" || " +
                        this.getTelefono();
        }
    
    
}
