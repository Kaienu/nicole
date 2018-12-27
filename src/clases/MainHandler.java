/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Inter_Alternativa.Factura_ADD;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author kaien
 */
public class MainHandler implements ActionListener {

    Factura_ADD ventana;
    Producto prod;
    JButton boton;
    ArrayList<JButton> pulsadores;
    
    public MainHandler(Factura_ADD ventana) {
        this.ventana = ventana;
    }

    public void setProducto(Producto prod){
        this.prod = prod;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        boton = (JButton)e.getSource();
        
        System.out.println(boton.getClass());
        System.out.println(boton);
        
        if (ventana.getTextos().contains(boton)) {
            System.out.println(boton.getText());
            pulsadores = ventana.getTextos();
            for (JButton but : pulsadores) {
                if (boton.equals(but)) {
                    but.setBackground(Color.PINK);
                    but.setForeground(Color.BLACK);
                    ventana.asignarLista(boton.getText());
                } else {
                    but.setBackground(new Color(225,225,225));
                    but.setForeground(new Color(219,126,138));
                }
            }
            ventana.setTextos(pulsadores);
        } else {
            for (int i=0;i<ventana.getLista().size();i++) {
                prod = (Producto)ventana.getLista().get(i);
                if (prod.getModelo().equals(boton.getText())) {
                    ventana.addTabla(prod);
                    break;
                }
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
