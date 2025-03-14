/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.model.Arma;
import com.mycompany.model.IObserver;
import com.mycompany.model.Rifle;
import com.mycompany.servicio.ServicioArma;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author Juan David
 */
public class GUICrearRifle extends javax.swing.JFrame implements IObserver{

    ServicioArma servicioArma;

    /**
     * Creates new form GUICrearRifle
     */
    public GUICrearRifle(ServicioArma servicioArma) {
        this.servicioArma = servicioArma;
        initComponents();
        setLocationRelativeTo(this);
        ((JSpinner.DefaultEditor) spDaño.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spMunicion.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spVida.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spCadencia.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spVelocidad.getEditor()).getTextField().setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        lbDaño = new javax.swing.JLabel();
        spDaño = new javax.swing.JSpinner();
        lbMunicion = new javax.swing.JLabel();
        spMunicion = new javax.swing.JSpinner();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lbVida = new javax.swing.JLabel();
        spVida = new javax.swing.JSpinner();
        lbCadencia = new javax.swing.JLabel();
        spCadencia = new javax.swing.JSpinner();
        lbVelocidad = new javax.swing.JLabel();
        spVelocidad = new javax.swing.JSpinner();
        btCrearRifle = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear RiIfle");

        lbDaño.setText("Daño");

        spDaño.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        lbMunicion.setText("Municion");

        spMunicion.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        lbNombre.setText("Nombre");

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        lbVida.setText("Vida");

        spVida.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        lbCadencia.setText("Cadencia de disparo");

        spCadencia.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        lbVelocidad.setText("Velocidad");

        spVelocidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        btCrearRifle.setText("︻┻┳══━一     Crear     ╾━╤デ╦︻");
        btCrearRifle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearRifleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbVelocidad)
                            .addComponent(spVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCrearRifle, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbDaño)
                                .addComponent(spDaño, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbMunicion)
                                .addComponent(spMunicion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbVida)
                                .addComponent(spVida, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCadencia)
                                .addComponent(spCadencia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lbNombre)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbMunicion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spMunicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbDaño)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spDaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbVida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbCadencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spCadencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btCrearRifle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbVelocidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void btCrearRifleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearRifleActionPerformed
        if (tfNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe darle un nombre al arma", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        List<Arma> listaArmas = servicioArma.getArmas();
        String nombre = tfNombre.getText().trim();

        for (Arma a : listaArmas) {
            if (a.getNombre().equals(nombre) && a.getClass().getSimpleName().equals("Rifle")) {
                JOptionPane.showMessageDialog(this, "Ya existe un rifle con este nombre.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        int daño = (int) spDaño.getValue();
        int municion = (int) spMunicion.getValue();
        int vida = (int) spVida.getValue();
        int cadencia = (int) spCadencia.getValue();
        int velocidad = (int) spVelocidad.getValue();

        Arma rifle = new Rifle(daño, municion, nombre, vida, cadencia, velocidad);
        System.out.println(rifle.toString());
        
        servicioArma.añadirArma(rifle);
        
        JOptionPane.showMessageDialog(this, "Exito al crear el rifle", "Exito", JOptionPane.INFORMATION_MESSAGE);
        resetearForm();
    }//GEN-LAST:event_btCrearRifleActionPerformed

    public void resetearForm() {
        tfNombre.setText(null);
        spCadencia.setValue(0);
        spDaño.setValue(0);
        spMunicion.setValue(0);
        spVelocidad.setValue(0);
        spVida.setValue(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCrearRifle;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lbCadencia;
    private javax.swing.JLabel lbDaño;
    private javax.swing.JLabel lbMunicion;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbVelocidad;
    private javax.swing.JLabel lbVida;
    private javax.swing.JSpinner spCadencia;
    private javax.swing.JSpinner spDaño;
    private javax.swing.JSpinner spMunicion;
    private javax.swing.JSpinner spVelocidad;
    private javax.swing.JSpinner spVida;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cambio() {
        
    }
}
