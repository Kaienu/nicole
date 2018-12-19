/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inter_Alternativa;

import clases.AccesoSQL;
import clases.Cliente;
import clases.Empleado;
import clases.Producto;
import java.util.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antonio
 */
public class Inter_Ticket_alt extends javax.swing.JFrame {

    /**
     * Creates new form Inter_Ticket
     */
    Inter_Login login = new Inter_Login();
    AccesoSQL acceso = new AccesoSQL();
    
    public void camposNoEditables(){
        this.campoEmpleado.setEditable(false);
        this.campoPrecio.setEditable(false);
    }
    
    public String fechaActual(){
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return hourdateFormat.format(date);
    }
    
    public void mostrarProductos() throws SQLException{
        
        ArrayList<Object> lista = new ArrayList<>();
        try {
            lista = acceso.listado("Producto", "");
        } catch (SQLException e) {
            //Error 05;
        }

        Iterator<Object> it = lista.iterator();
        while (it.hasNext()) {
            Producto producto = (Producto) it.next();
            jComboBox1.addItem(producto);
        }
    }
    
    public void agregarProducto() throws SQLException{
        Producto productoSeleccionado =  (Producto) jComboBox1.getSelectedItem();//Capturar en un String el producto seleccionado en el comboBox
              
            DefaultTableModel model = (DefaultTableModel) tablero.getModel();
            Object[] row = new Object[4];
           
                row[0] = productoSeleccionado.getIdProducto();
                row[1] = productoSeleccionado.getMarca();
                row[2] = productoSeleccionado.getModelo();
                row[3] = productoSeleccionado.getPrecioUnitario()+"€";
                model.addRow(row);
        
    }

    
    public void limpiar(){
        this.campoCliente.setText("");
        jComboBox1.setSelectedIndex(0);
    }
    
    public Inter_Ticket_alt() throws SQLException {
        initComponents();
        camposNoEditables();
        mostrarProductos();
        campoEmpleado.setText(login.obtenerUsuarioLogado());        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Display_User3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        botonGuardar = new javax.swing.JButton();
        etqEmpleado = new javax.swing.JLabel();
        campoEmpleado = new javax.swing.JTextField();
        etqEmpleado1 = new javax.swing.JLabel();
        campoCliente = new javax.swing.JTextField();
        botonImprimir = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        etqProducto = new javax.swing.JLabel();
        botonAgregarProducto = new javax.swing.JButton();
        etqPrecio = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        botonLimpiar = new javax.swing.JButton();
        tableroProductos = new javax.swing.JScrollPane();
        tablero = new javax.swing.JTable();
        botonBuscarCliente = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        jTable_Display_User3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellidos", "Correo", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Display_User3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_User3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_Display_User3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 241, 242));
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(248, 241, 242));

        botonGuardar.setBackground(new java.awt.Color(243, 206, 211));
        botonGuardar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(219, 126, 138));
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        etqEmpleado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        etqEmpleado.setForeground(new java.awt.Color(219, 126, 138));
        etqEmpleado.setText("Empleado:");

        campoEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmpleadoActionPerformed(evt);
            }
        });

        etqEmpleado1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        etqEmpleado1.setForeground(new java.awt.Color(219, 126, 138));
        etqEmpleado1.setText("Cliente:");

        campoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoClienteActionPerformed(evt);
            }
        });

        botonImprimir.setBackground(new java.awt.Color(243, 206, 211));
        botonImprimir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonImprimir.setForeground(new java.awt.Color(219, 126, 138));
        botonImprimir.setText("Imprimir");
        botonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImprimirActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(243, 206, 211));
        jComboBox1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(219, 126, 138));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        etqProducto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        etqProducto.setForeground(new java.awt.Color(219, 126, 138));
        etqProducto.setText("Producto:");

        botonAgregarProducto.setBackground(new java.awt.Color(243, 206, 211));
        botonAgregarProducto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonAgregarProducto.setForeground(new java.awt.Color(219, 126, 138));
        botonAgregarProducto.setText("Agregar Producto");
        botonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProductoActionPerformed(evt);
            }
        });

        etqPrecio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        etqPrecio.setForeground(new java.awt.Color(219, 126, 138));
        etqPrecio.setText("Precio total:");

        campoPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecioActionPerformed(evt);
            }
        });

        botonLimpiar.setBackground(new java.awt.Color(243, 206, 211));
        botonLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(219, 126, 138));
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        tablero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Precio unitario"
            }
        ));
        tableroProductos.setViewportView(tablero);

        botonBuscarCliente.setBackground(new java.awt.Color(243, 206, 211));
        botonBuscarCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonBuscarCliente.setForeground(new java.awt.Color(219, 126, 138));
        botonBuscarCliente.setText("Buscar Cliente");
        botonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteActionPerformed(evt);
            }
        });

        botonAtras.setBackground(new java.awt.Color(243, 206, 211));
        botonAtras.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(219, 126, 138));
        botonAtras.setText("Atras");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqPrecio)
                    .addComponent(etqProducto)
                    .addComponent(etqEmpleado1)
                    .addComponent(etqEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonAgregarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(botonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tableroProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(campoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botonAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tableroProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_Display_User3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_User3MouseClicked
        

    }//GEN-LAST:event_jTable_Display_User3MouseClicked

    private void botonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClienteActionPerformed
        String tlf = this.campoCliente.getText();
        Cliente cliente = new Cliente();
        try {
            ArrayList<Object> lista = acceso.listado("Cliente", tlf);
            cliente = (Cliente) lista.get(0);

        } catch (SQLException e){
        }
        if(cliente.getNombre()== null && cliente.getApellidos() == null){
            JOptionPane.showMessageDialog(null, "El nº de teléfono introducido no pertenece a ningún usuario registrado.", "¡Atención!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            this.campoCliente.setText(cliente.getNombre() + " " + cliente.getApellidos());
        }

    }//GEN-LAST:event_botonBuscarClienteActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void campoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioActionPerformed

    private void botonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductoActionPerformed
        try {
            agregarProducto();
        } catch (SQLException e) {
        }
        
    }//GEN-LAST:event_botonAgregarProductoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void botonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImprimirActionPerformed
        
    }//GEN-LAST:event_botonImprimirActionPerformed

    private void campoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoClienteActionPerformed

    private void campoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmpleadoActionPerformed

    }//GEN-LAST:event_campoEmpleadoActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Inter_Ticket_alt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inter_Ticket_alt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inter_Ticket_alt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inter_Ticket_alt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Inter_Ticket_alt().setVisible(true);
                } catch (SQLException ex) {
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBuscarCliente;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonImprimir;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JTextField campoEmpleado;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JLabel etqEmpleado;
    private javax.swing.JLabel etqEmpleado1;
    private javax.swing.JLabel etqPrecio;
    private javax.swing.JLabel etqProducto;
    private javax.swing.JComboBox<Object> jComboBox1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_Display_User3;
    private javax.swing.JTable tablero;
    private javax.swing.JScrollPane tableroProductos;
    // End of variables declaration//GEN-END:variables
}