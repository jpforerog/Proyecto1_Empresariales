/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.arma.Arma;
import com.mycompany.servicio.ServicioArma;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Juan David
 */
public class GUIEliminarArma extends javax.swing.JFrame {

    private ServicioArma servicioArma;

    public GUIEliminarArma(ServicioArma servicioArma) {
        this.servicioArma = servicioArma;
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConsultar = new javax.swing.JLabel();
        tfConsultar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltArmas = new javax.swing.JList<>();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Arma");

        lblConsultar.setText("Consultar (Ingrese el nombre del arma)");

        ltArmas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ltArmas);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfConsultar)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConsultar)
                            .addComponent(btnBuscar)
                            .addComponent(btnEliminar))
                        .addGap(0, 296, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (tfConsultar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe poner un nombre para buscar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String nombre = tfConsultar.getText().trim();
        
        if (buscarArmas(nombre) == null || buscarArmas(nombre).getSize() == 0) {
            JOptionPane.showMessageDialog(this, "El arma no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        ltArmas.setModel(buscarArmas(nombre));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Arma arma = ltArmas.getSelectedValue();
        if (arma == null) {
            JOptionPane.showMessageDialog(this, "No selecciono ningún arma", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Arma auxArma = arma;
        servicioArma.eliminarArma(arma);
        JOptionPane.showMessageDialog(this, "Se elimino el arma correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
        ltArmas.setModel(buscarArmas(auxArma.getNombre()));

    }//GEN-LAST:event_btnEliminarActionPerformed

    public ListModel<Arma> buscarArmas(String nombre) {
        List<Arma> lista = servicioArma.getArmas();
        DefaultListModel<Arma> modelo = new DefaultListModel<>();
        for (Arma arm : lista) {
            if (arm.getNombre().equals(nombre)) {
                modelo.addElement(arm);
            }
        }
        return modelo;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JList<Arma> ltArmas;
    private javax.swing.JTextField tfConsultar;
    // End of variables declaration//GEN-END:variables
}
