package clases;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class PopupPassword extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private Empleado emp;
    private AccesoSQL acceso;
    private JPasswordField passwdField;
    private JButton btnCancelar, btnContinuar;

    public PopupPassword(JFrame ventana, Empleado emp, AccesoSQL acceso) {
        this.emp = emp;
        this.acceso = acceso;
        if (!comprobacionEmpleado(emp)) {
            dispose();
        }
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        setSize(400, 200);
        setLocationRelativeTo(ventana);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new LineBorder(new Color(219,126,138), 2, true));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        inicializar();
    }
    
    public void inicializar() {
        JLabel labelContraseña = new JLabel("Introduzca nueva contraseña");
        labelContraseña.setHorizontalAlignment(SwingConstants.CENTER);
        //lblEnConstruccin.setIcon(new ImageIcon(PopupPassword.class.getResource("/recursos/grua.png")));
        labelContraseña.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        labelContraseña.setBounds(20, 20, 360, 40);
        contentPanel.add(labelContraseña);

        btnContinuar = new JButton("Continuar");
        btnContinuar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (passwdField.getPassword().length == 0){
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacío", "Campo vacío", JOptionPane.ERROR_MESSAGE);
            } else {
                char pass[] = passwdField.getPassword();
                String passUser = new String (pass);
                if (acceso.updatePassword(emp, passUser)) {
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Se ha producido un error al asignar la contraseña", "Error 061", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        });
        btnContinuar.setBounds(20, 140, 170, 40);
        btnContinuar.setBackground(new Color(240,240,240));
        contentPanel.add(btnContinuar);
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
        });
        btnCancelar.setBounds(210, 140, 170, 40);
        btnCancelar.setBackground(new Color(240,240,240));
        contentPanel.add(btnCancelar);
        
        passwdField = new JPasswordField();
        passwdField.setBounds(30, 80, 340, 40);
        contentPanel.add(passwdField);
    }
    
    public boolean comprobacionEmpleado(Empleado emp) {
        String query = "select count(*) from passwd where dniEmpleado like '"+emp.getDni()+"'";
        if (acceso.returnInt(query)==0) {
            System.out.println("El empleado no tiene contraseña!");
            if (acceso.insertDniPassword(emp)==1) {
                System.out.println("El empleado ha sido añadido a la tabla de contraseñas!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido inicializar el empleado!", "Error 059", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            return true;
        }
    }
    
}
