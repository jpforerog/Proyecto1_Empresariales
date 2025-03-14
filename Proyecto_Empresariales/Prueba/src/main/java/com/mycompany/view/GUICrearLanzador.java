/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.model.Arma;
import com.mycompany.model.IObserver;
import com.mycompany.model.Lanzador;
import com.mycompany.model.Proyectil;
import com.mycompany.servicio.ServicioArma;
import com.mycompany.servicio.ServicioProyectiles;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.ListModel;

/**
 *
 * @author Juan David
 */
public class GUICrearLanzador extends javax.swing.JFrame implements IObserver{

    ServicioArma servicioArma;
    ServicioProyectiles servicioProyectiles;

    /**
     * Creates new form GUICrearLanzador
     */
    public GUICrearLanzador(ServicioArma servicioArma, ServicioProyectiles servicioProyectiles) {
        this.servicioArma = servicioArma;
        this.servicioProyectiles = servicioProyectiles;
        initComponents();
        setLocationRelativeTo(this);
        ((JSpinner.DefaultEditor) spDaño.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spMunicion.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spVida.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spTiempo.getEditor()).getTextField().setEditable(false);
    }

    public ListModel<Proyectil> modeloProyectiles() {
        DefaultListModel<Proyectil> modelo = new DefaultListModel<>();

        try {
            List<Proyectil> proyectiles = servicioProyectiles.getProyectiles();
            System.out.println("Proyectiles" + proyectiles);

            for (Proyectil p : proyectiles) {
                modelo.addElement(p);
            }
            if (proyectiles.isEmpty()) {
                JOptionPane.showMessageDialog(this, "(No existen proyectiles) Por favor crea al menos un proyectil para continuar",
                         "Error", JOptionPane.INFORMATION_MESSAGE);
                GUICrearProyectil gui = new GUICrearProyectil(servicioProyectiles);
                gui.setVisible(true);
                gui.setAlwaysOnTop(true); // Asegura que la ventana se muestre en primer plano
                gui.toFront(); // Lleva la ventana al frente
                gui.requestFocus(); // Asegura que la ventana reciba el foco

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No existen proyectiles que mostrar.");
        }

        return modelo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTiempo = new javax.swing.JSpinner();
        lbProyectil = new javax.swing.JLabel();
        btCrearLanzador = new javax.swing.JButton();
        lbDaño = new javax.swing.JLabel();
        spDaño = new javax.swing.JSpinner();
        lbMunicion = new javax.swing.JLabel();
        spMunicion = new javax.swing.JSpinner();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lbVida = new javax.swing.JLabel();
        spVida = new javax.swing.JSpinner();
        lbTiempo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltProyectiles = new javax.swing.JList<>();
        btnRefresLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Lanzador");

        spTiempo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        lbProyectil.setText("Proyectil");

        btCrearLanzador.setText("▄︻═╦══*     Crear    *══╦═︻▄");
        btCrearLanzador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearLanzadorActionPerformed(evt);
            }
        });

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

        lbTiempo.setText("Tiempo de recarga");

        ltProyectiles.setModel(modeloProyectiles());
        ltProyectiles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ltProyectiles);

        btnRefresLista.setText("Refrescar lista");
        btnRefresLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNombre)
                        .addContainerGap(658, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDaño)
                                    .addComponent(spDaño, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMunicion)
                                    .addComponent(spMunicion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbVida)
                                    .addComponent(spVida, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTiempo)
                                    .addComponent(spTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRefresLista)
                                    .addComponent(lbProyectil)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCrearLanzador, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbDaño)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spDaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lbTiempo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbVida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMunicion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spMunicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbProyectil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCrearLanzador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresLista)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCrearLanzadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearLanzadorActionPerformed
        if (tfNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe darle un nombre al arma", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        List<Arma> listaArmas = servicioArma.getArmas();
        String nombre = tfNombre.getText().trim();
        
        for (Arma a : listaArmas) {
            if (a.getNombre().equals(nombre) && a.getClass().getSimpleName().equals("Lanzador")) {
                JOptionPane.showMessageDialog(this, "Ya existe un lanzador con este nombre.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        int daño = (int) spDaño.getValue();
        int municion = (int) spMunicion.getValue();
        int vida = (int) spVida.getValue();
        int tiempoRecarga = (int) spTiempo.getValue();

        Proyectil proyectil = ltProyectiles.getSelectedValue();
        if (proyectil == null) {
            JOptionPane.showMessageDialog(this, "Proyectil no seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Arma lanzador = new Lanzador(daño, municion, nombre, tiempoRecarga, vida, proyectil);
        servicioArma.añadirArma(lanzador);
        System.out.println(lanzador.toString());
        JOptionPane.showMessageDialog(this, "Exito al crear el lanzador", "Exito", JOptionPane.INFORMATION_MESSAGE);
        resetearForm();
    }//GEN-LAST:event_btCrearLanzadorActionPerformed

    public void resetearForm() {
        tfNombre.setText(null);
        spDaño.setValue(0);
        spMunicion.setValue(0);
        spVida.setValue(0);
        spTiempo.setValue(0);
    }
    
    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void btnRefresListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresListaActionPerformed
        ltProyectiles.setModel(modeloProyectiles());
    }//GEN-LAST:event_btnRefresListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCrearLanzador;
    private javax.swing.JButton btnRefresLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDaño;
    private javax.swing.JLabel lbMunicion;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbProyectil;
    private javax.swing.JLabel lbTiempo;
    private javax.swing.JLabel lbVida;
    private javax.swing.JList<Proyectil> ltProyectiles;
    private javax.swing.JSpinner spDaño;
    private javax.swing.JSpinner spMunicion;
    private javax.swing.JSpinner spTiempo;
    private javax.swing.JSpinner spVida;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cambio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
