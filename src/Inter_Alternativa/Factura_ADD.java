package Inter_Alternativa;

import clases.AccesoSQL;
import clases.Cliente;
import clases.Factura;
import clases.Impresion;
import clases.MainHandler;
import clases.Presentacion;
import clases.Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Factura_ADD extends javax.swing.JFrame {
    
    AccesoSQL acceso;
    ArrayList<String> textos;
    ArrayList<Producto> carrito  = new ArrayList<>();
    ArrayList<JButton> botones = new ArrayList<>();
    ArrayList<JButton> pulsadores = new ArrayList<>();
    ArrayList<Object> lista = new ArrayList<>();
    Cliente cliPrincipal;
    String tipoArticulo;
    int x;
    int y;
    int yR = 0;
    int cont = 0;
    BigDecimal total = new BigDecimal(0);
    MainHandler controlador;

    /**
     * Creates new form NewJFrame
     */
    public Factura_ADD() {
        initComponents();
        inicializar();    
    }
    
    public Factura_ADD(Cliente cliente){
        this();
        this.cliPrincipal = cliente;
    }
    
    public void inicializar() {
        panelSwitches1.setBackground(new Color(248,241,242));
        panelSwitches.setBackground(new Color(248,241,242));
        acceso = new AccesoSQL();
        controlador = new MainHandler(this);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(10);
        inicializarMenuLateral();
        
        
    }
    
    public void inicializarMenuLateral() {
        try {
            textos = acceso.selectSQLDistinct("Producto", "tipo");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        for (String t : textos) {
            JButton boton = new JButton(t);
            boton.setBounds(0, yR, 120, 40);
            yR = yR +45;
            boton.addActionListener(controlador);
            boton.setFont(Presentacion.fuentePpal(14, Font.PLAIN, Presentacion.CONDENSED));
            boton.setBackground(new Color(225,225,225));
            boton.setForeground(new Color(219,126,138));
            pulsadores.add(boton);
            panelSwitches1.add(boton);
        }
        tipoArticulo = pulsadores.get(0).getText();
        pulsadores.get(0).setBackground(Color.PINK);
        pulsadores.get(0).setForeground(Color.BLACK);
        panelSwitches1.setPreferredSize(new Dimension(110, (pulsadores.size()*45)));
        
        asignarLista(tipoArticulo);
    }
    
    public void actualizarTabla(){
        total = new BigDecimal(0);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Producto p : carrito) {
            Object[] row = new Object[3];
            row[0] = String.valueOf(p.getCount());
            row[1] = p.getModelo();
            row[2] = p.getPrecioTotalAcumulado().toEngineeringString()+"€";
            model.addRow(row);
            total = total.add(p.getPrecioTotalAcumulado());
        }
        jTextField1.setText(total.toEngineeringString()+"€");
    }
    
    public void addTabla(Producto prod) {
        if (carrito.contains(prod)) {
            int indice = carrito.indexOf(prod);
            Producto p = carrito.get(indice);
            p.increaseCount();
            p.setPrecioTotalAcumulado(p.getPrecioUnitario().add(p.getPrecioUnitario()));
        } else {
            carrito.add(prod);
        }
        actualizarTabla();
    }
    
    public ArrayList getLista(){
        return lista;
    }
    
    public ArrayList<JButton> getTextos(){
        return pulsadores;
    }
    
    public void setTextos(ArrayList<JButton> pulsadores) {
        this.pulsadores = pulsadores;
    }
    
    public void borrarProductoSeleccionado(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int fila = jTable1.getSelectedRow();
        
        if (fila<0) {
            JOptionPane.showMessageDialog(null, "Debes de seleccionar previamente el producto que desees eliminar", "¡Atención!", JOptionPane.WARNING_MESSAGE);
        } else if (carrito.get(fila).getCount()>1) {
            carrito.get(fila).decreaseCount();
        } else if (carrito.get(fila).getCount()==1) {
            carrito.remove(fila);
        }
        actualizarTabla();
    }
    
    public void asignarLista(String tipo) {
        try {
            if (this.lista.isEmpty()) {
                this.lista = acceso.listado("Producto", tipo);
            } else {
                this.lista.clear();
                erase();
                this.lista = acceso.listado("Producto", tipo);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        x = 0;
        y = 0;
        int salto = 1;
        for (Object lista1 : lista) {
            JButton boton = new JButton(lista1.toString());
            controlador.setProducto((Producto)lista1);
            boton.addActionListener(controlador);
            boton.setBounds(x, y, 140, 80);
            //boton.setIcon(new Icon);
            boton.setFont(Presentacion.fuentePpal(12, Font.PLAIN, Presentacion.CONDENSED));
            boton.setForeground(new Color(219, 126, 138));
            boton.setBackground(new Color(255,255,255));
            //boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/volver-Normal.png"))); // NOI18N
            boton.setVerticalTextPosition(SwingConstants.BOTTOM);
            boton.setHorizontalTextPosition(SwingConstants.CENTER);
            botones.add(boton);
            panelSwitches.add(boton);
            
            if (x>250) {
                y = y + 85;
                x = 0;
                salto++;
            } else {
                x = x + 145;
            }
        }
        panelSwitches.setPreferredSize(new Dimension(450, (salto*90)));
    }
    
    public void erase(){
        panelSwitches.removeAll();
        panelSwitches.revalidate();
        panelSwitches.repaint();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        botonEliminarProducto = new javax.swing.JButton();
        jButtonFinVenta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelSwitches = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelSwitches1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 126, 138)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Artículo", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(50);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 360, 440));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0,00€");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 40));

        jButtonAtras.setBackground(new java.awt.Color(225, 225, 225));
        jButtonAtras.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(219, 126, 138));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/volver-Normal.png"))); // NOI18N
        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 100, 40));

        botonEliminarProducto.setBackground(new java.awt.Color(225, 225, 225));
        botonEliminarProducto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonEliminarProducto.setForeground(new java.awt.Color(219, 126, 138));
        botonEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/escoba-de-limpieza-para-suelos.png"))); // NOI18N
        botonEliminarProducto.setText("Eliminar");
        botonEliminarProducto.setPreferredSize(new java.awt.Dimension(277, 41));
        botonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 120, 40));

        jButtonFinVenta.setBackground(new java.awt.Color(225, 225, 225));
        jButtonFinVenta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonFinVenta.setForeground(new java.awt.Color(219, 126, 138));
        jButtonFinVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ticket-Normal.png"))); // NOI18N
        jButtonFinVenta.setText("Finalizar");
        jButtonFinVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinVentaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFinVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 120, 40));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout panelSwitchesLayout = new javax.swing.GroupLayout(panelSwitches);
        panelSwitches.setLayout(panelSwitchesLayout);
        panelSwitchesLayout.setHorizontalGroup(
            panelSwitchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );
        panelSwitchesLayout.setVerticalGroup(
            panelSwitchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(panelSwitches);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 450, 430));

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout panelSwitches1Layout = new javax.swing.GroupLayout(panelSwitches1);
        panelSwitches1.setLayout(panelSwitches1Layout);
        panelSwitches1Layout.setHorizontalGroup(
            panelSwitches1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        panelSwitches1Layout.setVerticalGroup(
            panelSwitches1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(panelSwitches1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        acceso.cerrar();
        this.dispose();
        new Menu_MAIN().setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void botonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProductoActionPerformed
        borrarProductoSeleccionado();
    }//GEN-LAST:event_botonEliminarProductoActionPerformed

    private void jButtonFinVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinVentaActionPerformed
        Factura fact = new Factura("00000001","02569854E",total);
        
        if (carrito.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún artículo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int ticket = JOptionPane.showConfirmDialog(null, "¿Quieres imprimir ticket de venta?");
        
        switch (ticket){            
            case 0:                               
                System.out.println(fact);
                if (acceso.insertSql(fact)) {
                    if (acceso.insertLista(carrito, acceso.getAutonum())){
                        JOptionPane.showMessageDialog(null, "Factura Creada","Se ha generado la factura nº "+acceso.getAutonum(),JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        System.err.println("Linea-01");
                        break;
                    }
                } else {
                    System.err.println("Linea-02");
                    break;
                }
                Impresion.main(carrito,fact);
                acceso.cerrar();
                new Factura_ADD().setVisible(true);
                this.dispose();
                break;
            case 1:
                System.out.println(fact);
                if (acceso.insertSql(fact)) {
                    if (acceso.insertLista(carrito, acceso.getAutonum())){
                        JOptionPane.showMessageDialog(null, "Factura Creada","Se ha generado la factura nº "+acceso.getAutonum(),JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        System.err.println("Linea-01");
                        break;
                    }
                } else {
                    System.err.println("Linea-02");
                    break;
                }
                acceso.cerrar();
                new Factura_ADD().setVisible(true);
                this.dispose();
                break;
            case 2:
                break;   
        }
    }//GEN-LAST:event_jButtonFinVentaActionPerformed

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
            java.util.logging.Logger.getLogger(Factura_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura_ADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura_ADD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarProducto;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonFinVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelSwitches;
    private javax.swing.JPanel panelSwitches1;
    // End of variables declaration//GEN-END:variables
}
