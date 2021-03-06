package Inter_Alternativa;

import clases.*;
import interfaces.Permisos;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Cliente_EDIT extends JFrame implements Permisos{

    private String id;
    AccesoSQL acceso;
    Cliente cliente;
    
    public Cliente_EDIT(String id) {
        initComponents();
        comprobacionPermisos();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(0);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(230);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        
        this.id = id;
        //disableText();
        acceso = new AccesoSQL();
        try {
            cliente = (Cliente) acceso.listadoID("Cliente",id);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        textNombre.setText(cliente.getNombre());
        textApellidos.setText(cliente.getApellidos());
        textCorreo.setText(cliente.getCorreo());
        textTelf.setText(String.valueOf(cliente.getTelefono()));
        campoObservaciones.setText(cliente.getObservaciones());
        textIdCliente.setText(id);
        textFecha.setText(cliente.fechaAlta());
        try {
            MostrarSQL("FacturaCliente",cliente.getIdCliente());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private Cliente_EDIT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    @Override
    public void comprobacionPermisos() {
        if (R.getEmpleadoLogado().getPermisos()==0){
            botonModificar.setEnabled(false);
        }
    }
    
    public void MostrarSQL(String tabla,String filtro) throws SQLException{

        //NºFacturas
        int facturas = acceso.returnInt(
            "select count(*) from Factura where idCliente = '"+cliente.getIdCliente()+"'");
        jTextField3.setText(String.valueOf(facturas));
        //SumaImportes
        double suma = acceso.returnDouble(
            "select sum(importe) from Factura where idCliente = '"+cliente.getIdCliente()+"'");
        BigDecimal n = new BigDecimal(suma).setScale(2, RoundingMode.HALF_UP);
        jTextField1.setText(n.toEngineeringString()+"€");
        //ÚltimaVisita
        Timestamp ultimaVisita = acceso.returnTimestamp(
            "select max(fecha) from Factura where idCliente = '"+cliente.getIdCliente()+"'");
        jTextField4.setText(R.fechaFormateada(ultimaVisita));
        //FormateoTabla
        ArrayList<Object> lista = acceso.listado(tabla,filtro);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for(int i = 0; i < lista.size();i++){
            Factura fact = (Factura) lista.get(i);
            row[0] = fact.getIdFactura();
            row[1] = fact.fechaActual();
            row[2] = fact.getImporte().toEngineeringString()+"€";
            model.addRow(row);
        }
    }
    
    public void disableText(boolean condicion) {
        textNombre.setEditable(condicion);
        textApellidos.setEditable(condicion);
        textCorreo.setEditable(condicion);
        textTelf.setEditable(condicion);
        campoObservaciones.setEditable(condicion);
        if (condicion) campoObservaciones.setBackground(Color.white);
        else campoObservaciones.setBackground(new Color(240,240,240));
    }
    
    public void cancelarMod() {
        disableText(false);
        botonModificar2.setEnabled(true);
        botonModificar1.setText("Modificar");
        botonModificar.setText("Ticket");
        botonModificar.setEnabled(false);
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ticket-Normal.png")));
    }
    
    public void modCliente() {
        this.cliente.setApellidos(textApellidos.getText());
        this.cliente.setNombre(textNombre.getText());
        this.cliente.setCorreo(textCorreo.getText());
        this.cliente.setObservaciones(campoObservaciones.getText());
        this.cliente.setTelefono(Integer.valueOf(textTelf.getText()));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_Busqueda1 = new javax.swing.JTextField();
        jTextField_Busqueda6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        botonAdd1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoObservaciones = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textIdCliente = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textApellidos = new javax.swing.JTextField();
        textTelf = new javax.swing.JTextField();
        textCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        botonModificar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        textFecha = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        botonModificar2 = new javax.swing.JButton();

        jTextField_Busqueda1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jTextField_Busqueda6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField_Busqueda6.setText("608505377");
        jTextField_Busqueda6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Busqueda6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Cliente desde \"Fecha\"");

        botonAdd1.setBackground(new java.awt.Color(225, 225, 225));
        botonAdd1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonAdd1.setForeground(new java.awt.Color(219, 126, 138));
        botonAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdd1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)), R.getEmpleadoLogado().getNombreCompleto(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Century Gothic", 0, 18), new java.awt.Color(219, 126, 138))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(clases.R.fuenteRoboto

            (16, clases.R.PLAIN, clases.R.LIGHT)

        );
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura", "Fecha", "Importe"
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 480, 160));

        botonModificar.setBackground(new java.awt.Color(225, 225, 225));
        botonModificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(219, 126, 138));
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ticket-Normal.png"))); // NOI18N
        botonModificar.setText("Ticket");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 160, 40));

        campoObservaciones.setEditable(false);
        campoObservaciones.setBackground(new java.awt.Color(240, 240, 240));
        campoObservaciones.setColumns(20);
        campoObservaciones.setFont(clases.R.fuenteRoboto

            (16, clases.R.PLAIN, clases.R.LIGHT)

        );
        campoObservaciones.setRows(5);
        campoObservaciones.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoObservaciones.setSelectionColor(new java.awt.Color(255, 204, 204));
        jScrollPane2.setViewportView(campoObservaciones);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 480, 120));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Observaciones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, 35));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 35));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 35));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Apellidos:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 90, 35));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Teléfono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 90, 35));

        textIdCliente.setEditable(false);
        textIdCliente.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT)
        );
        textIdCliente.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textIdCliente.setSelectionColor(new java.awt.Color(255, 204, 204));
        jPanel1.add(textIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 100, 35));

        textNombre.setEditable(false);
        textNombre.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT)
        );
        textNombre.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textNombre.setSelectionColor(new java.awt.Color(255, 204, 204));
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, 35));

        textApellidos.setEditable(false);
        textApellidos.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT)
        );
        textApellidos.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textApellidos.setSelectionColor(new java.awt.Color(255, 204, 204));
        jPanel1.add(textApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 180, 35));

        textTelf.setEditable(false);
        textTelf.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT)

        );
        textTelf.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textTelf.setSelectionColor(new java.awt.Color(255, 204, 204));
        jPanel1.add(textTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 180, 35));

        textCorreo.setEditable(false);
        textCorreo.setFont(clases.R.fuenteRoboto

            (18, clases.R.PLAIN, clases.R.LIGHT)

        );
        textCorreo.setSelectionColor(new java.awt.Color(255, 204, 204));
        jPanel1.add(textCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 390, 35));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Correo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 35));

        botonModificar1.setBackground(new java.awt.Color(225, 225, 225));
        botonModificar1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonModificar1.setForeground(new java.awt.Color(219, 126, 138));
        botonModificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lapiz.png"))); // NOI18N
        botonModificar1.setText("Modificar");
        botonModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFont(clases.R.fuenteRoboto

            (16, clases.R.PLAIN, clases.R.LIGHT)

        );
        jTextField1.setText("jTextField1");
        jTextField1.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setEnabled(false);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 150, 35));

        textFecha.setEditable(false);
        textFecha.setFont(clases.R.fuenteRoboto

            (16, clases.R.PLAIN, clases.R.LIGHT)

        );
        textFecha.setText("jTextField1");
        textFecha.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textFecha.setEnabled(false);
        jPanel2.add(textFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, 35));

        jTextField3.setEditable(false);
        jTextField3.setFont(clases.R.fuenteRoboto

            (16, clases.R.PLAIN, clases.R.LIGHT)

        );
        jTextField3.setText("jTextField1");
        jTextField3.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextField3.setEnabled(false);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, 35));

        jTextField4.setEditable(false);
        jTextField4.setFont(clases.R.fuenteRoboto

            (16, clases.R.PLAIN, clases.R.LIGHT)

        );
        jTextField4.setText("jTextField1");
        jTextField4.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextField4.setEnabled(false);
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 150, 35));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Alta cliente:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 35));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Nº Facturas:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 35));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Última visita:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 35));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Total:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 80, 35));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 480, 110));

        botonModificar2.setBackground(new java.awt.Color(225, 225, 225));
        botonModificar2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonModificar2.setForeground(new java.awt.Color(219, 126, 138));
        botonModificar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/volver-Normal.png"))); // NOI18N
        botonModificar2.setText("Atrás");
        botonModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificar2ActionPerformed(evt);
            }
        });
        jPanel1.add(botonModificar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Busqueda6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Busqueda6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Busqueda6ActionPerformed

    private void botonAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAdd1ActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        JButton boton = (JButton)evt.getSource();
        if (boton.getText().equalsIgnoreCase("Ticket")) {
            acceso.cerrar();
            new Factura_ADD(cliente).setVisible(true);
            this.dispose();
        } else if (boton.getText().equalsIgnoreCase("Cancelar")) {
            cancelarMod();
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void botonModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificar1ActionPerformed
        JButton boton = (JButton)evt.getSource();
        if (boton.getText().equalsIgnoreCase("Modificar")) {
            disableText(true);
            botonModificar2.setEnabled(false);
            botonModificar1.setText("Guardar");
            botonModificar.setText("Cancelar");
            botonModificar.setEnabled(true);
            botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrar.png")));
        } else if (boton.getText().equalsIgnoreCase("Guardar")) {
            int eleccion = JOptionPane.showConfirmDialog(null, "¿Desea aplicar los cambios?", "Confirmación de cambios", JOptionPane.OK_CANCEL_OPTION);
            if (eleccion == 0) {
                modCliente();
                if (acceso.updateCliente(cliente)) {
                    cancelarMod();
                }
            }
        }     
    }//GEN-LAST:event_botonModificar1ActionPerformed

    private void botonModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificar2ActionPerformed
        acceso.cerrar();
        new Cliente_BUSQ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonModificar2ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String idFact = model.getValueAt(i,0).toString();
        Factura fact = new Factura();
        try {
            fact = (Factura) acceso.listadoID("Factura", idFact);
        } catch (SQLException ex) {
            System.err.println("Error al procesar la Factura.");
        }
        acceso.cerrar();
        new Factura_DETAIL(fact,2,this.id).setVisible(true);
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
            java.util.logging.Logger.getLogger(Cliente_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_EDIT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdd1;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonModificar1;
    private javax.swing.JButton botonModificar2;
    private javax.swing.JTextArea campoObservaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField_Busqueda1;
    private javax.swing.JTextField jTextField_Busqueda6;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JTextField textFecha;
    private javax.swing.JTextField textIdCliente;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelf;
    // End of variables declaration//GEN-END:variables
}
