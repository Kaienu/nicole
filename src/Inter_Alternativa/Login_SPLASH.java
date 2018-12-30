package Inter_Alternativa;

import clases.AccesoSQL;
import clases.Empleado;
import clases.R;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login_SPLASH extends javax.swing.JFrame { 
    
    AccesoSQL acceso;
    ArrayList<Object> lista;
    
    public Login_SPLASH() {
        acceso = new AccesoSQL();
        initComponents();
        initCombo();        
    }
    
    public void initCombo() {
        try {
            lista = acceso.listado("Empleado", "");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        jComboBox1.addItem("Selecciona Usuario");
        jComboBox1.addItem("Supervisor");
        jComboBox1.setSelectedIndex(0);
        for (Object o : lista) {
            Empleado emp = (Empleado) o;
            jComboBox1.addItem(emp.getNombreCompleto());
        }
    }
    
    public void login() {
        Empleado empLog = null;
        if (jComboBox1.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "Selecciona un usuario", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (jComboBox1.getSelectedItem().equals("Supervisor")) {
            empLog = R.SUPERVISOR;
        } else {
            for (Object e : lista) {
                Empleado emp = (Empleado) e;
                if (jComboBox1.getSelectedItem().equals(emp.getNombreCompleto())){
                    empLog = emp;
                    break;
                }
            }
            if (!comprobacionEmpleado(empLog)) {
                return;
            }
        }
        
        char pass[]=jPasswordField1.getPassword();
        String passUser = new String (pass);
        if (acceso.login(empLog, passUser)) {
            System.out.println("Logueado Correctamente");
            acceso.cerrar();
            R.setEmpleadoLogado(empLog);
            new Menu_MAIN().setVisible(true);
            this.dispose();
        } else {
            System.out.println("Contraseña Incorrecta");
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            jPasswordField1.setText("");
        }
    }
    
    public boolean comprobacionEmpleado(Empleado emp) {
        String query = "select count(*) from passwd where dniEmpleado like '"+emp.getDni()+"'";
        if (acceso.returnInt(query)==0) {
            JOptionPane.showMessageDialog(null, "El empleado está desactivado!", "Error 301", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        logoNicole = new javax.swing.JLabel();
        etqUsuario = new javax.swing.JLabel();
        etqContrasena = new javax.swing.JLabel();
        etqInicioSesion = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        botonIniciar1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 241, 242));
        setUndecorated(true);

        jPanelLogin.setBackground(new java.awt.Color(248, 241, 242));
        jPanelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelLogin.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanelLogin.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanelLogin.setName("Nicole"); // NOI18N
        jPanelLogin.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoNicole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.jpg"))); // NOI18N
        logoNicole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelLogin.add(logoNicole, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 23, 350, 200));

        etqUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etqUsuario.setText("Usuario:");
        jPanelLogin.add(etqUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 35));

        etqContrasena.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etqContrasena.setText("Contraseña:");
        jPanelLogin.add(etqContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 35));

        etqInicioSesion.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etqInicioSesion.setForeground(new java.awt.Color(219, 126, 138));
        etqInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqInicioSesion.setText("INICIAR SESIÓN");
        jPanelLogin.add(etqInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 241, 378, -1));

        botonIniciar.setBackground(new java.awt.Color(243, 206, 211));
        botonIniciar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonIniciar.setForeground(new java.awt.Color(219, 126, 138));
        botonIniciar.setText("Iniciar");
        botonIniciar.setToolTipText("");
        botonIniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        jPanelLogin.add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, 35));

        botonSalir.setBackground(new java.awt.Color(243, 206, 211));
        botonSalir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(219, 126, 138));
        botonSalir.setText("Salir");
        botonSalir.setToolTipText("");
        botonSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanelLogin.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 150, 35));

        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(219, 126, 138));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanelLogin.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 250, 35));

        botonIniciar1.setBackground(new java.awt.Color(243, 206, 211));
        botonIniciar1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonIniciar1.setForeground(new java.awt.Color(219, 126, 138));
        botonIniciar1.setText("Iniciar sin contraseña");
        botonIniciar1.setToolTipText("");
        botonIniciar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciar1ActionPerformed(evt);
            }
        });
        jPanelLogin.add(botonIniciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 340, 35));

        jComboBox1.setForeground(new java.awt.Color(219, 126, 138));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelLogin.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 250, 35));

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
        login();
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        acceso.cerrar();
        System.exit(0);        
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciar1ActionPerformed
        acceso.cerrar();
        R.setEmpleadoLogado(R.SUPERVISOR);
        new Menu_MAIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonIniciar1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if (evt.VK_ENTER==evt.getKeyCode()) {
           login();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

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
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonIniciar1;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel etqContrasena;
    private javax.swing.JLabel etqInicioSesion;
    private javax.swing.JLabel etqUsuario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel logoNicole;
    // End of variables declaration//GEN-END:variables
}
