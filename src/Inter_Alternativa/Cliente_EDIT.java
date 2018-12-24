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
import java.sql.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author kaien
 */
public class Cliente_EDIT extends javax.swing.JFrame {

    private String id;
    AccesoSQL acceso;
    Cliente cliente;
    
    /**
     * Creates new form Inter_Cliente_edit
     * @param id
     */
    public Cliente_EDIT(String id) {
        initComponents();
        this.id = id;
        acceso = new AccesoSQL();
        try {
            cliente = (Cliente) acceso.listadoID("Cliente",id);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        jTextField_nombre.setText(cliente.getNombre());
        jTextField_apellidos.setText(cliente.getApellidos());
        jTextField_correo.setText(cliente.getCorreo());
        jTextField_telefono.setText(String.valueOf(cliente.getTelefono()));
        campoObservaciones.setText(cliente.getObservaciones());
        jLabel1.setText("Cliente ID "+id);
        try {
            MostrarSQL("FacturaCliente",cliente.getIdCliente());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        this.campoFecha.setText("Cliente/a desde: " + fechaActual());
    }

    private Cliente_EDIT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void MostrarSQL(String tabla,String filtro) throws SQLException{

        ArrayList<Object> lista = acceso.listado(tabla,filtro);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for(int i = 0; i < lista.size();i++){
            Factura fact = (Factura) lista.get(i);
            row[0] = fact.getIdFactura();
            row[1] = fact.getFecha().toString();
            row[2] = fact.getImporte().toEngineeringString();
            model.addRow(row);
        }
    }
    public String fechaActual(){
        Date date = new Date(cliente.getFechaAlta().getTime());
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy");
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

        jTextField_Busqueda1 = new javax.swing.JTextField();
        jTextField_Busqueda6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        botonAdd1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_apellidos = new javax.swing.JTextField();
        jTextField_correo = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoFecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonTicket = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoObservaciones = new javax.swing.JTextArea();

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

        jTextField_nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField_nombre.setText("Pedro Luis");

        jTextField_apellidos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField_apellidos.setText("Muñoz Gordo");

        jTextField_correo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField_correo.setText("kaienu.jp@gmail.com");

        jTextField_telefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField_telefono.setText("608505377");
        jTextField_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_telefonoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura", "Fecha", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Cliente ID 0000021");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Tiene x facturas asociadas");

        campoFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoFecha.setText("Cliente desde \"Fecha\"");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Última visita: \"Fecha\"");

        botonTicket.setBackground(new java.awt.Color(225, 225, 225));
        botonTicket.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonTicket.setForeground(new java.awt.Color(219, 126, 138));
        botonTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ticket-Big.png"))); // NOI18N
        botonTicket.setText("Ticket");
        botonTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTicketActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(225, 225, 225));
        botonCancelar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(219, 126, 138));
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrar.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Observaciones:");

        campoObservaciones.setColumns(20);
        campoObservaciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoObservaciones.setRows(5);
        jScrollPane2.setViewportView(campoObservaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoFecha)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jTextField_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                .addComponent(jTextField_apellidos)
                                .addComponent(jTextField_nombre)
                                .addComponent(jTextField_telefono)))
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(botonTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoFecha)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jTextField_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_telefonoActionPerformed

    private void jTextField_Busqueda6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Busqueda6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Busqueda6ActionPerformed

    private void botonAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAdd1ActionPerformed

    private void botonTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTicketActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        acceso.cerrar();
        new Cliente_BUSQ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        String query = 
    "UPDATE `Cliente` SET `nombre`='"+jTextField_nombre.getText()+"',`apellidos`='"+jTextField_apellidos.getText()+
        "',`correo`='"+jTextField_correo.getText()+"',`telefono`="+jTextField_telefono.getText()+
        ",`observaciones`='"+campoObservaciones.getText()+"' WHERE `idCliente` = "+this.id;
        acceso.UpdateSql(query);
        
    }//GEN-LAST:event_botonModificarActionPerformed

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
        new Factura_DETAIL(this, true, fact,acceso);
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
            public void run() {
                new Cliente_EDIT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdd1;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonTicket;
    private javax.swing.JLabel campoFecha;
    private javax.swing.JTextArea campoObservaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Busqueda1;
    private javax.swing.JTextField jTextField_Busqueda6;
    private javax.swing.JTextField jTextField_apellidos;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
