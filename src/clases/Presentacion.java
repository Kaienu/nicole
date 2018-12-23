package clases;

import Inter_Alternativa.*;
import java.awt.Font;

public class Presentacion {
    
    public static final int REGULAR = 0;
    public static final int LIGHT = 1;
    public static final int BOLD = 2;
    public static final int CONDENSED = 3;
    public static final int MEDIUM = 4;
    public static final int BLACK = 5;
    
    public static void main(String[] args){
        
        new Login_SPLASH().setVisible(true);
        
    }
    
    public static Font fuentePpal(float size, int type, int style) {
        Fuentes fuenteSistema = new Fuentes();
        return fuenteSistema.fuenteRoboto(size, type, style);
    }
    
    public static final Font ESTANDAR() {
        return new Font("Arial", Font.PLAIN, 12);
    }
}