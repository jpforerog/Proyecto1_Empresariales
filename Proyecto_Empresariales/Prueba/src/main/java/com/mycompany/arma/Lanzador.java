/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arma;

import java.time.LocalDate;

/**
 *
 * @author Unibague
 */
public class Lanzador extends Arma{
    private float tiempoRecarga;
    private Proyectil proyectil;
    public Lanzador(int daño, int municion, String nombre, LocalDate fechaCreacion,float tiempoRecarga, int vida, Proyectil proyectil) {
        super(daño, municion, nombre, fechaCreacion, vida);
        this.tiempoRecarga = tiempoRecarga;
        this.proyectil = proyectil;
    }

    public float getTiempoRecarga() {
        return tiempoRecarga;
    }

    public void setTiempoRecarga(float tiempoRecarga) {
        this.tiempoRecarga = tiempoRecarga;
    }

    public Proyectil getProyectil() {
        return proyectil;
    }

    public void setProyectil(Proyectil proyectil) {
        this.proyectil = proyectil;
    }
    
    
}
