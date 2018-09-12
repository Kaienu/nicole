package nicole_test;

import java.sql.*;
import java.util.*;

public class AccesoSQL /*implements AccInterface*/{
    
    private String sURL = "jdbc:mysql://192.168.126.134/nicole";
    private String usu = "Pedro";
    private String pass = "oxgnub";
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
			//System.out.println("Error!");
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
    
   /* public void listado(){
        String insertsql = "select * from cliente";
        
        try {   
            
            preparedStatement = con.prepareStatement(insertsql);
            rs=preparedStatement.executeQuery();
            Cliente clilist = new Cliente() ;
            
    } catch (SQLException e){
        e.printStackTrace();
    }
    
    /*public void listado(){
        
        String insetSql = "select * from Cliente";
        
        
            
            preparedStatement = con.prepareStatement(insetSql);
            rs = preparedStatement.executeQuery();
            Cliente clilist = new Cliente
            
        
           
        }
        
    }*/
    
    public void nuevo(Cliente cliente) {
        
        String insertSql =
        "insert into cliente(nombre,apellidos,direccion,telefono) values(?,?,?,?)";
        
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