package Inter_Alternativa;

import clases.R;

public class Menu_GEST extends javax.swing.JFrame {
    
    public Menu_GEST() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonBusquedas = new javax.swing.JButton();
        botonBusquedas2 = new javax.swing.JButton();
        botonPermisos = new javax.swing.JButton();
        botonPromociones = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        detalle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 241, 242));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 559));

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)), R.getEmpleadoLogado().getNombreCompleto(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Century Gothic", 0, 18), new java.awt.Color(219, 126, 138))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBusquedas.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonBusquedas.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gestion-Extra.png"))); // NOI18N
        botonBusquedas.setText("Empleados");
        botonBusquedas.setIconTextGap(40);
        botonBusquedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBusquedasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBusquedasMouseExited(evt);
            }
        });
        botonBusquedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedasActionPerformed(evt);
            }
        });
        jPanel1.add(botonBusquedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 70));

        botonBusquedas2.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonBusquedas2.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/volver-Extra.png"))); // NOI18N
        botonBusquedas2.setText("Atrás");
        botonBusquedas2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonBusquedas2.setIconTextGap(90);
        botonBusquedas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBusquedas2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBusquedas2MouseExited(evt);
            }
        });
        botonBusquedas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedas2ActionPerformed(evt);
            }
        });
        jPanel1.add(botonBusquedas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 360, 70));

        botonPermisos.setBackground(new java.awt.Color(225, 225, 225));
        botonPermisos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonPermisos.setForeground(new java.awt.Color(219, 126, 138));
        botonPermisos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/password-Extra.png"))); // NOI18N
        botonPermisos.setText("Permisos");
        botonPermisos.setEnabled(false);
        botonPermisos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPermisosMouseEntered(evt);
            }
        });
        jPanel1.add(botonPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 360, 70));

        botonPromociones.setBackground(new java.awt.Color(225, 225, 225));
        botonPromociones.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonPromociones.setForeground(new java.awt.Color(219, 126, 138));
        botonPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ticket-Extra.png"))); // NOI18N
        botonPromociones.setText("Promociones");
        botonPromociones.setEnabled(false);
        botonPromociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPromocionesMouseEntered(evt);
            }
        });
        jPanel1.add(botonPromociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 360, 75));

        jButton3.setBackground(new java.awt.Color(225, 225, 225));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(219, 126, 138));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/facturacion-Extra.png"))); // NOI18N
        jButton3.setText("Estadísticas");
        jButton3.setEnabled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 275, 360, 75));

        detalle.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        detalle.setForeground(new java.awt.Color(219, 126, 138));
        detalle.setText("Licenciado para: Centro de Peluquería y Estética Nicole");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detalle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detalle))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonBusquedas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedas2ActionPerformed
        new Menu_MAIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBusquedas2ActionPerformed

    private void botonBusquedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedasActionPerformed
        new Empleado_MAIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBusquedasActionPerformed

    private void botonBusquedas2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas2MouseEntered
        detalle.setText("Volver al Menú Principal");
    }//GEN-LAST:event_botonBusquedas2MouseEntered

    private void botonBusquedasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedasMouseEntered
        detalle.setText("Gestiona los empleados");
    }//GEN-LAST:event_botonBusquedasMouseEntered

    private void botonBusquedasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedasMouseExited
        returnDetalle();
    }//GEN-LAST:event_botonBusquedasMouseExited

    private void botonBusquedas2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas2MouseExited
        returnDetalle();
    }//GEN-LAST:event_botonBusquedas2MouseExited

    private void botonPermisosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPermisosMouseEntered
        detalle.setText("Gestiona de permisos de acceso para los empleados");
    }//GEN-LAST:event_botonPermisosMouseEntered

    private void botonPromocionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPromocionesMouseEntered
        detalle.setText("Gestion de promociones");
    }//GEN-LAST:event_botonPromocionesMouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        detalle.setText("Visualización de estadísticas");
    }//GEN-LAST:event_jButton3MouseEntered

    public void returnDetalle(){
        detalle.setText("Licenciado para: Centro de Peluquería y Estética Nicole");
    }
    
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
            java.util.logging.Logger.getLogger(Menu_GEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_GEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_GEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_GEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Menu_GEST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBusquedas;
    private javax.swing.JButton botonBusquedas2;
    private javax.swing.JButton botonPermisos;
    private javax.swing.JButton botonPromociones;
    private javax.swing.JLabel detalle;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
