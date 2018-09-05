package nicole_test;

public class Cliente {
	
	private String nombre_cliente,apellidos_cliente,direccion_cliente;
	private int telefono,id_cliente;
	private static int count_cliente=0;
	
        public Cliente(){
            
        }
	
	public Cliente(String nombre_cliente, String apellidos_cliente, String direccion_cliente, int telefono) {
		this.setNombre_cliente(nombre_cliente);
		this.setApellidos_cliente(apellidos_cliente);
		this.setDireccion_cliente(direccion_cliente);
		this.setTelefono(telefono);
		this.setCount_cliente();
		this.setId_cliente();
		
		
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
	
	private void setId_cliente() {
		this.id_cliente=Cliente.count_cliente;
	}
	
	public int getId_cliente() {
		return this.id_cliente;
	}
	
	public void setCount_cliente() {
		Cliente.count_cliente++;
	}
	
	public int getCount_cliente() {
		return Cliente.count_cliente;
	}

	@Override
	public String toString() {
		return "cliente ID " + this.getId_cliente() +
				" || " + this.getNombre_cliente() + " " + this.getApellidos_cliente() +
				" || " + this.getDireccion_cliente() +
				" || " + this.getTelefono();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cliente) {
			return this.telefono == (((Cliente) obj) .telefono);
		} else {
			return false;
		}
	}

}
