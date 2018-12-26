package clases;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class AccesoSQL {
    
    private Connection con;
    private int autonum;
    private static boolean intentos = false;
    
    public AccesoSQL(){
        
        con = Conexion.getConnection();
        
        if (con==null) {
            System.err.println("No se pudo establecer la conexion!");
        } else {
            System.out.println("Conexion adquirida");
        }
    }
		
    public static void setIntento(boolean intent) {
        intentos = intent;
    }
    
    public static boolean getIntento() {
        return intentos;
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
        PreparedStatement ps;
        ResultSet rs;
        
        switch (tabla){ //Selecciona por el campo introducido como parámetro
        
//-------------------------------CLIENTE---------------------------------------//            
            
            case "Cliente":
            ps = con.prepareStatement("select * from "+tabla+
            " where nombre LIKE '%"+filtro+"%' OR apellidos LIKE '%"+
            filtro+"%' OR correo LIKE '%"+filtro+"%' OR telefono LIKE '%"+
            filtro+"%'");
            rs=ps.executeQuery();
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getString(1));
                    cliente.setNombre(rs.getString(2));
                    cliente.setApellidos(rs.getString(3));
                    cliente.setCorreo(rs.getString(4));
                    cliente.setTelefono(rs.getInt(5));
                    cliente.setObservaciones(rs.getString(6));
                    //System.out.println(cliente); // Comando de prueba en consola
                    lista.add(cliente);
                }
                rs.close();
                ps.close(); 
                return lista;

//-------------------------------EMPLEADO--------------------------------------//
                
            case "Empleado":
                ps = con.prepareStatement("select * from "+tabla+
                " where nombre LIKE '%"+filtro+"%' OR apellidos LIKE '%"+
                filtro+"%' OR correo LIKE '%"+filtro+"%' OR telefono LIKE '%"+
                filtro+"%'");
                rs=ps.executeQuery();
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
                rs.close();
                ps.close(); 
                return lista;
                
//-------------------------------FACTURA---------------------------------------//                
                
            case "Factura": 
                /*ps = con.prepareStatement("select * from "+tabla+
                " where idFactura LIKE '%"+filtro+"%' OR idCliente LIKE '%"+
                filtro+"%' OR dniEmpleado LIKE '%"+filtro+"%' OR fecha LIKE '%"+
                filtro+"%'");*/
                ps = con.prepareStatement("select * from "+tabla);
                rs=ps.executeQuery();
                while (rs.next()){
                    BigDecimal facTotal = new BigDecimal(rs.getDouble(5)).setScale(2, RoundingMode.HALF_UP);
                    Factura fact = new Factura();
                    fact.setIdFactura(rs.getString(1));
                    fact.setIdCliente(rs.getString(2));
                    fact.setDni(rs.getString(3));
                    fact.setImporte(facTotal);
                    fact.setFecha(rs.getDate(4));
                    System.out.println(fact);
                    lista.add(fact);
                }
                rs.close();
                ps.close(); 
                return lista;
                
//-------------------------------FACTURA X IDCLIENTE---------------------------//                
                
            case "FacturaCliente": 
                ps = con.prepareStatement("select * from Factura"
                    + " where idCliente LIKE '"+filtro+"'");
                rs=ps.executeQuery();
                while (rs.next()){
                    BigDecimal facTotal = new BigDecimal(rs.getDouble(5)).setScale(2, RoundingMode.HALF_UP);
                    Factura fact = new Factura();
                    fact.setIdFactura(rs.getString(1));
                    fact.setIdCliente(rs.getString(2));
                    fact.setDni(rs.getString(3));
                    fact.setImporte(facTotal);
                    fact.setFecha(rs.getDate(4));
                    System.out.println(fact);
                    lista.add(fact);
                }
                rs.close();
                ps.close(); 
                return lista;
            
//-------------------------------PRODUCTO--------------------------------------//            
            
            case "Producto":
                ps = con.prepareStatement("select * from "+tabla+
                " where idProducto LIKE '%"+filtro+"%' OR precioUnitario LIKE '%"+
                filtro+"%' OR tipo LIKE '%"+filtro+"%' OR marca LIKE '%"+filtro+"%' OR modelo LIKE '%"+
                filtro+"%'");
                rs=ps.executeQuery();
                while (rs.next()){
                    //BigDecimal n = new BigDecimal(rs.getDouble(4)).round(new MathContext(4, RoundingMode.HALF_UP));
                    BigDecimal n = new BigDecimal(rs.getDouble(5)).setScale(2, RoundingMode.HALF_UP);
                    Producto producto = new Producto();
                    producto.setIdProducto(rs.getString(1));
                    producto.setTipo(rs.getString(2));
                    producto.setMarca(rs.getString(3));
                    producto.setModelo(rs.getString(4));
                    producto.setPrecioUnitario(n);
                    producto.setObservaciones(rs.getString(6));
                    lista.add(producto);
                }
                rs.close();
                ps.close(); 
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
        PreparedStatement ps;
        ResultSet rs;
        switch (tabla){ //Selecciona por el campo introducido como parámetro
        
            case "Cliente":
                ps = con.prepareStatement("select * from "+
                        tabla+" where idCliente = "+id);
                rs=ps.executeQuery();
                Cliente cliente = new Cliente();
                while (rs.next()) {
                    cliente.setIdCliente(rs.getString(1));
                    cliente.setNombre(rs.getString(2));
                    cliente.setApellidos(rs.getString(3));
                    cliente.setCorreo(rs.getString(4));
                    cliente.setTelefono(rs.getInt(5));
                    cliente.setObservaciones(rs.getString(6));
                    cliente.setFechaAlta(rs.getDate(7));
                    //System.out.println(cliente); // Comando de prueba en consola
                }
                rs.close();
                ps.close(); 
                return (Object) cliente;
                
            case "Empleado":
                ps = con.prepareStatement("select * from "+
                        tabla+" where id = "+id);
                rs=ps.executeQuery();
                Empleado emp = new Empleado();
                while (rs.next()) {
                    emp.setDni(rs.getString(1));
                    emp.setNombre(rs.getString(2));
                    emp.setApellidos(rs.getString(3));
                    emp.setCorreo(rs.getString(4));
                    emp.setTelefono(rs.getInt(5));
                    //System.out.println(cliente); // Comando de prueba en consola
                }
                rs.close();
                ps.close(); 
                return (Object) emp;
                
            case "Factura": 
                ps = con.prepareStatement("select * from "+
                        tabla+" where idFactura = "+id);
                rs=ps.executeQuery();
                Factura fact = new Factura();
                while (rs.next()) {
                    BigDecimal n = new BigDecimal(rs.getDouble(5)).setScale(2, RoundingMode.HALF_UP);
                    fact.setIdFactura(rs.getString(1));
                    fact.setDni(rs.getString(3));
                    fact.setFecha(rs.getDate(4));
                    fact.setIdCliente(rs.getString(2));
                    fact.setImporte(n);
                }
                return (Object) fact;
                
            case "Producto": //JOptionPane.showMessageDialog(null,"No implementado aun");
            ps = con.prepareStatement("select * from "+
                        tabla+" where idProducto = "+id);
                rs=ps.executeQuery();
                Producto produ = new Producto();
                while (rs.next()) {
                    BigDecimal n = new BigDecimal(rs.getDouble(5)).setScale(2, RoundingMode.HALF_UP);
                    produ.setIdProducto(rs.getString(1));
                    produ.setTipo(rs.getString(2));
                    produ.setMarca(rs.getString(3));
                    produ.setModelo(rs.getString(4));
                    produ.setPrecioUnitario(n);
                    produ.setObservaciones(rs.getString(6));
                }
                return (Object) produ;
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
            "insert into Cliente(nombre,apellidos,correo,telefono,observaciones) values('"+
                    cliente.getNombre()+"','"+cliente.getApellidos()+"','"+
                    cliente.getCorreo()+"',"+cliente.getTelefono()+",'"+cliente.getObservaciones()+"')";
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
            "insert into Producto(tipo,marca,modelo,precioUnitario,observaciones) values('"+
                    prod.getTipo()+"','"+prod.getMarca()+"','"+
                    prod.getModelo()+"','"+prod.getPrecioUnitario().toEngineeringString()+"')"+
                    prod.getObservaciones();
        }else if (obj instanceof Promocion){
            Promocion prom = (Promocion) obj;
            query ="";
        }else{
            
        }
            
        PreparedStatement st;
        
        try {
            st = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            if ((st.executeUpdate()) == 1){
                JOptionPane.showMessageDialog(null,
                        "El registro ha sido insertado correctamente.");
                ResultSet res = st.getGeneratedKeys();
                res.next();
                autonum = res.getInt(1);
                st.close();
                return true;
            } else {
                st.close();
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
        
        PreparedStatement st;
        try {
            st = con.prepareStatement(query);
            if ((st.executeUpdate()) == 1){
                JOptionPane.showMessageDialog(null,"El registro ha sido actualizado correctamente.");
                st.close();
                return true;
            } else {
                JOptionPane.showMessageDialog(null,"El registro no ha podido ser actualizado correctamente.");
                st.close();
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
    
    public boolean insertLista(ArrayList<Producto> lista, String auto) {
        try {
            con.setAutoCommit(false);
            String query =
                    "insert into Linea(idFactura,idProducto,idPromocion,cantidad,importeLinea)"
                    +" values(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            int i = 0;
            for (Producto p : lista) {
                st.setString(1, auto);
                st.setString(2, p.getIdProducto());
                st.setString(3, "0000001");
                st.setString(4, String.valueOf(p.getCount()));
                st.setString(5, p.getPrecioTotalAcumulado().toEngineeringString());
                st.addBatch();
            }
            int[] contador = st.executeBatch();
            if (comprobarContador(contador)){
                con.commit();
                System.out.println("Lineas generadas correctamente.");
                st.close();
                return true;
            }
            System.err.println("Error al crear las lineas de factura!");
            st.close();
            return false;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"El registro no ha podido ser actualizado correctamente.");
            return false;
        }
    }
    
    public boolean comprobarContador(int[] contador){
        for (int i=0;i<contador.length;i++){
            if (contador[i] >= 0) {
                System.out.println("OK");
            } else if (contador[i] == Statement.SUCCESS_NO_INFO){
                System.out.println("OK...");
            } else if (contador[i] == Statement.EXECUTE_FAILED){
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<Linea> facturaFormateada(String idFact) throws SQLException{
        ArrayList<Linea> lineas = new ArrayList<>();
        String query = "select Producto.modelo, Linea.cantidad, Linea.idPromocion,"
            +" Linea.importeLinea from Linea inner join Producto on "
            +"Linea.idProducto=Producto.idProducto where Linea.idFactura like"
            +" '"+idFact+"'";
        PreparedStatement st = con.prepareStatement(query);
        ResultSet rs = st.executeQuery();
        while (rs.next()){
            Linea linea = new Linea();
            BigDecimal n = new BigDecimal(rs.getDouble(4)).setScale(2, RoundingMode.HALF_UP);
            linea.setModelo(rs.getString(1));
            linea.setCantidad(rs.getInt(2));
            linea.setIdPromocion(rs.getString(3));
            linea.setImporteLinea(n);
            lineas.add(linea);
        }
        rs.close();
        st.close();
        return lineas;
    }
    
    public String getAutonum(){
        String auto = String.format("%08d", autonum);
        return auto;
    }
    
    public void cerrar() {
		
	try {
            con.close();
	} catch (SQLException e) {
            System.out.println(e.getMessage());
	}
    }
    
}
