/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.arma.Arma;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import com.mycompany.servicio.ServicioArma;
import com.mycompany.servicio.ServicioProyectiles;
import java.util.List;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author jupaf
 */
public class GUIElegirArma extends javax.swing.JFrame {

    ServicioArma servicioArma;
    ServicioProyectiles servicioProyectiles;

    /**
     * Creates new form GUIElegirArma
     */
    public GUIElegirArma(ServicioArma servicioArma, ServicioProyectiles servicioProyectiles) {
        this.servicioArma = servicioArma;
        this.servicioProyectiles = servicioProyectiles;
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ltElegirArma = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Arma Jugador 1");

        jButton1.setText("Preparado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ltElegirArma.setModel(modeloLanzadores());
        ltElegirArma.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(ltElegirArma);

        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 211, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(0, 211, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Arma jugador1 = ltElegirArma.getSelectedValue();
        this.dispose();
        GUIElegirArmaJugador2 gui = new GUIElegirArmaJugador2(servicioArma, servicioProyectiles, jugador1);
        gui.setVisible(true);
        setLocationRelativeTo(this);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Arma> ltElegirArma;
    // End of variables declaration//GEN-END:variables

    private ListModel<Arma> modeloLanzadores() {
        DefaultListModel<Arma> modelo = new DefaultListModel<>();

        try {
            List<Arma> armas = servicioArma.getArmas();
            System.out.println("Armas" + armas);

            for (Arma p : armas) {
                modelo.addElement(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No existen proyectiles que mostrar.");
            JOptionPane.showMessageDialog(this, "(No existen proyectiles) Por favor crea al menos un proyectil para continuar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

        return modelo;
    }

}
