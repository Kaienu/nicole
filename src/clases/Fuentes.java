/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author kaien
 */
public class Fuentes {
    
    public Fuentes(){
        
    }
    
    public Font fuenteRoboto(float size,int type,int style) {
        
        try {

            switch (style) {
                case 0:
                    Font fuente = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/recursos/Roboto-Regular.ttf"));
                    return fuente.deriveFont(type, size);
                case 1:
                    Font fuente1 = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/recursos/Roboto-Light.ttf"));
                    return fuente1.deriveFont(type, size);
                case 2:
                    Font fuente2 = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/recursos/Roboto-Bold.ttf"));
                    return fuente2.deriveFont(type, size);
                case 3:
                    Font fuente3 = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/recursos/Roboto-Condensed.ttf"));
                    return fuente3.deriveFont(type, size);
                case 4:
                    Font fuente4 = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/recursos/Roboto-Medium.ttf"));
                    return fuente4.deriveFont(type, size);
                case 5:
                    Font fuente5 = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/recursos/Roboto-Black.ttf"));
                    return fuente5.deriveFont(type, size);
                default:
                    JOptionPane.showMessageDialog(null, "Error al introducir el parámetro del estilo de fuente.", "Error 11", JOptionPane.ERROR_MESSAGE);
                    return Presentacion.ESTANDAR();
            }
        
        }catch(FontFormatException | IOException e){
            JOptionPane.showMessageDialog(null, "Error al cargar la fuente del Sistema! Cargando la fuente por defecto.", "Error 12", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            return Presentacion.ESTANDAR();
        }
    }
    
}
