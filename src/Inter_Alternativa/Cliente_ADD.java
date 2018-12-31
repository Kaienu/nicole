package Inter_Alternativa;

import clases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kaien
 */
public class Cliente_ADD extends javax.swing.JFrame {

    AccesoSQL acceso;
    
    public Cliente_ADD() {
        
        initComponents();
        acceso = new AccesoSQL();
    }
    
    /*public void Mostrar_usuarios(String query){
        acceso = new AccesoSQL();
        ArrayList<Cliente> lista = acceso.listado(query);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[5];
        for(int i = 0; i < lista.size();i++){
            row[0] = lista.get(i).getIdCliente();
            row[1] = lista.get(i).getNombre();
            row[2] = lista.get(i).getApellidos();
            row[3] = lista.get(i).getCorreo();
            row[4] = lista.get(i).getTelefono();
            model.addRow(row);
        }
        acceso.cerrar();
    }*/
    
    public void limpiar() {
        jTextField_nombre.setText("");
        jTextField_apellidos.setText("");
        jTextField_correo.setText("");
        jTextArea1.setText("");
        jTextField_telefono.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        botonAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_apellidos = new javax.swing.JTextField();
        jTextField_correo = new javax.swing.JTextField();
        jTextField_telefono = new TextoFormateado();
        botonAdd2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_Display_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)), R.getEmpleadoLogado().getNombreCompleto(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Century Gothic", 0, 18), new java.awt.Color(219, 126, 138))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAdd.setBackground(new java.awt.Color(225, 225, 225));
        botonAdd.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonAdd.setForeground(new java.awt.Color(219, 126, 138));
        botonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/anadir.png"))); // NOI18N
        botonAdd.setText("Añadir");
        botonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddActionPerformed(evt);
            }
        });
        jPanel1.add(botonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 35));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellidos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 35));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Correo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 35));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Teléfono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 35));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Observaciones");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, 35));

        jTextField_nombre.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT));
        jTextField_nombre.setSelectionColor(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 270, 35));

        jTextField_apellidos.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT));
        jTextField_apellidos.setSelectionColor(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 270, 35));

        jTextField_correo.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT));
        jTextField_correo.setSelectionColor(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 270, 35));

        jTextField_telefono.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT));
        jTextField_telefono.setSelectionColor(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 270, 35));

        botonAdd2.setBackground(new java.awt.Color(225, 225, 225));
        botonAdd2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonAdd2.setForeground(new java.awt.Color(219, 126, 138));
        botonAdd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrar.png"))); // NOI18N
        botonAdd2.setText("Cancelar");
        botonAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdd2ActionPerformed(evt);
            }
        });
        jPanel1.add(botonAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 170, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(clases.R.fuenteRoboto

            (16, clases.R.PLAIN, clases.R.LIGHT));
        jTextArea1.setRows(5);
        jTextArea1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextArea1.setSelectionColor(new java.awt.Color(255, 204, 204));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 370, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_Display_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_UserMouseClicked
        
    }//GEN-LAST:event_jTable_Display_UserMouseClicked

    private void botonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddActionPerformed
        try{
            Cliente cliente = new Cliente(jTextField_nombre.getText(),
                jTextField_apellidos.getText(),
                jTextField_correo.getText(),
                Integer.parseInt(jTextField_telefono.getText()),
                jTextArea1.getText());
            acceso.insertSql(cliente);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                    "El campo 'teléfono' no puede estar vacío");
        }
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea introducir otro cliente?","Añadir otro cliente",JOptionPane.OK_OPTION);
        if (opcion == 0) {
           limpiar(); 
        } else {
            acceso.cerrar();
            new Cliente_BUSQ().setVisible(true);
            this.dispose();
        }        
        
        
    }//GEN-LAST:event_botonAddActionPerformed

    private void botonAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdd2ActionPerformed
        acceso.cerrar();
        new Cliente_BUSQ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAdd2ActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_ADD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdd;
    private javax.swing.JButton botonAdd2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Display_User;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_apellidos;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
