package Inter_Alternativa;

import clases.AccesoSQL;
import clases.Factura;
import clases.Linea;
import clases.R;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Factura_DETAIL extends javax.swing.JFrame {

    AccesoSQL acceso;
    Factura factu;
    ArrayList<Linea> lineas;
    private int opc;
    private String id;
    
    public Factura_DETAIL() {
        initComponents();
        
    }

    public Factura_DETAIL(Factura factu,int opc,String id) {
        this(factu,opc);
        this.id = id;
    }
    
    public Factura_DETAIL(Factura factu,int opc) {
        acceso = new AccesoSQL();
        this.opc = opc;
        initComponents();
        ArrayList<Factura> facturas = acceso.vistaFactura(factu.getIdFactura());
        this.factu = facturas.get(0);        
        initPers();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(0);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(350);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        try {
            MostrarSQL();
        } catch (SQLException ex) {
            System.err.println("Error al procesar las lineas de Factura.");
            System.err.println(ex.getMessage());
        }
    }
    
    public void initPers(){
        //jLabel1.setText("Factura nº "+factu.getIdFactura());
        textIdFactura.setText(factu.getIdFactura());
        textIdCliente.setText(factu.getIdCliente());
        textIdEmpleado.setText(factu.getDniEmpleado());
        textFecha.setText(factu.fechaActual());
        textImporte.setText(factu.getImporte().toEngineeringString()+"€");
    }
    
    public void MostrarSQL() throws SQLException{
        lineas = acceso.facturaFormateada(factu.getIdFactura());
        System.out.println(lineas);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        for(int i = 0; i < lineas.size();i++){
            Linea linea = (Linea) lineas.get(i);
            row[0] = linea.getCantidad();
            row[1] = linea.getModelo();
            row[2] = linea.getImporteLinea().toEngineeringString()+"€";
            row[3] = linea.getImporteLinea().multiply(new BigDecimal(linea.getCantidad()))+"€";
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        textFecha = new javax.swing.JTextField();
        textIdFactura = new javax.swing.JTextField();
        textIdCliente = new javax.swing.JTextField();
        textIdEmpleado = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();
        botonAtras2 = new javax.swing.JButton();
        textImporte = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(566, 475));

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)), R.getEmpleadoLogado().getNombreCompleto(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Century Gothic", 0, 18), new java.awt.Color(219, 126, 138))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Factura nº:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 35));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Cliente: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 35));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Empleado:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 35));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Fecha: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 35));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Importe: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, 35));

        jTable1.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cant.", "Artículo", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 520, 230));

        textFecha.setEditable(false);
        textFecha.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT));
        textFecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textFecha.setEnabled(false);
        jPanel1.add(textFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 190, 35));

        textIdFactura.setEditable(false);
        textIdFactura.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT)
        );
        textIdFactura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textIdFactura.setEnabled(false);
        jPanel1.add(textIdFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 130, 35));

        textIdCliente.setEditable(false);
        textIdCliente.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT)
        );
        textIdCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textIdCliente.setEnabled(false);
        jPanel1.add(textIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 410, 35));

        textIdEmpleado.setEditable(false);
        textIdEmpleado.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT));
        textIdEmpleado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textIdEmpleado.setEnabled(false);
        jPanel1.add(textIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 410, 35));

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
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 120, 35));

        botonAtras2.setBackground(new java.awt.Color(225, 225, 225));
        botonAtras2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        botonAtras2.setForeground(new java.awt.Color(219, 126, 138));
        botonAtras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/impresora.png"))); // NOI18N
        botonAtras2.setText("Imprimir");
        botonAtras2.setEnabled(false);
        botonAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtras2ActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 35));

        textImporte.setEditable(false);
        textImporte.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT));
        textImporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textImporte.setEnabled(false);
        jPanel1.add(textImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 130, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtras2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAtras2ActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        switch (opc) {
            case 0:
                new Factura_BUSQ().setVisible(true);
                this.dispose();
                break;
            case 1:
                new Empleado_MAIN().setVisible(true);
                this.dispose();
                break;
            case 2:
                new Cliente_EDIT(id).setVisible(true);
                this.dispose();
                break;
        }
    }//GEN-LAST:event_botonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Factura_DETAIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura_DETAIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura_DETAIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura_DETAIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura_DETAIL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonAtras2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textFecha;
    private javax.swing.JTextField textIdCliente;
    private javax.swing.JTextField textIdEmpleado;
    private javax.swing.JTextField textIdFactura;
    private javax.swing.JTextField textImporte;
    // End of variables declaration//GEN-END:variables
}
