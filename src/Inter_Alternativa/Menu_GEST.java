package Inter_Alternativa;

import clases.R;
import interfaces.Permisos;

public class Menu_GEST extends javax.swing.JFrame implements Permisos{
    
    public Menu_GEST() {
        initComponents();
        comprobacionPermisos();
    }
    
    
    @Override
    public void comprobacionPermisos() {
        switch (R.getEmpleadoLogado().getPermisos()) {
            case 1:
                break;
            case 0:
                botonBusquedas.setEnabled(true);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonBusquedas = new javax.swing.JButton();
        botonBusquedas2 = new javax.swing.JButton();
        botonBusquedas1 = new javax.swing.JButton();
        botonBusquedas3 = new javax.swing.JButton();
        botonBusquedas4 = new javax.swing.JButton();
        botonBusquedas5 = new javax.swing.JButton();
        detalle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 241, 242));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 512));

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)), R.getEmpleadoLogado().getNombreCompleto(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Century Gothic", 0, 18), new java.awt.Color(219, 126, 138))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBusquedas.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonBusquedas.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ajustes-Extra.png"))); // NOI18N
        botonBusquedas.setText("Ajustes");
        botonBusquedas.setEnabled(false);
        botonBusquedas.setIconTextGap(65);
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
        jPanel1.add(botonBusquedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 360, 70));

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

        botonBusquedas1.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonBusquedas1.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gestion-Extra.png"))); // NOI18N
        botonBusquedas1.setText("Empleados");
        botonBusquedas1.setIconTextGap(40);
        botonBusquedas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBusquedas1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBusquedas1MouseExited(evt);
            }
        });
        botonBusquedas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedas1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonBusquedas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 70));

        botonBusquedas3.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonBusquedas3.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/promociones-Extra.png"))); // NOI18N
        botonBusquedas3.setText("Promociones");
        botonBusquedas3.setEnabled(false);
        botonBusquedas3.setIconTextGap(20);
        botonBusquedas3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBusquedas3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBusquedas3MouseExited(evt);
            }
        });
        botonBusquedas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedas3ActionPerformed(evt);
            }
        });
        jPanel1.add(botonBusquedas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 360, 70));

        botonBusquedas4.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonBusquedas4.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/calendario-Extra.png"))); // NOI18N
        botonBusquedas4.setText("Citas");
        botonBusquedas4.setEnabled(false);
        botonBusquedas4.setIconTextGap(90);
        botonBusquedas4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBusquedas4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBusquedas4MouseExited(evt);
            }
        });
        botonBusquedas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedas4ActionPerformed(evt);
            }
        });
        jPanel1.add(botonBusquedas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 360, 70));

        botonBusquedas5.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonBusquedas5.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/graficos-Extra.png"))); // NOI18N
        botonBusquedas5.setText("Gráficos");
        botonBusquedas5.setEnabled(false);
        botonBusquedas5.setIconTextGap(55);
        botonBusquedas5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBusquedas5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBusquedas5MouseExited(evt);
            }
        });
        botonBusquedas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedas5ActionPerformed(evt);
            }
        });
        jPanel1.add(botonBusquedas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 360, 70));

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
        new NewJFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBusquedasActionPerformed

    private void botonBusquedas2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas2MouseEntered
        detalle.setText("Volver al Menú Principal");
    }//GEN-LAST:event_botonBusquedas2MouseEntered

    private void botonBusquedasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedasMouseEntered
        detalle.setText("Selecciona los ajustes de tu aplicación");
    }//GEN-LAST:event_botonBusquedasMouseEntered

    private void botonBusquedasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedasMouseExited
        returnDetalle();
    }//GEN-LAST:event_botonBusquedasMouseExited

    private void botonBusquedas2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas2MouseExited
        returnDetalle();
    }//GEN-LAST:event_botonBusquedas2MouseExited

    private void botonBusquedas1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas1MouseEntered
        detalle.setText("Gestiona los empleados");
    }//GEN-LAST:event_botonBusquedas1MouseEntered

    private void botonBusquedas1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBusquedas1MouseExited

    private void botonBusquedas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedas1ActionPerformed
        new Empleado_MAIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBusquedas1ActionPerformed

    private void botonBusquedas3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas3MouseEntered
        detalle.setText("Introduce nuevas promociones o modifica las actuales");
    }//GEN-LAST:event_botonBusquedas3MouseEntered

    private void botonBusquedas3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas3MouseExited
        returnDetalle();
    }//GEN-LAST:event_botonBusquedas3MouseExited

    private void botonBusquedas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedas3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBusquedas3ActionPerformed

    private void botonBusquedas4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas4MouseEntered
        detalle.setText("Consulta el calendario de citas");
    }//GEN-LAST:event_botonBusquedas4MouseEntered

    private void botonBusquedas4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas4MouseExited
        returnDetalle();
    }//GEN-LAST:event_botonBusquedas4MouseExited

    private void botonBusquedas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedas4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBusquedas4ActionPerformed

    private void botonBusquedas5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas5MouseEntered
        detalle.setText("Genera gráficos y estadísticas de tu negocio");
    }//GEN-LAST:event_botonBusquedas5MouseEntered

    private void botonBusquedas5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBusquedas5MouseExited
        returnDetalle();
    }//GEN-LAST:event_botonBusquedas5MouseExited

    private void botonBusquedas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedas5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBusquedas5ActionPerformed

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
    private javax.swing.JButton botonBusquedas1;
    private javax.swing.JButton botonBusquedas2;
    private javax.swing.JButton botonBusquedas3;
    private javax.swing.JButton botonBusquedas4;
    private javax.swing.JButton botonBusquedas5;
    private javax.swing.JLabel detalle;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
