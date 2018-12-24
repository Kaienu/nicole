package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion extends Thread {
    
    static private volatile Connection con;
    private static final String SURL = "jdbc:mysql://192.168.1.35/nicole";
    private static final String EXTURL = "jdbc:mysql://79.148.58.130/nicole";
    private static final String USU = "pedro";
    private static final String PASS = "oxgnub";
    
    @Override
    public void run(){
           try {
            con = DriverManager.getConnection(SURL, USU, PASS);
            if (con.isClosed()) System.out.println("Error en la conexión local");
            else System.out.println("Conexión exitosa");		
	} catch (SQLException e) {
            System.out.println(e.getMessage());
	}
    }
    
    static public Connection getConnection() {
        Conexion h = new Conexion();
        if (AccesoSQL.getIntento()) {
            return remoteConnect();
        } else {
            int i = 0;
            h.start();
            try {
                while (i<2) {
                    if (con==null) {
                        i++;                
                        System.out.println("Intento "+i+"...");
                        Thread.sleep(1000);
                    } else if (con.isClosed()) {
                        i++;                
                        System.out.println("Intento "+i+"...");
                        Thread.sleep(1000);
                    } else {
                        return con;
                    }
                }
                h.interrupt();
                AccesoSQL.setIntento(true);
                System.out.println("No se pudo acceder a la BBDD en local. Accediendo mediante WAN...");
                return remoteConnect();
            } catch (InterruptedException | SQLException e) {
                AccesoSQL.setIntento(true);
                System.out.println("No se pudo acceder a la BBDD en local. Accediendo mediante WAN...");
                return remoteConnect();
            }   
        }
    }
    
    static private Connection remoteConnect(){
        try {
            con = DriverManager.getConnection(EXTURL, USU, PASS);
            if (con.isClosed()) System.out.println("Error en la conexión remota");
            else System.out.println("Conexión exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"Error al acceder a la Base de Datos");
        }
        return con;
    }
    
}
