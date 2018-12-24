/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inter_Alternativa;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class Login_SPLASH extends javax.swing.JFrame { 
    
    public static String usuario;
        
    public Login_SPLASH() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        logoNicole = new javax.swing.JLabel();
        etqUsuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        etqContrasena = new javax.swing.JLabel();
        etqInicioSesion = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        botonIniciar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 241, 242));
        setUndecorated(true);

        jPanelLogin.setBackground(new java.awt.Color(248, 241, 242));
        jPanelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));
        jPanelLogin.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanelLogin.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanelLogin.setName("Nicole"); // NOI18N
        jPanelLogin.setPreferredSize(new java.awt.Dimension(400, 400));

        logoNicole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.jpg"))); // NOI18N
        logoNicole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));

        etqUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etqUsuario.setForeground(new java.awt.Color(219, 126, 138));
        etqUsuario.setText("Usuario:");

        campoUsuario.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        campoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));

        etqContrasena.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etqContrasena.setForeground(new java.awt.Color(219, 126, 138));
        etqContrasena.setText("Contraseña:");

        etqInicioSesion.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etqInicioSesion.setForeground(new java.awt.Color(219, 126, 138));
        etqInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqInicioSesion.setText("INICIAR SESIÓN");

        botonIniciar.setBackground(new java.awt.Color(243, 206, 211));
        botonIniciar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonIniciar.setForeground(new java.awt.Color(219, 126, 138));
        botonIniciar.setText("Iniciar");
        botonIniciar.setToolTipText("");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(243, 206, 211));
        botonSalir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(219, 126, 138));
        botonSalir.setText("Salir");
        botonSalir.setToolTipText("");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(219, 126, 138));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));

        botonIniciar1.setBackground(new java.awt.Color(243, 206, 211));
        botonIniciar1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonIniciar1.setForeground(new java.awt.Color(219, 126, 138));
        botonIniciar1.setText("Iniciar sin contraseña");
        botonIniciar1.setToolTipText("");
        botonIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(etqInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoNicole, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqContrasena)
                                    .addComponent(etqUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(botonIniciar1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoNicole, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqInicioSesion)
                .addGap(33, 33, 33)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqContrasena, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIniciar)
                    .addComponent(botonSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIniciar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        String usuario = "admin";
        String contraseña = "1234";        
        
        char pass[]=jPasswordField1.getPassword();
        String passUser = new String (pass);        
        
        if(campoUsuario.getText().equals(usuario) && passUser.equals(contraseña)){
            new Inter_Alternativa.Menu_MAIN().setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "El usuario o la contraseña no es correcta", "¡Atención!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciar1ActionPerformed
        new Menu_MAIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonIniciar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login_SPLASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_SPLASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_SPLASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_SPLASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Login_SPLASH().setVisible(true);
            }
        });
    }
    
    public String obtenerUsuarioLogado(){        
        String usuarioCapturado = this.campoUsuario.getText();
        usuarioCapturado = usuario;
        return usuario;
    }   
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonIniciar1;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel etqContrasena;
    private javax.swing.JLabel etqInicioSesion;
    private javax.swing.JLabel etqUsuario;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel logoNicole;
    // End of variables declaration//GEN-END:variables
}
