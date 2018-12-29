package Inter_Alternativa;

import clases.Presentacion;
import java.awt.Font;
import javax.swing.JOptionPane;

public class Menu_MAIN extends javax.swing.JFrame {
    
    public Menu_MAIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonBusquedas = new javax.swing.JButton();
        botonTicket = new javax.swing.JButton();
        botonFacturacion = new javax.swing.JButton();
        botonBusquedas1 = new javax.swing.JButton();
        botonBusquedas2 = new javax.swing.JButton();
        botonBusquedas3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 241, 242));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBusquedas.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonBusquedas.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/clientes-Extra.png"))); // NOI18N
        botonBusquedas.setText("Clientes");
        botonBusquedas.setIconTextGap(50);
        botonBusquedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedasActionPerformed(evt);
            }
        });
        jPanel1.add(botonBusquedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 360, 70));

        botonTicket.setBackground(new java.awt.Color(225, 225, 225));
        botonTicket.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonTicket.setForeground(new java.awt.Color(219, 126, 138));
        botonTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ticket-Extra.png"))); // NOI18N
        botonTicket.setText("Ticket");
        botonTicket.setIconTextGap(70);
        botonTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTicketActionPerformed(evt);
            }
        });
        jPanel1.add(botonTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 70));

        botonFacturacion.setBackground(new java.awt.Color(225, 225, 225));
        botonFacturacion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonFacturacion.setForeground(new java.awt.Color(219, 126, 138));
        botonFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/facturacion-Extra.png"))); // NOI18N
        botonFacturacion.setText("Facturación");
        botonFacturacion.setIconTextGap(20);
        botonFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacturacionActionPerformed(evt);
            }
        });
        jPanel1.add(botonFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 360, 70));

        botonBusquedas1.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonBusquedas1.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gestion-Extra.png"))); // NOI18N
        botonBusquedas1.setText("Gestión");
        botonBusquedas1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonBusquedas1.setIconTextGap(60);
        botonBusquedas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedas1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonBusquedas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 360, 70));

        botonBusquedas2.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonBusquedas2.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrado.png"))); // NOI18N
        botonBusquedas2.setText("Salir");
        botonBusquedas2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonBusquedas2.setIconTextGap(90);
        botonBusquedas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedas2ActionPerformed(evt);
            }
        });
        jPanel1.add(botonBusquedas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 360, 70));

        botonBusquedas3.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonBusquedas3.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/productos-Extra.png"))); // NOI18N
        botonBusquedas3.setText("Productos");
        botonBusquedas3.setIconTextGap(30);
        botonBusquedas3.setInheritsPopupMenu(true);
        botonBusquedas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedas3ActionPerformed(evt);
            }
        });
        jPanel1.add(botonBusquedas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 360, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturacionActionPerformed
        new Factura_BUSQ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonFacturacionActionPerformed

    private void botonBusquedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedasActionPerformed
        new Cliente_BUSQ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBusquedasActionPerformed

    private void botonBusquedas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedas1ActionPerformed
        new Menu_GEST().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBusquedas1ActionPerformed

    private void botonBusquedas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedas2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonBusquedas2ActionPerformed

    private void botonTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTicketActionPerformed
        /*int input = JOptionPane.showConfirmDialog(null, "¿Quieres usar la interfaz de tickets alternativa?");
        
        switch (input){
            
            case 0:*/
                new Factura_ADD().setVisible(true);
                this.dispose();/*
                break;
            case 1:
                new Inter_Ticket().setVisible(true);
                this.dispose();
                break;
            case 2:
                break;   
        }*/
        
    }//GEN-LAST:event_botonTicketActionPerformed

    private void botonBusquedas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedas3ActionPerformed
        new Producto_BUSQ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBusquedas3ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Menu_MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBusquedas;
    private javax.swing.JButton botonBusquedas1;
    private javax.swing.JButton botonBusquedas2;
    private javax.swing.JButton botonBusquedas3;
    private javax.swing.JButton botonFacturacion;
    private javax.swing.JButton botonTicket;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
