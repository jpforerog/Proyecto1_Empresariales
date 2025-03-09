/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.time.LocalDate;

/**
 *
 * @author Unibague
 */
public class Lanzador extends Arma {

    private int tiempoRecarga; // el tiempo de recarga es obsoleto
    private Proyectil proyectil;
    private boolean recargaCompletada;

    public Lanzador(int daño, int municion, String nombre, int tiempoRecarga, int vida, Proyectil proyectil) {
        super(daño, municion, nombre, vida);
        this.tiempoRecarga = tiempoRecarga;
        this.proyectil = proyectil;
    }

    @Override
    public Lanzador clone() {
        return (Lanzador) super.clone();
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

    @Override
    public synchronized void recargar() {
        int tiempoRecarga = 3000;
        int temp = (int) (Math.round(getDaño() * 0.2) * 100); //El tiempo de recarga depende del daño, puesto que asi se penaliza las armas con demasiado daño
        if (temp > tiempoRecarga) {
            tiempoRecarga = temp;
        }
        System.out.println(temp);
        try {
            System.out.println("Recargando...");
            Thread.sleep(tiempoRecarga);
            recargaCompletada = true;
            notify();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            System.out.println("Fue interrumpida la recarga.");
        }
        setMunicion(getCapMunicion());
        System.out.println("Recarga completada. Munición: " + getMunicion());

    }

    public synchronized void esperarRecarga() {
        while (!recargaCompletada) {
            try {
                wait(); // Espera hasta que se notifique la recarga
            } catch (InterruptedException ex) {
                System.out.println("Espera interrumpida.");
            }
        }
        System.out.println("Recarga completada.");
    }

    
    public String toStringCompleto() {
        return "Lanzador{" + "da\u00f1o=" + getDaño() + ", municion=" + getMunicion() + ", nombre=" 
                + getNombre() + ", fechaCreacion=" + getFechaCreacion() + ", capMunicion=" 
                + getMunicion() + ", vida=" + getVida() + ", tiempo de recarga = " + tiempoRecarga 
                + "-----" +proyectil.toString() + '}';
    }
    @Override
    public String toString() {
        return "Lanzador -> " + getNombre() + " con daño de " + getDaño() + " y vida de " + getVida();
    }

}
