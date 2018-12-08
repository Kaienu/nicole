package clases;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class AccesoSQL {
    
    private String sURL = "jdbc:mysql://192.168.1.39/nicole";
    private String extURL = "jdbc:mysql://79.146.89.178/nicole";
    private String usu = "pedro";
    private String pass = "oxgnub";
    private Connection con;
    
    PreparedStatement preparedStatement;
    ResultSet rs;
    
    public AccesoSQL(){
        
        try {
            con = DriverManager.getConnection(sURL, usu, pass);
            if (con.isClosed()) System.out.println("Error en la conexión local");
            else System.out.println("Conexión exitosa");
            		
	} catch (SQLException e) {
            remoteConnect();
	}
		
    }
    
    public void remoteConnect(){
        try {
            con = DriverManager.getConnection(extURL, usu, pass);
            if (con.isClosed()) System.out.println("Error en la conexión remota");
            else System.out.println("Conexión exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"Error al acceder a la Base de Datos");
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
        
//-------------------------------CLIENTE---------------------------------------//            
            
            case "Cliente":
            preparedStatement = con.prepareStatement("select * from "+tabla+
            " where nombre LIKE '%"+filtro+"%' OR apellidos LIKE '%"+
            filtro+"%' OR correo LIKE '%"+filtro+"%' OR telefono LIKE '%"+
            filtro+"%'");
            rs=preparedStatement.executeQuery();
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getString(1));
                    cliente.setNombre(rs.getString(2));
                    cliente.setApellidos(rs.getString(3));
                    cliente.setCorreo(rs.getString(4));
                    cliente.setTelefono(rs.getInt(5));
                    //System.out.println(cliente); // Comando de prueba en consola
                    lista.add(cliente);
                }
                return lista;

//-------------------------------EMPLEADO--------------------------------------//
                
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
                    emp.setCorreo(rs.getString(5));
                    emp.setTelefono(rs.getInt(4));
                    System.out.println(emp); // Comando de prueba en consola
                    lista.add(emp);
                }
                return lista;
                
//-------------------------------FACTURA---------------------------------------//                
                
            case "Factura": 
                preparedStatement = con.prepareStatement("select * from "+tabla+
                " where idFactura LIKE '%"+filtro+"%' OR idCliente LIKE '%"+
                filtro+"%' OR dniEmpleado LIKE '%"+filtro+"%' OR fecha LIKE '%"+
                filtro+"%'");
                rs=preparedStatement.executeQuery();
                while (rs.next()){
                    BigDecimal facTotal = new BigDecimal(rs.getDouble(5)).setScale(2, RoundingMode.HALF_UP);
                    Factura fact = new Factura();
                    fact.setIdFactura(rs.getString(1));
                    fact.setIdCliente(rs.getString(2));
                    fact.setDni(rs.getString(3));
                    fact.setImporte(facTotal);
                    fact.setFecha(rs.getDate(4));
                    lista.add(fact);
                }
                return lista;
                
//-------------------------------FACTURA X IDCLIENTE---------------------------//                
                
            case "FacturaCliente": 
                preparedStatement = con.prepareStatement("select * from Factura"
                    + " where idCliente LIKE '"+filtro+"'");
                rs=preparedStatement.executeQuery();
                while (rs.next()){
                    BigDecimal facTotal = new BigDecimal(rs.getDouble(5)).setScale(2, RoundingMode.HALF_UP);
                    Factura fact = new Factura();
                    fact.setIdFactura(rs.getString(1));
                    fact.setIdCliente(rs.getString(2));
                    fact.setDni(rs.getString(3));
                    fact.setImporte(facTotal);
                    fact.setFecha(rs.getDate(4));
                    lista.add(fact);
                }
                return lista;
            
//-------------------------------PRODUCTO--------------------------------------//            
            
            case "Producto":
                preparedStatement = con.prepareStatement("select * from "+tabla+
                " where idProducto LIKE '%"+filtro+"%' OR precioUnitario LIKE '%"+
                filtro+"%' OR marca LIKE '%"+filtro+"%' OR modelo LIKE '%"+
                filtro+"%'");
                rs=preparedStatement.executeQuery();
                while (rs.next()){
                    //BigDecimal n = new BigDecimal(rs.getDouble(4)).round(new MathContext(4, RoundingMode.HALF_UP));
                    BigDecimal n = new BigDecimal(rs.getDouble(4)).setScale(2, RoundingMode.HALF_UP);
                    Producto producto = new Producto();
                    producto.setIdProducto(rs.getString(1));
                    producto.setMarca(rs.getString(2));
                    producto.setModelo(rs.getString(3));
                    producto.setPrecioUnitario(n);
                    lista.add(producto);
                }
                return lista;

//-------------------------------PROMOCION--------------------------------------//    
                
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
                    cliente.setIdCliente(rs.getString(1));
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
            query = 
            "insert into Factura(idCliente,dniEmpleado,importe) values('"+
                    String.valueOf(factura.getIdCliente())+"','"+factura.getDniEmpleado()+"','"+
                    factura.getImporte().toEngineeringString()+"')";
        }else if (obj instanceof Producto){
            Producto prod = (Producto) obj;
            query = 
            "insert into Producto(marca,modelo,precioUnitario) values('"+
                    prod.getMarca()+"','"+prod.getModelo()+"','"+
                    prod.getPrecioUnitario().toEngineeringString()+"')";
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
            System.out.println(ex.getMessage());
            return false;
        }
    }
               
    public boolean UpdateSql(String query){
        
        Statement st;
        try {
            st = con.createStatement();
            if ((st.executeUpdate(query)) == 1){
                JOptionPane.showMessageDialog(null,"El registro ha sido actualizado correctamente.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null,"El registro no ha podido ser actualizado correctamente.");
                return false;
            }
                        
        } catch (MySQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(null,"Uno de los campos presenta un error!");
            System.out.println(e);
            return false;
        } catch (SQLException ex) {
            System.out.println(ex);
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
