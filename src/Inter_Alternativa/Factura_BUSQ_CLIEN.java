/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inter_Alternativa;

import clases.AccesoSQL;
import clases.Cliente;
import clases.Presentacion;
import clases.R;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Antonio
 */
public class Factura_BUSQ_CLIEN extends javax.swing.JFrame {
    AccesoSQL acceso;
    Cliente cliente;
    private JFrame ventana;
    static String nombre= " ", apellidos = " ";
    /**
     * Creates new form Factura_BUSQ_CLIEN
     */
    public Factura_BUSQ_CLIEN() {
        initComponents();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(0);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(300);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
    try{
            acceso = new AccesoSQL();
            MostrarSQL("Cliente","",false);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error 02");
            System.out.println(e.getMessage());
        }
        
    }
    
    public Factura_BUSQ_CLIEN(JFrame ventana) {
        this();
        this.ventana = ventana;
    }
    
    public void MostrarSQL(String tabla, String filtro, Boolean ID) throws SQLException {
        if (ID==false){ //Si indicamos "false", no buscará por ID,
                        //solo filtro normal de campos.
            ArrayList<Object> lista = acceso.listado(tabla,filtro);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object[] row = new Object[4];
            for(int i = 0; i < lista.size();i++){
                Cliente cli = (Cliente) lista.get(i);
                row[0] = cli.getIdCliente();
                row[1] = cli.getNombre();
                row[2] = cli.getApellidos();
                row[3] = cli.getTelefono();
                model.addRow(row);
            }
        } else {    //Si indicamos "true", buscará por ID (Un solo resultado).
            Cliente cliente = (Cliente) acceso.listadoID("Cliente",filtro);
            //Es necesario hacer el casteo ya que devuelve un Objeto.
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object[] row = new Object[4];
            row[0] = cliente.getIdCliente();
            row[1] = cliente.getNombre();
            row[2] = cliente.getApellidos();
            row[3] = cliente.getTelefono();
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Busqueda = new javax.swing.JTextField();
        botonBusqueda = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));
        jTable1.setFont(R.fuenteRoboto

            (16, R.PLAIN, R.LIGHT)
        );
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nombre", "Apellidos", "Teléfono"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(219, 126, 138));
        jLabel1.setText("Búsqueda");

        jTextField_Busqueda.setFont(R.fuenteRoboto

            (18, R.PLAIN, R.LIGHT)

        );
        jTextField_Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BusquedaActionPerformed(evt);
            }
        });
        jTextField_Busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_BusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_BusquedaKeyReleased(evt);
            }
        });

        botonBusqueda.setBackground(new java.awt.Color(225, 225, 225));
        botonBusqueda.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        botonBusqueda.setForeground(new java.awt.Color(219, 126, 138));
        botonBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscartiny.png"))); // NOI18N
        botonBusqueda.setText("Buscar");
        botonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedaActionPerformed(evt);
            }
        });

        botonLimpiar.setBackground(new java.awt.Color(225, 225, 225));
        botonLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(219, 126, 138));
        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/escoba-de-limpieza-para-suelos.png"))); // NOI18N
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonAtras.setBackground(new java.awt.Color(225, 225, 225));
        botonAtras.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(219, 126, 138));
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/volver-Normal.png"))); // NOI18N
        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTextField_BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BusquedaActionPerformed

    private void jTextField_BusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_BusquedaKeyPressed

    }//GEN-LAST:event_jTextField_BusquedaKeyPressed

    private void jTextField_BusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_BusquedaKeyReleased
        if (evt.VK_ENTER==evt.getKeyCode()) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            try{
                MostrarSQL("Cliente",jTextField_Busqueda.getText(),false);
            }catch (SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Error 03");
            }
        }
    }//GEN-LAST:event_jTextField_BusquedaKeyReleased

    private void botonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedaActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try{
            MostrarSQL("Cliente",jTextField_Busqueda.getText(),false);
        }catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error 03");
        }
    }//GEN-LAST:event_botonBusquedaActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jTextField_Busqueda.setText("");
        try {
            MostrarSQL("Cliente","",false);
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error 04");
        }
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        nombre = model.getValueAt(i, 1).toString();
        apellidos = model.getValueAt(i, 2).toString();
        acceso.cerrar();
        
        this.dispose();
    }//GEN-LAST:event_jTable1MouseReleased

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
            java.util.logging.Logger.getLogger(Factura_BUSQ_CLIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura_BUSQ_CLIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura_BUSQ_CLIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura_BUSQ_CLIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura_BUSQ_CLIEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBusqueda;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Busqueda;
    // End of variables declaration//GEN-END:variables
}
