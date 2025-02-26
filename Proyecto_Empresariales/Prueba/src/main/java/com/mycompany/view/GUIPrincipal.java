/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.arma.Arma;
import com.mycompany.arma.Proyectil;
import com.mycompany.servicio.ServicioArma;
import com.mycompany.servicio.ServicioProyectiles;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListModel;

/**
 *
 * @author jupaf
 */
public class GUIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form GUIPrincipal
     */
    private ServicioProyectiles servicioProyectiles = new ServicioProyectiles();
    private ServicioArma servicioArma = new ServicioArma();

    public GUIPrincipal() {
        // Eliminar bordes y barra de título

        FondoPanel panel = new FondoPanel("src\\main\\java\\imagenes\\Fondogame.jpg");
        initComponents();
        
        btnIniciar.setPreferredSize(new Dimension(180, 50));
        
        JPanel panelBoton = new JPanel(new GridBagLayout()); // Usar GridBagLayout para centrar el botón
        panelBoton.setOpaque(false); // Hacer el panel transparente para que se vea el fondo

        // Agregar el botón al panel intermedio
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); // Márgenes alrededor del botón
        panelBoton.add(btnIniciar, gbc);

        // Configurar el layout del panel de fondo
        panel.setLayout(new BorderLayout());

        // Agregar el panel intermedio al panel de fondo
        panel.add(panelBoton, BorderLayout.CENTER);

        // Establecer el panel de fondo como contenido del frame
        setContentPane(panel);

        // Centrar el frame en la pantalla
        setLocationRelativeTo(this);
    }

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMenuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMenuItemCProyectiles = new javax.swing.JMenuItem();
        jMenuItemListarProyectiles = new javax.swing.JMenuItem();
        jmArma = new javax.swing.JMenu();
        miCrearArma = new javax.swing.JMenuItem();
        miListarArma = new javax.swing.JMenuItem();
        miEliminar = new javax.swing.JMenuItem();
        miConsultar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        miAcerca = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Juego");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnIniciar.setText("Iniciar juego");
        btnIniciar.setToolTipText("");
        btnIniciar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("File");

        JMenuSalir.setText("Salir");
        JMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Proyectiles");

        JMenuItemCProyectiles.setText("Crear");
        JMenuItemCProyectiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemCProyectilesActionPerformed(evt);
            }
        });
        jMenu2.add(JMenuItemCProyectiles);

        jMenuItemListarProyectiles.setText("Listar");
        jMenuItemListarProyectiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarProyectilesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemListarProyectiles);

        jMenuBar1.add(jMenu2);

        jmArma.setText("Armas");

        miCrearArma.setText("Crear");
        miCrearArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearArmaActionPerformed(evt);
            }
        });
        jmArma.add(miCrearArma);

        miListarArma.setText("Listar");
        miListarArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarArmaActionPerformed(evt);
            }
        });
        jmArma.add(miListarArma);

        miEliminar.setText("Buscar y eliminar");
        miEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarActionPerformed(evt);
            }
        });
        jmArma.add(miEliminar);

        miConsultar.setText("Consultar");
        miConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarActionPerformed(evt);
            }
        });
        jmArma.add(miConsultar);

        jMenuBar1.add(jmArma);

        jMenu5.setText("Ayuda");

        miAcerca.setText("Acerca de");
        miAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaActionPerformed(evt);
            }
        });
        jMenu5.add(miAcerca);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JMenuSalirActionPerformed

    private void JMenuItemCProyectilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemCProyectilesActionPerformed
        GUICrearProyectil gui = new GUICrearProyectil(servicioProyectiles);
        gui.setVisible(true);
    }//GEN-LAST:event_JMenuItemCProyectilesActionPerformed

    private void jMenuItemListarProyectilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarProyectilesActionPerformed
        // TODO add your handling code here:
        GUIListarProyectiles gui = new GUIListarProyectiles(servicioProyectiles);
        gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemListarProyectilesActionPerformed

    private void miAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaActionPerformed
        JOptionPane.showMessageDialog(this, "Autores: Juan Alvarez, Sebastian Acosta, Juan Forero \n version 0.0", "Acerca de nosotros", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_miAcercaActionPerformed

    private void miCrearArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearArmaActionPerformed
        GUICrearArma gui = new GUICrearArma(servicioArma, servicioProyectiles);
        gui.setVisible(true);
    }//GEN-LAST:event_miCrearArmaActionPerformed

    private void miListarArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarArmaActionPerformed
        GUIListarArmas gui = new GUIListarArmas(servicioArma);
        gui.setVisible(true);
    }//GEN-LAST:event_miListarArmaActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (modeloLanzadores().getSize() == 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "No hay armas creadas, redireccionando a creacion de armas",
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE
            );

            GUICrearArma gui = new GUICrearArma(servicioArma, servicioProyectiles);
            gui.setVisible(true);
        } else {
            GUIElegirArma gui = new GUIElegirArma(servicioArma, servicioProyectiles);
            gui.setVisible(true);
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void miEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarActionPerformed
        GUIEliminarArma gui = new GUIEliminarArma(servicioArma);
        gui.setVisible(true);
    }//GEN-LAST:event_miEliminarActionPerformed

    private void miConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarActionPerformed
        GUIConsultarArma gui = new GUIConsultarArma(servicioArma);
        gui.setVisible(true);
    }//GEN-LAST:event_miConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuItemCProyectiles;
    private javax.swing.JMenuItem JMenuSalir;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemListarProyectiles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmArma;
    private javax.swing.JMenuItem miAcerca;
    private javax.swing.JMenuItem miConsultar;
    private javax.swing.JMenuItem miCrearArma;
    private javax.swing.JMenuItem miEliminar;
    private javax.swing.JMenuItem miListarArma;
    // End of variables declaration//GEN-END:variables

}
