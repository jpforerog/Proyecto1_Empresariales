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
    private int tiempoRecarga; // el tiempo de recarga es obsoleto
    private Proyectil proyectil;
    public Lanzador(int daño, int municion, String nombre, int tiempoRecarga, int vida, Proyectil proyectil) {
        super(daño, municion, nombre, vida);
        this.tiempoRecarga = tiempoRecarga;
        this.proyectil = proyectil;
    }

    public float getTiempoRecarga() {
        return tiempoRecarga;
    }

    public void setTiempoRecarga(int tiempoRecarga) {
        this.tiempoRecarga = tiempoRecarga;
    }

    public Proyectil getProyectil() {
        return proyectil;
    }

    public void setProyectil(Proyectil proyectil) {
        this.proyectil = proyectil;
    }
    
    /*@Override
    public String toString() {
        return "Lanzador{" + "da\u00f1o=" + getDaño() + ", municion=" + getMunicion() + ", nombre=" 
                + getNombre() + ", fechaCreacion=" + getFechaCreacion() + ", capMunicion=" 
                + getMunicion() + ", vida=" + getVida() + ", tiempo de recarga = " + tiempoRecarga 
                + "-----" +proyectil.toString() + '}';
    }*/
    
    @Override
    public String toString() {
        return "Lanzador -> " + getNombre() + " con daño de " + getDaño();
    }
    
    
}
