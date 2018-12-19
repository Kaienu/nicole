/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inter_Alternativa;

import clases.AccesoSQL;
import clases.Factura;
import clases.MainHandler;
import clases.Producto;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kaien
 */
public class Menu_Ticket extends javax.swing.JFrame {
    
    AccesoSQL acceso;
    ArrayList<Object> lista;
    ArrayList<Producto> carrito;
    ArrayList<JButton> botones;
    int x = 10;
    int y = 10;
    int cont = 0;
    Font predet;
    BigDecimal total = new BigDecimal(0);

    /**
     * Creates new form NewJFrame
     */
    public Menu_Ticket() {
        initComponents();
        carrito = new ArrayList<Producto>();
        
        MainHandler controlador = new MainHandler(this);
                
        predet = new Font("Terminal", Font.PLAIN, 10);
        acceso = new AccesoSQL();
        try {
            lista = acceso.listado("Producto", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        int tamanoLista = lista.size();
        
        //jLabel1.setText("Número de items: "+String.valueOf(tamanoLista));
        botones = new ArrayList<JButton>();
        
        for (Object lista1 : lista) {
            JButton boton = new JButton(lista1.toString());
            controlador.setProducto((Producto)lista1);
            boton.addActionListener(controlador);
            boton.setBounds(x, y, 110, 110);
            boton.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
            boton.setForeground(new Color(219, 126, 138));
            boton.setBackground(new Color(255,255,255));

            //boton.setFont(predet);
            botones.add(boton);
            jPanel2.add(boton);
            if (x<370) {
                x += 120;
            } else {
                y += 120;
                x = 10;
            }
        }
        
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
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
    
    /*public void setTabla(Producto prod){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[3];
        row[0] = "1";
        row[1] = prod.getModelo();
        row[2] = prod.getPrecioUnitario().toEngineeringString()+"€";
        model.addRow(row);
        total = total.add(prod.getPrecioUnitario());
        jTextField1.setText(total.toEngineeringString()+"€");
    }*/
    
    public ArrayList getLista(){
        return lista;
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
    
    //FALTA RESTAR EL PRECIO DEL PRODUCTO ELIMINADO AL PRECIO TOTAL
    /*public void borrarProductoSeleccionado(){   
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int fila = jTable1.getSelectedRow();
        
        if(fila >= 0){
            model.removeRow(fila); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Debes de seleccionar previamente el producto que desees eliminar", "¡Atención!", JOptionPane.WARNING_MESSAGE);
        }     
    }*/
    
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
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        botonEliminarProducto = new javax.swing.JButton();
        jButtonFinVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 241, 242));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        jTextField1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0,00€");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButtonAtras.setBackground(new java.awt.Color(225, 225, 225));
        jButtonAtras.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(219, 126, 138));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        botonEliminarProducto.setBackground(new java.awt.Color(225, 225, 225));
        botonEliminarProducto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonEliminarProducto.setForeground(new java.awt.Color(219, 126, 138));
        botonEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escoba-de-limpieza-para-suelos.png"))); // NOI18N
        botonEliminarProducto.setText("Eliminar producto seleccionado");
        botonEliminarProducto.setPreferredSize(new java.awt.Dimension(277, 41));
        botonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProductoActionPerformed(evt);
            }
        });

        jButtonFinVenta.setBackground(new java.awt.Color(225, 225, 225));
        jButtonFinVenta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonFinVenta.setForeground(new java.awt.Color(219, 126, 138));
        jButtonFinVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contenido.png"))); // NOI18N
        jButtonFinVenta.setText("Finalizar Venta");
        jButtonFinVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFinVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFinVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void botonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProductoActionPerformed
        borrarProductoSeleccionado();
    }//GEN-LAST:event_botonEliminarProductoActionPerformed

    private void jButtonFinVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinVentaActionPerformed
        int ticket = JOptionPane.showConfirmDialog(null, "¿Quieres imprimir ticket de venta?");
        
        switch (ticket){
            
            case 0:
                new Inter_Ticket_Generado().setVisible(true);
                break;
            case 1:
                Factura fact = new Factura("00000001","02569854E",total);
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
                this.dispose();
                new Menu_Ticket().setVisible(true);
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
            java.util.logging.Logger.getLogger(Menu_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarProducto;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonFinVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
