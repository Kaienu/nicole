package nicole_test;

public class Presentacion {
    
    public static void main(String[] args){
        
        AccesoSQL acceso = new AccesoSQL();
        
        //acceso.pruebaConexion();
        Cliente cli2 = new Cliente();
        acceso.nuevo(cli2);
        
    }
    
}
