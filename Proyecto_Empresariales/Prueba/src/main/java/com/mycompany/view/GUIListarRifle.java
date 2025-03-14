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
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan David
 */
public class GUIListarRifle extends javax.swing.JFrame implements IObserver {

    private ServicioArma servicioArma;

    /**
     * Creates new form GUIListarRifle
     */
    public GUIListarRifle(ServicioArma servicioArma) {
        this.servicioArma = servicioArma;
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

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListar = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Rifle");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblTitulo.setText("RIFLES");

        tbListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
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
        tbListar.getTableHeader().setResizingAllowed(false);
        tbListar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbListar);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitulo)
                        .addGap(323, 323, 323))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListar)
                .addGap(316, 316, 316))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        cambio();

    }//GEN-LAST:event_btnListarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        servicioArma.desRegistrarGUI(this);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbListar;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void cambio() {
        DefaultTableModel dtm = (DefaultTableModel) tbListar.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < 11; i++) {
            dtm.addRow(new Object[dtm.getColumnCount()]); // Añade fila con valores null
        }
        System.out.println("imprimendo lista de armas");
        for(Arma a:servicioArma.getArmas()){
            System.out.println(a.toString());
        }
        List<Arma> listaArmas = servicioArma.getArmas();
        if (listaArmas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay armas para listar", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
       
        
        
        List<Rifle> listaRifles = listaArmas.stream()
                .filter(Rifle.class::isInstance) // Filtra solo las instancias de Rifle
                .map(Rifle.class::cast) // Catea los elementos a Rifle
                .collect(Collectors.toList()); // Recolecta los resultados en una lista
        if (listaRifles.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay armas para listar", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int fila = 0;
        for (Rifle a : listaRifles) {
            if (fila < dtm.getRowCount()) {
                tbListar.setValueAt(a.getNombre(), fila, 0);
                tbListar.setValueAt(a.getDaño(), fila, 1);
                tbListar.setValueAt(a.getMunicion(), fila, 2);
                tbListar.setValueAt(a.getVida(), fila, 3);
                tbListar.setValueAt(a.getCadenciaDisparo(), fila, 4);
                tbListar.setValueAt(a.getVelocidad(), fila, 5);
            } else {
                dtm.addRow(new Object[dtm.getColumnCount()]);
                tbListar.setValueAt(a.getNombre(), fila, 0);
                tbListar.setValueAt(a.getDaño(), fila, 1);
                tbListar.setValueAt(a.getMunicion(), fila, 2);
                tbListar.setValueAt(a.getVida(), fila, 3);
                tbListar.setValueAt(a.getCadenciaDisparo(), fila, 4);
                tbListar.setValueAt(a.getVelocidad(), fila, 5);
            }
        
        fila++;
    }
}
}
