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
    
    /**
    * Devuelve un ArrayList de "Objects" referente a la consulta lanzada. 
    * El primer argumento indica la tabla en la que está haciendo la consulta,
    * y el segundo la palabra filtrada dentro de los campos (exceptuando el
    * campo ID de turno)
    * <p>
    * Este método devuelve un ArrayList lleno de "objects" u objetos, con lo
    * que para mostrar el contenido en una lista hay que convertirlos a la
    * clase que pertenezca a la tabla elegida.
    *
    * @param  tabla  Tabla de la BBDD en la que se quiere buscar
    * @param  filtro Texto que sirve como filtro dentro de los campos a buscar
    * @return      ArrayList de Objects
    */
    
    public ArrayList<Object> listado(String tabla,String filtro) throws SQLException{
        
        ArrayList<Object> lista = new ArrayList<>();
        
        switch (tabla){ //Selecciona por el campo introducido como parámetro
        
            case "Cliente":
            preparedStatement = con.prepareStatement("select * from "+tabla+
            " where nombre LIKE '%"+filtro+"%' OR apellidos LIKE '%"+
            filtro+"%' OR correo LIKE '%"+filtro+"%' OR telefono LIKE '%"+
            filtro+"%'");
            rs=preparedStatement.executeQuery();
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getInt(1));
                    cliente.setNombre(rs.getString(2));
                    cliente.setApellidos(rs.getString(3));
                    cliente.setCorreo(rs.getString(4));
                    cliente.setTelefono(rs.getInt(5));
                    //System.out.println(cliente); // Comando de prueba en consola
                    lista.add(cliente);
                }
                return lista;
            case "Empleado":
                preparedStatement = con.prepareStatement("select * from "+tabla+
                " where nombre LIKE '%"+filtro+"%' OR apellidos LIKE '%"+
                filtro+"%' OR correo LIKE '%"+filtro+"%' OR telefono LIKE '%"+
                filtro+"%'");
                rs=preparedStatement.executeQuery();
                while (rs.next()) {
                    Empleado emp = new Empleado();
                    emp.setDni(rs.getString(1));
                    emp.setNombre(rs.getString(2));
                    emp.setApellidos(rs.getString(3));
                    emp.setCorreo(rs.getString(4));
                    emp.setTelefono(rs.getInt(5));
                    //System.out.println(cliente); // Comando de prueba en consola
                    lista.add(emp);
                }
            case "Factura": JOptionPane.showMessageDialog(null,"No implementado aun");
            case "Producto":
                preparedStatement = con.prepareStatement("select * from "+tabla+
                " where idProducto LIKE '%"+filtro+"%' OR precioUnitario LIKE '%"+
                filtro+"%' OR marca LIKE '%"+filtro+"%' OR modelo LIKE '%"+
                filtro+"%'");
                rs=preparedStatement.executeQuery();
                while (rs.next()){
                    Producto producto = new Producto();
                    producto.setIdProducto(rs.getInt(1));
                    producto.setMarca(rs.getString(2));
                    producto.setModelo(rs.getString(3));
                    producto.setPrecioUnitario(rs.getInt(4));
                    lista.add(producto);
                }
            case "Promocion": JOptionPane.showMessageDialog(null,"No implementado aun");
                
        }
        
        return lista;
        
    }
    /**
    * Devuelve un ArrayList de "Objects" referente a la consulta lanzada. 
    * El argumento indica la tabla en la que está haciendo la consulta
    * <p>
    * Este método devuelve un ArrayList lleno de "objects" u objetos, con lo
    * que para mostrar el contenido en una lista hay que convertirlos a la
    * clase que pertenezca a la tabla elegida.
    *
    * @param  tabla  Tabla de la BBDD en la que se quiere buscar
    * @return      ArrayList de Objects
    */
    
    public ArrayList<Object> listadoCompleto(String tabla) throws SQLException{
        
        ArrayList<Object> lista = new ArrayList<>();
        
        switch (tabla){ //Selecciona por el campo introducido como parámetro
        
            case "Cliente":
            preparedStatement = con.prepareStatement("select * from "+tabla);
            rs=preparedStatement.executeQuery();
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getInt(1));
                    cliente.setNombre(rs.getString(2));
                    cliente.setApellidos(rs.getString(3));
                    cliente.setCorreo(rs.getString(4));
                    cliente.setTelefono(rs.getInt(5));
                    //System.out.println(cliente); // Comando de prueba en consola
                    lista.add(cliente);
                }
                return lista;
                
            case "Empleado":
                preparedStatement = con.prepareStatement("select * from "+tabla);
                rs=preparedStatement.executeQuery();
                while (rs.next()) {
                    Empleado emp = new Empleado();
                    emp.setDni(rs.getString(1));
                    emp.setNombre(rs.getString(2));
                    emp.setApellidos(rs.getString(3));
                    emp.setCorreo(rs.getString(4));
                    emp.setTelefono(rs.getInt(5));
                    //System.out.println(cliente); // Comando de prueba en consola
                    lista.add(emp);
                }
                return lista;
            case "Producto":
                preparedStatement = con.prepareStatement("select * from "+tabla);
                rs=preparedStatement.executeQuery();
                while (rs.next()){
                    Producto producto = new Producto();
                    producto.setIdProducto(rs.getInt(1));
                    producto.setMarca(rs.getString(2));
                    producto.setModelo(rs.getString(3));
                    producto.setPrecioUnitario(rs.getInt(4));
                    lista.add(producto);
                }
                return lista;
            case "Factura": JOptionPane.showMessageDialog(null,"No implementado aun");
            case "Promocion": JOptionPane.showMessageDialog(null,"No implementado aun");   
        }       
        return lista;        
    }
    
    
           
   /**
    * Devuelve un Objects que contiene la consulta lanzada. 
    * El primer argumento indica la tabla en la que está haciendo la consulta,
    * y el segundo el ID a filtrar dentro del campo ID correspondiente
    * <p>
    * Este método devuelve un "Object" u objeto, con lo que será necesario
    * hacer el casteo a la clase deseada, correspondiente a la tabla elegida
    *
    * @param  tabla  Tabla de la BBDD en la que se quiere buscar
    * @param  id     ID del registro a filtrar (En formato String)
    * @return      Object casteado a clase de tabla
     * @throws java.sql.SQLException
    */
    
    public Object listadoID(String tabla,String id) throws SQLException{
        Object nulo = null;
        switch (tabla){ //Selecciona por el campo introducido como parámetro
        
            case "Cliente":
                preparedStatement = con.prepareStatement("select * from "+
                        tabla+" where idCliente = "+id);
                rs=preparedStatement.executeQuery();
                Cliente cliente = new Cliente();
                while (rs.next()) {
                    cliente.setIdCliente(rs.getInt(1));
                    cliente.setNombre(rs.getString(2));
                    cliente.setApellidos(rs.getString(3));
                    cliente.setCorreo(rs.getString(4));
                    cliente.setTelefono(rs.getInt(5));
                    //System.out.println(cliente); // Comando de prueba en consola
                }
                return (Object) cliente;
                
            case "Empleado":
                preparedStatement = con.prepareStatement("select * from "+
                        tabla+" where id = "+id);
                rs=preparedStatement.executeQuery();
                Empleado emp = new Empleado();
                while (rs.next()) {
                    emp.setDni(rs.getString(1));
                    emp.setNombre(rs.getString(2));
                    emp.setApellidos(rs.getString(3));
                    emp.setCorreo(rs.getString(4));
                    emp.setTelefono(rs.getInt(5));
                    //System.out.println(cliente); // Comando de prueba en consola
                }
                return (Object) emp;
                
            case "Factura": JOptionPane.showMessageDialog(null,"No implementado aun");
            case "Producto": JOptionPane.showMessageDialog(null,"No implementado aun");
            case "Promocion": JOptionPane.showMessageDialog(null,"No implementado aun");
                
        }
        
        return nulo;
        
    }
    
    /**
    * Inserta un objeto específico en la BBDD. 
    * Insertando el objeto como parámetro, detecta que tipo de registro es
    * y lo inserta en la BBDD.
    * <p>
    * Este método tiene que ser englobado en un bloque try.
    *
    * @param obj    Objeto de una de las clases correspondiente a los registros.
    * @return       True o False, dependiendo de si ha sido exitoso o no.
    */
    
    public boolean insertSql(Object obj){
        
        String query=null;
        if (obj instanceof Cliente && ComprobacionObjeto.Comprobacion((Cliente) obj)){
            Cliente cliente = (Cliente) obj;
            query =
            "insert into Cliente(nombre,apellidos,correo,telefono) values('"+
                    cliente.getNombre()+"','"+cliente.getApellidos()+"','"+
                    cliente.getCorreo()+"',"+cliente.getTelefono()+")";
        }else if (obj instanceof Empleado && ComprobacionObjeto.Comprobacion((Empleado) obj)){
            Empleado empleado = (Empleado) obj;
            query =
            "insert into Empleado(dni,nombre,apellidos,telefono,correo) values('"+
                    empleado.getDni()+"','"+empleado.getNombre()+"','"+
                    empleado.getApellidos()+"',"+empleado.getTelefono()+",'"+
                    empleado.getCorreo()+"')";
        }else if (obj instanceof Factura){
            Factura factura = (Factura) obj;
            query = "";
        }else if (obj instanceof Producto){
            Producto prod = (Producto) obj;
            query = "";
        }else if (obj instanceof Promocion){
            Promocion prom = (Promocion) obj;
            query ="";
        }else{
            
        }
            
        Statement st;
        
        try {
            st = con.createStatement();
            if ((st.executeUpdate(query)) == 1){
                JOptionPane.showMessageDialog(null,
                        "El registro ha sido insertado correctamente.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "El registro no ha podido ser insertado correctamente.");
                return false;
            }
        }catch (MySQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(null,
                    "Uno de los campos presenta un error!");
            return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ha habido un error!");
            return false;
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
    
    public void cerrar() {
		
	try {
            con.close();
	} catch (SQLException e) {
            System.out.println(e.getMessage());
	}
    }
    
}
