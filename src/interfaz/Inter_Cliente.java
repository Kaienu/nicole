/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Antonio
 */
public class Inter_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Inter_Cliente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonBuscarCliene = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        etqBuscarPor = new javax.swing.JLabel();
        comboBoxBusqueda = new javax.swing.JComboBox<>();
        campoCodigo = new javax.swing.JTextField();
        etqCodigo = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqTlf = new javax.swing.JLabel();
        etqCorreo = new javax.swing.JLabel();
        campoApellidos1 = new javax.swing.JTextField();
        campoTlf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));
        jPanel1.setMaximumSize(new java.awt.Dimension(1680, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(219, 126, 138));
        jLabel1.setText("Cliente");

        botonBuscarCliene.setBackground(new java.awt.Color(219, 126, 138));
        botonBuscarCliene.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonBuscarCliene.setForeground(new java.awt.Color(219, 126, 138));
        botonBuscarCliene.setText("Buscar cliente");

        botonAtras.setBackground(new java.awt.Color(219, 126, 138));
        botonAtras.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(219, 126, 138));
        botonAtras.setText("Atrás");
        botonAtras.setPreferredSize(new java.awt.Dimension(70, 50));

        etqBuscarPor.setBackground(new java.awt.Color(219, 126, 138));
        etqBuscarPor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etqBuscarPor.setForeground(new java.awt.Color(219, 126, 138));
        etqBuscarPor.setText("Buscar por:");

        comboBoxBusqueda.setBackground(new java.awt.Color(248, 241, 242));
        comboBoxBusqueda.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboBoxBusqueda.setForeground(new java.awt.Color(219, 126, 138));
        comboBoxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código de cliente", "Nombre", "Apellidos" }));
        comboBoxBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));

        campoCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoCodigo.setForeground(new java.awt.Color(219, 126, 138));
        campoCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));

        etqCodigo.setBackground(new java.awt.Color(219, 126, 138));
        etqCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etqCodigo.setForeground(new java.awt.Color(219, 126, 138));
        etqCodigo.setText("Código:");

        etqNombre.setBackground(new java.awt.Color(219, 126, 138));
        etqNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(219, 126, 138));
        etqNombre.setText("Nombre:");

        campoNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(219, 126, 138));
        campoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));

        etqApellidos.setBackground(new java.awt.Color(219, 126, 138));
        etqApellidos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etqApellidos.setForeground(new java.awt.Color(219, 126, 138));
        etqApellidos.setText("Apellidos:");

        campoApellidos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoApellidos.setForeground(new java.awt.Color(219, 126, 138));
        campoApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));

        etqTlf.setBackground(new java.awt.Color(219, 126, 138));
        etqTlf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etqTlf.setForeground(new java.awt.Color(219, 126, 138));
        etqTlf.setText("Teléfono:");

        etqCorreo.setBackground(new java.awt.Color(219, 126, 138));
        etqCorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etqCorreo.setForeground(new java.awt.Color(219, 126, 138));
        etqCorreo.setText("Correo:");

        campoApellidos1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoApellidos1.setForeground(new java.awt.Color(219, 126, 138));
        campoApellidos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));

        campoTlf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        campoTlf.setForeground(new java.awt.Color(219, 126, 138));
        campoTlf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqBuscarPor)
                                    .addComponent(etqCodigo)
                                    .addComponent(etqNombre)
                                    .addComponent(etqApellidos)
                                    .addComponent(etqTlf)
                                    .addComponent(etqCorreo))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboBoxBusqueda, 0, 275, Short.MAX_VALUE)
                                    .addComponent(campoNombre)
                                    .addComponent(campoApellidos)
                                    .addComponent(campoApellidos1)
                                    .addComponent(campoTlf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(botonBuscarCliene, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(etqBuscarPor)
                    .addComponent(comboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(etqCodigo)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(etqNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(etqApellidos)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(etqTlf)
                    .addComponent(campoTlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(etqCorreo)
                    .addComponent(campoApellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCliene, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Inter_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inter_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inter_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inter_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inter_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBuscarCliene;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoApellidos1;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTlf;
    private javax.swing.JComboBox<String> comboBoxBusqueda;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqBuscarPor;
    private javax.swing.JLabel etqCodigo;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTlf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}