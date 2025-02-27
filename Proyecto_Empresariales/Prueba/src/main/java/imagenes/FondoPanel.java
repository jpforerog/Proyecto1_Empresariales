/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imagenes;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author jupaf
 */


public class FondoPanel extends JPanel {
    private Image imagen;

    public FondoPanel(String rutaImagen) {
        // Cargar la imagen desde la ruta especificada
        imagen = new ImageIcon(rutaImagen).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar la imagen de fondo
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
}