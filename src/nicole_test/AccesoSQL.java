package nicole_test;

import java.sql.*;
import java.util.*;

public class AccesoSQL /*implements AccInterface*/{
    
    private String sURL = "jdbc:mysql://192.168.126.128/nicole";
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
				System.out.println("Error en la conexi�n");
			else
				System.out.println("Conexi�n exitosa");
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
    
    public void listado() {
        
        
        
    }
    
    public void nuevo(Cliente cliente) {
        
        String insertSql =
        "insert into cliente(idCliente,nombre,apellidos,direccion,telefono) "
                + "values(?,?,?,?,?)";
        
        try {
            
            preparedStatement = con.prepareStatement(insertSql);
            preparedStatement.setString(1, "0001");
            preparedStatement.setString(2, "pepe");
            preparedStatement.setString(3, "Diaz");
            preparedStatement.setString(4, "Calle sardina 26");
            preparedStatement.setString(5, "954634833");
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
