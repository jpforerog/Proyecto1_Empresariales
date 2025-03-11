/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.model.Arma;
import com.mycompany.model.IObserver;
import com.mycompany.model.Rifle;
import com.mycompany.servicio.ServicioArma;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan David
 */
public class GUIEliminarRifle extends javax.swing.JFrame implements IObserver{

    private ServicioArma servicioArma;
    private Rifle rifleEliminar;

    public GUIEliminarRifle(ServicioArma servicioArma) {
        this.servicioArma = servicioArma;
        this.rifleEliminar = null;
        initComponents();
        setLocationRelativeTo(this);
        servicioArma.registrarGUI(this);
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
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Arma");

        lblConsultar.setText("Consultar (Ingrese el nombre del arma)");

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

        tbListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Daño", "Munición", "Vida", "Cadencia", "Velocidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbListar.getTableHeader().setResizingAllowed(false);
        tbListar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbListar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfConsultar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConsultar)
                            .addComponent(btnBuscar)
                            .addComponent(btnEliminar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (tfConsultar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe poner un nombre para buscar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String nombre = tfConsultar.getText().trim();

        rifleEliminar = (Rifle) buscarArmas(nombre);
        if (rifleEliminar == null) {
            JOptionPane.showMessageDialog(this, "El arma no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        tbListar.setValueAt(rifleEliminar.getNombre(), 0, 0);
        tbListar.setValueAt(rifleEliminar.getDaño(), 0, 1);
        tbListar.setValueAt(rifleEliminar.getMunicion(), 0, 2);
        tbListar.setValueAt(rifleEliminar.getVida(), 0, 3);
        tbListar.setValueAt(rifleEliminar.getCadenciaDisparo(), 0, 4);
        tbListar.setValueAt(rifleEliminar.getVelocidad(), 0, 5);
    }//GEN-LAST:event_btnBuscarActionPerformed

    public Arma buscarArmas(String nombre) {
        List<Arma> lista = servicioArma.getArmas();
        for (Arma arm : lista) {
            if (arm.getNombre().equals(nombre) && arm.getClass().getSimpleName().equals("Rifle")) {
                return arm;
            }
        }
        return null;
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int iRifle = tbListar.getSelectedRow();
        if (iRifle == -1) {
            JOptionPane.showMessageDialog(this, "No selecciono nigún rifle", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nombre = (String) tbListar.getValueAt(iRifle, 0);

        if (rifleEliminar.getNombre().equals(nombre)) {
            int respuesta = JOptionPane.showConfirmDialog(
                    this,
                    "¿Desea continuar con la eliminación?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (respuesta == JOptionPane.YES_OPTION) {
                servicioArma.eliminarArma(rifleEliminar);
            } else {
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Se elimino el arma correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
        rifleEliminar = null;
        resetearForm();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void resetearForm() {
        tfConsultar.setText(null);
        tbListar.setValueAt(null, 0, 0);
        tbListar.setValueAt(null, 0, 1);
        tbListar.setValueAt(null, 0, 2);
        tbListar.setValueAt(null, 0, 3);
        tbListar.setValueAt(null, 0, 4);
        tbListar.setValueAt(null, 0, 5);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JTable tbListar;
    private javax.swing.JTextField tfConsultar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cambio() {
        
    }
}
