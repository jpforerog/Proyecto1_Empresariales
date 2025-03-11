/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.model.Arma;
import com.mycompany.model.IObserver;
import com.mycompany.model.Lanzador;
import com.mycompany.model.Proyectil;
import com.mycompany.model.Rifle;
import com.mycompany.servicio.ServicioArma;
import com.mycompany.servicio.ServicioProyectiles;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Juan David
 */
public class GUIActualizarLanzador extends javax.swing.JFrame implements IObserver{

    private ServicioArma servicioArma;
    private ServicioProyectiles servicioProyectiles;
    private Lanzador lanzadorActualizar;

    public GUIActualizarLanzador(ServicioArma servicioArma, ServicioProyectiles servicioProyectiles) {
        this.servicioArma = servicioArma;
        this.servicioProyectiles = servicioProyectiles;
        this.lanzadorActualizar = null;
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

        lblNombre = new javax.swing.JLabel();
        tfConsultar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListar = new javax.swing.JTable();
        lbMunicion = new javax.swing.JLabel();
        spMunicion = new javax.swing.JSpinner();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lbVida = new javax.swing.JLabel();
        spVida = new javax.swing.JSpinner();
        spTiempo = new javax.swing.JSpinner();
        lbTiempo = new javax.swing.JLabel();
        lbProyectil = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ltProyectiles = new javax.swing.JList<>();
        btActualizarLanzador = new javax.swing.JButton();
        lbDaño = new javax.swing.JLabel();
        btnRefresLista = new javax.swing.JButton();
        spDaño = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Arma");

        lblNombre.setText("Ingresa el nombre del arma a actualizar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tbListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Daño", "Munición", "Vida", "Tiempo de recarga", "Proyectil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListar.setRowHeight(50);
        tbListar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbListar.getTableHeader().setResizingAllowed(false);
        tbListar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbListar);

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

        spTiempo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        lbTiempo.setText("Tiempo de recarga");

        lbProyectil.setText("Proyectil");

        ltProyectiles.setModel(modeloProyectiles());
        ltProyectiles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(ltProyectiles);

        btActualizarLanzador.setText("▄︻═╦══*    Actualizar    *══╦═︻▄");
        btActualizarLanzador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarLanzadorActionPerformed(evt);
            }
        });

        lbDaño.setText("Daño");

        btnRefresLista.setText("Refrescar lista");
        btnRefresLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresListaActionPerformed(evt);
            }
        });

        spDaño.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(btnBuscar))
                        .addGap(599, 657, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfConsultar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefresLista)
                            .addComponent(lbProyectil))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDaño)
                                    .addComponent(spDaño, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMunicion)
                                    .addComponent(spMunicion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbVida)
                                    .addComponent(spVida, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTiempo)
                                    .addComponent(spTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNombre)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btActualizarLanzador, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btActualizarLanzador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresLista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (tfConsultar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe poner un nombre para buscar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String nombre = tfConsultar.getText().trim();

        lanzadorActualizar = (Lanzador) buscarArmas(nombre);
        if (lanzadorActualizar == null) {
            JOptionPane.showMessageDialog(this, "El arma no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tbListar.setValueAt(lanzadorActualizar.getNombre(), 0, 0);
        tbListar.setValueAt(lanzadorActualizar.getDaño(), 0, 1);
        tbListar.setValueAt(lanzadorActualizar.getMunicion(), 0, 2);
        tbListar.setValueAt(lanzadorActualizar.getVida(), 0, 3);
        tbListar.setValueAt(lanzadorActualizar.getTiempoRecarga(), 0, 4);
        String proyectil = "<html>Tipo: " + lanzadorActualizar.getProyectil().getTipo()
                + "<br>Velocidad: " + lanzadorActualizar.getProyectil().getVelocidad()
                + "<br>Radio de explosión: " + lanzadorActualizar.getProyectil().getRadoExplosion() + "</html>";
        tbListar.setValueAt(proyectil, 0, 5);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void btActualizarLanzadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarLanzadorActionPerformed
        int iLanzador = tbListar.getSelectedRow();
        if (iLanzador == -1) {
            JOptionPane.showMessageDialog(this, "No selecciono nigún lanzador", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

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

        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Desea continuar con la actualización?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (respuesta == JOptionPane.YES_OPTION) {
            servicioArma.eliminarArma(lanzadorActualizar);
            Arma rifleActualizado = new Lanzador(daño, municion, nombre, tiempoRecarga, vida, proyectil);
            System.out.println(rifleActualizado.toString());
            servicioArma.añadirArma(rifleActualizado);
        } else {
            return;
        }

        JOptionPane.showMessageDialog(this, "Exito al actualizar el lanzador", "Exito", JOptionPane.INFORMATION_MESSAGE);
        lanzadorActualizar = null;
        restearForm();
    }//GEN-LAST:event_btActualizarLanzadorActionPerformed

    private void btnRefresListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresListaActionPerformed
        ltProyectiles.setModel(modeloProyectiles());
    }//GEN-LAST:event_btnRefresListaActionPerformed

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

    public Arma buscarArmas(String nombre) {
        List<Arma> lista = servicioArma.getArmas();
        for (Arma arm : lista) {
            if (arm.getNombre().equals(nombre) && arm.getClass().getSimpleName().equals("Lanzador")) {
                return arm;
            }
        }
        return null;
    }

    public void restearForm() {
        tfConsultar.setText(null);
        tbListar.setValueAt(null, 0, 0);
        tbListar.setValueAt(null, 0, 1);
        tbListar.setValueAt(null, 0, 2);
        tbListar.setValueAt(null, 0, 3);
        tbListar.setValueAt(null, 0, 4);
        tbListar.setValueAt(null, 0, 5);
        tfNombre.setText(null);
        spDaño.setValue(0);
        spMunicion.setValue(0);
        spVida.setValue(0);
        spTiempo.setValue(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizarLanzador;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRefresLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDaño;
    private javax.swing.JLabel lbMunicion;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbProyectil;
    private javax.swing.JLabel lbTiempo;
    private javax.swing.JLabel lbVida;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<Proyectil> ltProyectiles;
    private javax.swing.JSpinner spDaño;
    private javax.swing.JSpinner spMunicion;
    private javax.swing.JSpinner spTiempo;
    private javax.swing.JSpinner spVida;
    private javax.swing.JTable tbListar;
    private javax.swing.JTextField tfConsultar;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cambio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
