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
public class Arma {
    private int daño;
    private int municion;
    private String nombre;
    private LocalDate fechaCreacion;

    
    //Nuevos atributos
    private int capMunicion;   
    private int vida=100;
    private final int distancia = 100;

    public Arma(int daño, int municion, String nombre, int vida) {
        this.daño = daño;
        this.municion = municion;
        this.capMunicion = municion;
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getCapMunicion() {
        return capMunicion;
    }

    public void setCapMunicion(int capMunicion) {
        this.capMunicion = capMunicion;
    }
    public boolean enemigoVivo(Arma enemigo){
        if(enemigo.getVida()<=0){
            return false;
        }
        return true;
    }
    /*
    public void disparar(int gatillo, Arma objetivoConVida) {
        if (enemigoVivo(objetivoConVida)) { // Mientras el objetivo tenga vida
            if (municion >= gatillo) {
                municion -= gatillo;
                
                System.out.println("Disparando. Munición restante: " + municion);
            } else {
                System.out.println("Sin munición. Recargando...");
                recargar(); 
            }
        }
        System.out.println("El objetivo ya no tiene vida. Dejando de disparar.");
    }*/
    public Arma disparar(Arma objetivoConVida){
        if(enemigoVivo(objetivoConVida)){
            municion -= 1;
            objetivoConVida.setVida(objetivoConVida.getVida() - this.getDaño());
        }
        return objetivoConVida;
    }

    public void recargar() {
        int tiempoRecarga = (int) (Math.round(daño * 0.2) * 100); //El tiempo de recarga depende del daño, puesto que asi se penaliza las armas con demasiado daño
        try {
            Thread.sleep(tiempoRecarga);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            System.out.println("Fue interrumpida la recarga.");
        }
        municion = capMunicion;
        System.out.println("Recarga completada. Munición: " + municion);
    }
    
}
