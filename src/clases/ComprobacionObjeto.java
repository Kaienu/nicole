package clases;

/**
 *
 * @author kaien
 */

public class ComprobacionObjeto{
    
    public static boolean Comprobacion(Cliente cliente){
        return !(cliente.getNombre().isEmpty() || cliente.getApellidos().isEmpty());
    }
    
    public static boolean Comprobacion(Empleado empleado){
        return !(empleado.getNombre().isEmpty() || empleado.getApellidos().isEmpty());
    }

}
