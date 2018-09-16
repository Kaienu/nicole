package clases;

import Inter_Alternativa.*;

public class Presentacion {
    
    public static void main(String[] args){
        
        /*Frame f = new Frame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);*/
        
        new Inter_Menu().setVisible(true);
    
        //AccesoSQL acceso = new AccesoSQL();
        
        //acceso.listado("select * from Cliente");
        
        //acceso.pruebaConexion();
        
        //Persona cli1 = new Persona("José", "Piñones Amargos", "josepi@petete.com", 956853214);
        //acceso.nuevo(cli1);
        
        //acceso.cerrar();
        
    }
}
/*    
class Frame extends JFrame {
    public Frame(){
        setLayout(new BorderLayout());
        setBounds(500, 100, 500, 400);
        Panel p = new Panel();
        add(p);
    }
}

class Panel extends JPanel{
    public Panel(){
        
        setLayout(new BorderLayout());
        
        try {
            String nombre,apellido,correo;
            int idCliente,telefono;
            
            AccesoSQL acceso = new AccesoSQL();
            
            acceso.preparedStatement = acceso.con.prepareStatement("select * from Cliente");
            acceso.rs = acceso.preparedStatement.executeQuery();
            
            String[] columnas={"idCliente","nombre","apellidos","correo","telefono"};
            JTable tabla = new JTable();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(columnas);
            tabla.setModel(modelo);
            while(acceso.rs.next()){
                idCliente=acceso.rs.getInt(1);
                nombre=acceso.rs.getString(2);
                apellido=acceso.rs.getString(3);
                correo=acceso.rs.getString(4);
                telefono=acceso.rs.getInt(5);
                modelo.addRow(new Object[]{idCliente,nombre,apellido,correo,telefono});
            }
            JScrollPane scroll = new JScrollPane(tabla);
            add(scroll,BorderLayout.CENTER);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
        }
    
    }
}*/
    
