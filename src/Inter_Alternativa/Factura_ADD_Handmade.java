package Inter_Alternativa;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Factura_ADD_Handmade extends JFrame {
	
    public Factura_ADD_Handmade() {
	inicializar();
    }
        
    public void inicializar() {
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setLayout(null);
        
        principal = new JPanel();
        principal.setBounds(10, 10, 1004, 748);
        principal.setBackground(new Color(248,241,242));
        this.add(principal);
        
        
        
        this.setVisible(true);
    }
    
    private JPanel principal;

}