package clases;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test {
    
    public static void main(String[] args){
        
        AccesoSQL acceso = new AccesoSQL();
        //acceso.UpdateSql("INSERT INTO `Producto`(`marca`, `modelo`, `precioUnitario`) VALUES ('Rowenta','Secador 3000W','50'","insertar");
        try {
            acceso.listado("Empleado","");
            
            //acceso.pruebaConexion();
            
            //Persona cli1 = new Persona("José", "Piñones Amargos", "josepi@petete.com", 956853214);
            //acceso.nuevo(cli1);
            
            //acceso.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}