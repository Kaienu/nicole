package clases;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class AccesoSQL {
    
    private String sURL = "jdbc:mysql://sql2.freemysqlhosting.net/sql2255331";
    private String usu = "sql2255331";
    private String pass = "sI5!cN7!";
    private Connection con;
    
    PreparedStatement preparedStatement;
    ResultSet rs;
    
        
    
    
   /* public void pruebaConexion() {
		
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
		
    }*/
    
    public AccesoSQL(){
        
        try {
            
            con = DriverManager.getConnection(sURL, usu, pass);
            if (con.isClosed()) System.out.println("Error en la conexión");
            else System.out.println("Conexión exitosa");
            		
	} catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error 01");
	}
		
    }
    
    public boolean UpdateSql(String query, String mensaje){
        
        Statement st;
        try {
            st = con.createStatement();
            if ((st.executeUpdate(query)) == 1){
                JOptionPane.showMessageDialog(null,"El registro ha sido "+mensaje+" correctamente.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null,"El registro no ha podido ser "+mensaje+" correctamente.");
                return false;
            }
                        
        } catch (MySQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(null,"Uno de los campos presenta un error!");
            return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha habido un error!");
            return false;
        }
        
    }
    
    public ArrayList<Cliente> listado(String query){
        
        ArrayList<Cliente> lista = new ArrayList<>();
        String insertsql = query;
        
        try {   
            
            preparedStatement = con.prepareStatement(insertsql);
            rs=preparedStatement.executeQuery();
            Cliente cliente;
            
                while (rs.next()) {
                    cliente = new Cliente();
                    cliente.setIdCliente(rs.getInt(1));
                    cliente.setNombre(rs.getString(2));
                    cliente.setApellidos(rs.getString(3));
                    cliente.setCorreo(rs.getString(4));
                    cliente.setTelefono(rs.getInt(5));
                    //System.out.println(cliente); // Comando de prueba en consola
                    lista.add(cliente);
                }
            
            } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
    return lista;
        
    }
    
    public Cliente listadoIndividual(String id){
        
        Cliente cliente = new Cliente();
        String insertsql = "Select * from Cliente where idCliente = "+id;
        
        try {   
            
            preparedStatement = con.prepareStatement(insertsql);
            rs=preparedStatement.executeQuery();
            
                while (rs.next()) {
                    
                    cliente.setIdCliente(rs.getInt(1));
                    cliente.setNombre(rs.getString(2));
                    cliente.setApellidos(rs.getString(3));
                    cliente.setCorreo(rs.getString(4));
                    cliente.setTelefono(rs.getInt(5));
                    System.out.println(cliente); // Comando de prueba en consola
                    
                }
            
            } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
    return cliente;
        
    }
    
    public void insertSql(Object obj) {
        
        if (obj instanceof Cliente){
            String insertSql =
            "insert into Cliente(nombre,apellidos,correo,telefono) values(?,?,?,?)";
            
            Cliente cliente = (Cliente) obj;
        
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
    }
    
    public void cerrar() {
		
	try {
            con.close();
	} catch (SQLException e) {
            System.out.println(e.getMessage());
	}
    }
    
}