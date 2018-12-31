/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inter_Alternativa;

import clases.*;
import interfaces.Permisos;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kaien
 */
public class Producto_EDIT extends JFrame implements Permisos {

    private String id;
    int edit_mode = 0;
    AccesoSQL acceso;
    Producto producto;
    ArrayList<Producto> carrito  = new ArrayList<>();
    private ArrayList<String> lista;
    
    /**
     * Creates new form Inter_Producto_edit
     * @param id
     */
    public Producto_EDIT(String id) {
        initComponents();
        modificarCampos(false);
        this.id = id;
        acceso = new AccesoSQL();
        try {
            producto = (Producto) acceso.listadoID("Producto",id);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
        obtenerDatos();
        llenarCombo();
        comprobacionPermisos();
    }

    private Producto_EDIT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void comprobacionPermisos() {
        switch (R.getEmpleadoLogado().getPermisos()) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                botonEliminar.setEnabled(false);
                break;
        }
    }
    
    public void modificarCampos(boolean opcion) { //YES
        campoIDproducto.setEditable(false);
        campoTipo.setEditable(opcion);
        campoMarca.setEditable(opcion);
        campoModelo.setEditable(opcion);
        campoPrecio.setEditable(opcion);
        campoPrecio.setVisible(!opcion);
        campoPrecio1.setEditable(opcion);
        campoPrecio1.setVisible(opcion);
        campoObservaciones.setEditable(opcion);
        if (opcion) campoObservaciones.setBackground(Color.white);
        else campoObservaciones.setBackground(new Color(240,240,240));
    }
    
    public void obtenerDatos() {
        campoIDproducto.setText(id);
        campoIDproducto.setText(producto.getIdProducto());
        campoMarca.setText(producto.getMarca());
        campoModelo.setText(producto.getModelo());
        campoTipo.setText(producto.getTipo());
        campoPrecio.setText(String.valueOf(producto.getPrecioUnitario())+"€");
        campoPrecio1.setText(String.valueOf(producto.getPrecioUnitario()));
        campoObservaciones.setText(producto.getObservaciones());
        comboTipo.setVisible(false);
    }
    
    public void cancelarModificacion() {
        modificarCampos(false);
        botonAtras.setEnabled(true);
        botonModificar.setText("Modificar");
        botonEliminar.setText("Eliminar");
        comboTipo.setVisible(false);
        campoTipo.setVisible(true);
    }
    
    public void modificarProductos() {
        String combo = (String)comboTipo.getSelectedItem();
        this.producto.setTipo(combo);
        this.producto.setMarca(campoMarca.getText());
        this.producto.setModelo(campoModelo.getText()); 
        BigDecimal precio = new BigDecimal(Double.parseDouble(campoPrecio1.getText())).setScale(2, RoundingMode.HALF_UP);
        this.producto.setPrecioUnitario(precio);
        this.producto.setObservaciones(campoObservaciones.getText());
    }
    
     public void llenarCombo() {
        lista = new ArrayList<>();
        try {
            lista = acceso.selectSQLDistinct("Producto", "tipo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (String s : lista) {
            String pro = s;
            comboTipo.addItem(pro);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_Busqueda1 = new javax.swing.JTextField();
        jTextField_Busqueda6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        botonAdd1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelIDproducto = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        etqTipo = new javax.swing.JLabel();
        etqMarca = new javax.swing.JLabel();
        etqModelo = new javax.swing.JLabel();
        etqPrecio = new javax.swing.JLabel();
        etqObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoObservaciones = new javax.swing.JTextArea();
        campoMarca = new javax.swing.JTextField();
        campoModelo = new javax.swing.JTextField();
        campoPrecio = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();
        campoIDproducto = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox<>();
        campoTipo = new javax.swing.JTextField();
        campoPrecio1 = new javax.swing.JTextField();

        jTextField_Busqueda1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jTextField_Busqueda6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField_Busqueda6.setText("608505377");
        jTextField_Busqueda6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Busqueda6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Cliente desde \"Fecha\"");

        botonAdd1.setBackground(new java.awt.Color(225, 225, 225));
        botonAdd1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonAdd1.setForeground(new java.awt.Color(219, 126, 138));
        botonAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdd1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)), R.getEmpleadoLogado().getNombreCompleto(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Century Gothic", 0, 18), new java.awt.Color(219, 126, 138))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIDproducto.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelIDproducto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelIDproducto.setText("ID:");
        jPanel1.add(jLabelIDproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 35));

        botonAtras.setBackground(new java.awt.Color(225, 225, 225));
        botonAtras.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(219, 126, 138));
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/volver-Normal.png"))); // NOI18N
        botonAtras.setText("Atrás");
        botonAtras.setMaximumSize(new java.awt.Dimension(105, 31));
        botonAtras.setMinimumSize(new java.awt.Dimension(105, 31));
        botonAtras.setPreferredSize(new java.awt.Dimension(105, 31));
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 130, 40));

        botonModificar.setBackground(new java.awt.Color(225, 225, 225));
        botonModificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(219, 126, 138));
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lapiz.png"))); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 40));

        etqTipo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        etqTipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqTipo.setText("Tipo:");
        jPanel1.add(etqTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 60, 35));

        etqMarca.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        etqMarca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqMarca.setText("Marca:");
        jPanel1.add(etqMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 60, 35));

        etqModelo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        etqModelo.setText("Modelo:");
        jPanel1.add(etqModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 35));

        etqPrecio.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        etqPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqPrecio.setText("Precio:");
        jPanel1.add(etqPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 35));

        etqObservaciones.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        etqObservaciones.setText("Observaciones");
        jPanel1.add(etqObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, 35));

        campoObservaciones.setColumns(20);
        campoObservaciones.setFont(R.fuenteRoboto

            (16, R.PLAIN, R.LIGHT));
        campoObservaciones.setRows(5);
        jScrollPane1.setViewportView(campoObservaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 410, 150));

        campoMarca.setFont(R.fuenteRoboto

            (18, R.PLAIN, R.LIGHT));
        campoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(campoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 150, 35));

        campoModelo.setFont(R.fuenteRoboto

            (18, R.PLAIN, R.LIGHT));
        jPanel1.add(campoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 340, 35));

        campoPrecio.setFont(R.fuenteRoboto

            (18, R.PLAIN, R.LIGHT));
        jPanel1.add(campoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 100, 35));

        botonEliminar.setBackground(new java.awt.Color(225, 225, 225));
        botonEliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(219, 126, 138));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrar.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, 40));

        campoIDproducto.setFont(R.fuenteRoboto

            (18, R.PLAIN, R.LIGHT));
        jPanel1.add(campoIDproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, 35));

        comboTipo.setFont(R.fuenteRoboto

            (18, R.PLAIN, R.LIGHT));
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el Tipo" }));
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 150, 35));

        campoTipo.setFont(R.fuenteRoboto

            (18, R.PLAIN, R.LIGHT));
        jPanel1.add(campoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 150, 35));

        campoPrecio1.setFont(R.fuenteRoboto

            (18, R.PLAIN, R.LIGHT));
        jPanel1.add(campoPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 100, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Busqueda6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Busqueda6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Busqueda6ActionPerformed

    private void botonAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAdd1ActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        acceso.cerrar();
        new Producto_BUSQ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if (R.getEmpleadoLogado().getPermisos()<2) {
            JButton boton = (JButton)evt.getSource();
            if (boton.getText().equalsIgnoreCase("Modificar")) {
                modificarCampos(true);
                comboTipo.setVisible(true);
                comboTipo.setSelectedItem(producto.getTipo());
                campoTipo.setVisible(false);
                botonAtras.setEnabled(false);
                botonModificar.setText("Guardar");
                botonEliminar.setText("Cancelar");
            } else if(boton.getText().equalsIgnoreCase("Guardar")) {
                int eleccion = JOptionPane.showConfirmDialog(null, "¿Desea aplicar los cambios?", "Confirmación de cambios", JOptionPane.OK_CANCEL_OPTION);
                if (eleccion == 0) {
                        modificarProductos();
                        comboTipo.setVisible(false);
                        campoTipo.setVisible(true);
                        obtenerDatos();                
                    if (acceso.updateProducto(producto)) {
                        cancelarModificacion();
                    }
                }
            }
        } else {
            JButton boton = (JButton)evt.getSource();
            if (boton.getText().equalsIgnoreCase("Modificar")) {
                campoObservaciones.setEnabled(true);
                campoObservaciones.setEditable(true);
                campoObservaciones.setBackground(Color.white);
                botonAtras.setEnabled(false);
                botonEliminar.setEnabled(true);
                botonModificar.setText("Guardar");
                botonEliminar.setText("Cancelar");
            } else if(boton.getText().equalsIgnoreCase("Guardar")) {
                int eleccion = JOptionPane.showConfirmDialog(null, "¿Desea aplicar los cambios?", "Confirmación de cambios", JOptionPane.OK_CANCEL_OPTION);
                if (eleccion == 0) {
                    producto.setObservaciones(campoObservaciones.getText());
                    if (acceso.updateProducto(producto)) {
                        cancelarModificacion();
                    }
                }
            }
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        JButton boton = (JButton)evt.getSource();
        if (boton.getText().equalsIgnoreCase("Eliminar")) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este producto?", "¡Atención!", JOptionPane.YES_NO_OPTION);
                if (resp == 0){
                    String query = "DELETE FROM `Producto` WHERE  `idProducto` = " + this.id;
                    acceso.updateSql(query);
                    new Producto_BUSQ().setVisible(true);
                    this.dispose();    
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha eliminado el producto");
                }
        } else if (boton.getText().equalsIgnoreCase("Cancelar")) {
            cancelarModificacion();
        }    
               
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void campoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMarcaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Producto_EDIT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdd1;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField campoIDproducto;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextArea campoObservaciones;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoPrecio1;
    private javax.swing.JTextField campoTipo;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel etqMarca;
    private javax.swing.JLabel etqModelo;
    private javax.swing.JLabel etqObservaciones;
    private javax.swing.JLabel etqPrecio;
    private javax.swing.JLabel etqTipo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelIDproducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_Busqueda1;
    private javax.swing.JTextField jTextField_Busqueda6;
    // End of variables declaration//GEN-END:variables
}
