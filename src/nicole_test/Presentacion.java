package nicole_test;

public class Presentacion {
    
    public static void main(String[] args){
        
        AccesoSQL acceso = new AccesoSQL();
        
        acceso.listado();
        
        //acceso.pruebaConexion();
        //Cliente cli2 = new Cliente("manolete", "cantinflas", "Calle serrano, 2", 954458965);
        //Cliente cli3 = new Cliente("Juanito", "juanolas", "Avnda de la polla-santa, 197", 968458235);
        //acceso.nuevo(cli2);
        //acceso.nuevo(cli3);
        
        /*Cliente cli1 = new Cliente("Jesus","Ufano","Calle del perrito caliente 21", 954856932);
        acceso.nuevo(cli1);*/
        acceso.cerrar();
        
    }
    
}
