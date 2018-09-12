package nicole_test;

public class Presentacion {
    
    public static void main(String[] args){
        
        AccesoSQL acceso = new AccesoSQL();
        
        //acceso.listado();
        
        //acceso.pruebaConexion();
        
        Persona cli2 = new Persona("Alba", "MaPi", "Avda de la caraja-gorda, 2", 54682465);
        acceso.nuevo(cli2);
        
        acceso.cerrar();
        
    }
    
}
