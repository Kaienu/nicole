/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Inter_Alternativa.NewJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kaien
 */
public class MainHandler implements ActionListener {

    NewJFrame ventana;
    Producto prod;
    JButton boton;
    
    public MainHandler(NewJFrame ventana) {
        this.ventana = ventana;
    }

    public void setProducto(Producto prod){
        this.prod = prod;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        boton = (JButton)e.getSource();
        for (int i=0;i<ventana.getLista().size();i++) {
            prod = (Producto)ventana.getLista().get(i);
            if (prod.getModelo().equals(boton.getText())) {
                ventana.setTabla(prod);
                break;
            }
        }
        
        
        /*String detalle = 
        boton = (JButton) e.getSource();
        Iterator<Object> it = ventana.lista.iterator();
        while (it.hasNext()) {
            prod = (Producto) it;
            if (boton.getText().equals(prod.getModelo())){
                ventana.setTabla(prod);
                break;
            }
        }*/
        
    }
    
    
    
}
