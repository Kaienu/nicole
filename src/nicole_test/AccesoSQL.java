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
    
    ArrayList<Cliente> lista = new ArrayList<>();
    
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
            System.out.println(e.getMessage());
	}
		
    }
    
    public AccesoSQL(){
        
        try {
            
            con = DriverManager.getConnection(sURL, usu, pass);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void listado(){
        
        String insertsql = "select * from cliente";
        
        try {   
            
            preparedStatement = con.prepareStatement(insertsql);
            rs=preparedStatement.executeQuery();
            Cliente clilist = new Cliente() ;
            
                while (rs.next()) {
                    clilist.setIdCliente(rs.getInt(1));
                    clilist.setNombre(rs.getString(2));
                    clilist.setApellidos(rs.getString(3));
                    clilist.setCorreo(rs.getString(4));
                    clilist.setTelefono(rs.getInt(5));
                    System.out.println(clilist);
                    lista.add(clilist);
                }
            
            } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void nuevo(Persona cliente) {
        
        String insertSql =
        "insert into cliente(nombre,apellidos,correo,telefono) values(?,?,?,?)";
        
        try {
            
            preparedStatement = con.prepareStatement(insertSql);
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getApellidos());
            preparedStatement.setString(3, cliente.getCorreo());
            preparedStatement.setInt(4, cliente.getTelefono());
            
            if (preparedStatement.executeUpdate()==1) {
                System.out.println("Se introdujo el cliente");
            } else {
                System.out.println("No se pudo introducir el cliente");
            }
            preparedStatement.close();
              
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void cerrar() {
		
	try {
            con.close();
	} catch (SQLException e) {
            System.out.println(e.getMessage());
	}
    }
    
}