/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAutenticacion;
import javax.swing.JOptionPane;

/**
 *
 * @author nicoo
 */
public class VistaAutenticacion  extends javax.swing.JFrame {
    private ControladorAutenticacion cAuten;
    /**
     * Creates new form ViewAutenticacion
     */
    public VistaAutenticacion() {
        initComponents();
    }

    public VistaAutenticacion(ControladorAutenticacion aThis) {
        initComponents();
        cAuten = aThis;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CuadroTextoNombreUsuario = new javax.swing.JTextField();
        LabelNombreUsuario = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        BotonIngresar = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        labelCorreoUsach = new javax.swing.JLabel();
        CuadroPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticación");
        setMaximumSize(new java.awt.Dimension(220, 137));
        setMinimumSize(new java.awt.Dimension(220, 137));
        setResizable(false);
        setSize(new java.awt.Dimension(220, 137));

        LabelNombreUsuario.setText("Nombre de usuario");

        LabelPassword.setText("Password");

        BotonIngresar.setText("Ingresar");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarPressedMM(evt);
            }
        });

        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverPressedMM(evt);
            }
        });

        labelCorreoUsach.setText("@usach.cl");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonVolver))
                    .addComponent(LabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPassword)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CuadroPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CuadroTextoNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCorreoUsach)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuadroTextoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCorreoUsach))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CuadroPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonIngresar)
                    .addComponent(BotonVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIngresarPressedMM(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarPressedMM
        // TODO add your handling code here:
        if(CuadroTextoNombreUsuario.getText().equals("")||
            CuadroPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe llenar todos los campos");
        }
        else{
            cAuten.autenticar();
        }
    }//GEN-LAST:event_BotonIngresarPressedMM

    private void BotonVolverPressedMM(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverPressedMM
        // TODO add your handling code here:
        cAuten.volver();
    }//GEN-LAST:event_BotonVolverPressedMM

    public String demeNombreUsuarioQM(){
        return CuadroTextoNombreUsuario.getText();
    }
    
    public char[] demePasswordQM(){
        return CuadroPassword.getPassword();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPasswordField CuadroPassword;
    private javax.swing.JTextField CuadroTextoNombreUsuario;
    private javax.swing.JLabel LabelNombreUsuario;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel labelCorreoUsach;
    // End of variables declaration//GEN-END:variables
}
