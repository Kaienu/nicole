package nicole_test;

import java.sql.*;
import java.util.*;

public class AccesoSQL /*implements AccInterface*/{
    
    private String sURL = "jdbc:mysql://sql2.freemysqlhosting.net/sql2255331";
    private String usu = "sql2255331";
    private String pass = "sI5!cN7!";
    private Connection con;
    
    PreparedStatement preparedStatement;
    ResultSet rs;
    
    ArrayList<Cliente> lista = new ArrayList<Cliente>();
    
    public void pruebaConexion() {
		
		try {
			Connection con = DriverManager.getConnection(sURL, usu, pass);
			
			if (con.isClosed())
				System.out.println("Error en la conexión");
			else
				System.out.println("Conexión exitosa");
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
    
    public AccesoSQL(){
        
        try {
            
            con = DriverManager.getConnection(sURL, usu, pass);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
  /*  public void listado() {       EN CONSTRUCCION
        
        String insetSql = "select * from Cliente";
        
        try {
            
            preparedStatement = con.prepareStatement(insetSql);
            rs = preparedStatement.executeQuery();
            Cliente clilist = new Cliente
            
        }
        
    }  */
    
    public void nuevo(Cliente cliente) {
        
        String insertSql =
        "insert into Cliente(nombre,apellidos,direccion,telefono) values(?,?,?,?)";
        
        try {
            
            preparedStatement = con.prepareStatement(insertSql);
            preparedStatement.setString(1, cliente.getNombre_cliente());
            preparedStatement.setString(2, cliente.getApellidos_cliente());
            preparedStatement.setString(3, cliente.getDireccion_cliente());
            preparedStatement.setInt(4, cliente.getTelefono());
            
            if (preparedStatement.executeUpdate()==1) {
                System.out.println("Se introdujo el cliente");
            } else {
                System.out.println("No se pudo introducir el cliente");
            }
            preparedStatement.close();
            
            
        } catch (SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public void cerrar() {
		
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    
}