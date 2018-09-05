package nicole_test;

public class Cliente {
	
	private String nombre_cliente,apellidos_cliente,direccion_cliente;
	private int telefono;
        
        public Cliente(){
            
        }
        
	public Cliente(String nombre_cliente, String apellidos_cliente, String direccion_cliente, int telefono) {
		this.setNombre_cliente(nombre_cliente);
		this.setApellidos_cliente(apellidos_cliente);
		this.setDireccion_cliente(direccion_cliente);
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

	public String getDireccion_cliente() {
		return direccion_cliente;
	}

	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
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
                        this.getDireccion_cliente() +" || " +
                        this.getTelefono();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cliente) {
                    if (this.nombre_cliente.equals(((Cliente) obj) .nombre_cliente)) {
                        if (this.apellidos_cliente.equals(((Cliente) obj) .apellidos_cliente)) {
                            if (this.direccion_cliente.equals(((Cliente) obj) .direccion_cliente)) {
                                return this.telefono == (((Cliente) obj) .telefono);
                            } else return false;
                        } else return false;    
                    } else return false;
                } else return false;
            }
	}


