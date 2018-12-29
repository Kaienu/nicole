/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inter_Alternativa;

import clases.*;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author kaien
 */
public class Empleado_MAIN extends javax.swing.JFrame {

    int edit_mode = 0;
    AccesoSQL acceso;
    
    /**
     * Creates new form Inter_Empleados
     */
    public Empleado_MAIN() {
        initComponents();
        acceso = new AccesoSQL();
        ArrayList<Object> lista = new ArrayList<>();
        try {
            lista = acceso.listado("Empleado", "");
        } catch (SQLException e) {
            //Error 05;
        }

        Iterator<Object> it = lista.iterator();
        while (it.hasNext()) {
            Empleado empleado = (Empleado) it.next();
            jComboBox1.addItem(empleado);
        }
        jTextFieldDni.setEnabled(false);
        jTextFieldApellidos.setEnabled(false);
        jTextFieldCorreo.setEnabled(false);
        jTextFieldNombre.setEnabled(false);
        jTextFieldTelefono.setEnabled(false);

    }
    
    public void MostrarSQL(String tabla,String filtro) throws SQLException{

        ArrayList<Object> lista = acceso.listado(tabla,filtro);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        for(int i = 0; i < lista.size();i++){
            Factura fact = (Factura) lista.get(i);
            row[0] = fact.getIdFactura();
            row[1] = fact.getImporte().toEngineeringString();
            row[2] = fact.getFecha().toString();
            row[3] = fact.getIdCliente();
            model.addRow(row);
        }
    }
    
    /**************************************************
    FALTA INSERTAR LA FECHA DE ALTA Y BAJA DEL EMPLEADO    
    **************************************************/
    
    
    public String fechaActual(){
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return hourdateFormat.format(date);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldDni3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        botonBaja = new javax.swing.JButton();

        jTextFieldDni3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleciona empleado" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox1MouseEntered(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButtonNuevo.setBackground(new java.awt.Color(225, 225, 225));
        jButtonNuevo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonNuevo.setForeground(new java.awt.Color(219, 126, 138));
        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/anadir.png"))); // NOI18N
        jButtonNuevo.setText("Nuevo Empleado");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura", "Importe", "Fecha", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextFieldDni.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("DNI");

        jTextFieldNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jTextFieldApellidos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jTextFieldTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Apellidos");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Correo");

        jTextFieldCorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jButtonEditar.setBackground(new java.awt.Color(225, 225, 225));
        jButtonEditar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(219, 126, 138));
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lapiztiny.png"))); // NOI18N
        jButtonEditar.setText("Editar Empleado");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        botonBaja.setBackground(new java.awt.Color(225, 225, 225));
        botonBaja.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonBaja.setForeground(new java.awt.Color(219, 126, 138));
        botonBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/volver-Normal.png"))); // NOI18N
        botonBaja.setText("Atrás");
        botonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDni, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextFieldTelefono))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre)))
                    .addComponent(jTextFieldCorreo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, 211, Short.MAX_VALUE)
                        .addGap(18, 318, Short.MAX_VALUE)
                        .addComponent(botonBaja))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNuevo)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonEditar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(botonBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem() instanceof String) {
            jTextFieldDni.setText("");
            jTextFieldNombre.setText("");
            jTextFieldApellidos.setText("");
            jTextFieldTelefono.setText("");
            jTextFieldCorreo.setText("");
        } else {
            System.out.println(jComboBox1.getSelectedItem());
            Empleado emp = (Empleado) jComboBox1.getSelectedItem();
            jTextFieldDni.setText(emp.getDni());
            jTextFieldNombre.setText(emp.getNombre());
            jTextFieldApellidos.setText(emp.getApellidos());
            jTextFieldTelefono.setText(String.valueOf(emp.getTelefono()));
            jTextFieldCorreo.setText(emp.getCorreo());
            try {
                MostrarSQL("Factura",emp.getDni());
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseEntered

    }//GEN-LAST:event_jComboBox1MouseEntered

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        Empleado emp;
        switch (edit_mode){
        
        case 0: //Adición Empleado OFF ----------------------------------------//
        
            edit_mode = 1;
            jTextFieldDni.setText("");
            jTextFieldNombre.setText("");
            jTextFieldApellidos.setText("");
            jTextFieldTelefono.setText("");
            jTextFieldCorreo.setText("");
            jTextFieldDni.setEnabled(true);
            jTextFieldApellidos.setEnabled(true);
            jTextFieldCorreo.setEnabled(true);
            jTextFieldNombre.setEnabled(true);
            jTextFieldTelefono.setEnabled(true);
            jComboBox1.setVisible(false);
            jButtonNuevo.setText("Aplicar");
            jButtonEditar.setText("Cancelar");
            break;
            
        case 1: //Adición Empleado ON -----------------------------------------//
            
            emp = new Empleado(
                jTextFieldNombre.getText(),
                jTextFieldApellidos.getText(),
                jTextFieldCorreo.getText(),
                Integer.parseInt(jTextFieldTelefono.getText()),
                jTextFieldDni.getText()
                );
            
            if (acceso.insertSql(emp)){
                edit_mode = 0;
                new Empleado_MAIN().setVisible(true);
                this.dispose();
            }
            break;
            
        case 2: //Edición Empleado --------------------------------------------//
            String query = "UPDATE Empleado SET nombre='"+
                    jTextFieldNombre.getText()+"',apellidos='"+
                    jTextFieldApellidos.getText()+"',telefono="+
                    jTextFieldTelefono.getText()+",correo='" +
                    jTextFieldCorreo.getText()+"' WHERE dni = '"+
                    jTextFieldDni.getText()+"'";
            if (acceso.updateSql(query)){
                edit_mode = 0;
                new Empleado_MAIN().setVisible(true);
                this.dispose();
            }
            break;
    }


    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
        switch (edit_mode){
            
            case 0: //Adición Empleado OFF ------------------------------------//
                
                if (jComboBox1.getSelectedItem() instanceof String){
                    JOptionPane.showMessageDialog(null,
                        "Tienes que seleccionar un usuario primero!");
                } else {
                    Empleado emp = (Empleado) jComboBox1.getSelectedItem();
                    edit_mode = 2;
                    jComboBox1.setVisible(false);
                    jTextFieldApellidos.setEnabled(true);
                    jTextFieldCorreo.setEnabled(true);
                    jTextFieldNombre.setEnabled(true);
                    jTextFieldTelefono.setEnabled(true);
                    jTextFieldApellidos.setText(emp.getApellidos());
                    jTextFieldCorreo.setText(emp.getCorreo());
                    jTextFieldNombre.setText(emp.getNombre());
                    jTextFieldTelefono.setText(String.valueOf(emp.getTelefono()));
                    jButtonNuevo.setText("Aplicar");
                    jButtonEditar.setText("Cancelar");                    
                }
                break;
                
            case 1: //Adición Empleado ON -------------------------------------//
                
                new Empleado_MAIN().setVisible(true);
                this.dispose();
                edit_mode = 0;
                break;
                
            case 2: //Edición Empleado ----------------------------------------//
                
                new Empleado_MAIN().setVisible(true);
                this.dispose();
                edit_mode = 0;
                break;
                            
        }
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void botonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaActionPerformed
        acceso.cerrar();
        new Menu_GEST().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBajaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String idFact = model.getValueAt(i,0).toString();
        Factura fact = new Factura();
        try {
            fact = (Factura) acceso.listadoID("Factura", idFact);
        } catch (SQLException ex) {
            System.err.println("Error al procesar la Factura.");
        }
        acceso.cerrar();
        new Factura_DETAIL(fact,1).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Empleado_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado_MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBaja;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JComboBox<Object> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldDni3;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
