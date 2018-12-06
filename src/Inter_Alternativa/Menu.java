package Inter_Alternativa;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
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

        botonBusquedas.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonBusquedas.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Clientes.png"))); // NOI18N
        botonBusquedas.setText("Clientes");
        botonBusquedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedasActionPerformed(evt);
            }
        });

        botonTicket.setBackground(new java.awt.Color(225, 225, 225));
        botonTicket.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonTicket.setForeground(new java.awt.Color(219, 126, 138));
        botonTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entradas.png"))); // NOI18N
        botonTicket.setText("Ticket");
        botonTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTicketActionPerformed(evt);
            }
        });

        botonFacturacion.setBackground(new java.awt.Color(225, 225, 225));
        botonFacturacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonFacturacion.setForeground(new java.awt.Color(219, 126, 138));
        botonFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contenido.png"))); // NOI18N
        botonFacturacion.setText("Facturación");
        botonFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacturacionActionPerformed(evt);
            }
        });

        botonBusquedas1.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonBusquedas1.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestion.png"))); // NOI18N
        botonBusquedas1.setText("Gestión");
        botonBusquedas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedas1ActionPerformed(evt);
            }
        });

        botonBusquedas2.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonBusquedas2.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        botonBusquedas2.setText("Salir");
        botonBusquedas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedas2ActionPerformed(evt);
            }
        });

        botonBusquedas3.setBackground(new java.awt.Color(225, 225, 225));
        botonBusquedas3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonBusquedas3.setForeground(new java.awt.Color(219, 126, 138));
        botonBusquedas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salon.png"))); // NOI18N
        botonBusquedas3.setText("Productos");
        botonBusquedas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedas3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botonBusquedas, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBusquedas1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBusquedas2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBusquedas3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBusquedas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBusquedas3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBusquedas1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBusquedas2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFacturacionActionPerformed

    private void botonBusquedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedasActionPerformed
        new Inter_Cliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBusquedasActionPerformed

    private void botonBusquedas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedas1ActionPerformed
        new Inter_Menu_Gestion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBusquedas1ActionPerformed

    private void botonBusquedas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedas2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonBusquedas2ActionPerformed

    private void botonTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTicketActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "¿Quieres usar la interfaz de tickets alternativa?");
        
        switch (input){
            
            case 0:
                new Menu_Ticket().setVisible(true);
                this.dispose();
                break;
            case 1:
                new Inter_Ticket().setVisible(true);
                this.dispose();
                break;
            case 2:
                break;   
        }
        
    }//GEN-LAST:event_botonTicketActionPerformed

    private void botonBusquedas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedas3ActionPerformed
        new Inter_Producto2().setVisible(true);
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
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
