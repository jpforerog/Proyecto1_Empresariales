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
public class Rifle extends Arma implements IRifle{
    private int cadenciaDisparo;
    private float velocidad;
    public Rifle(int daño, int municion, String nombre, LocalDate fechaCreacion,int cadenciaDisparo,float velocidad) {
        super(daño, municion, nombre, fechaCreacion);
        this.cadenciaDisparo = cadenciaDisparo;
        this.velocidad = cadenciaDisparo;
        
    }

    public int getCadenciaDisparo() {
        return cadenciaDisparo;
    }

    public void setCadenciaDisparo(int cadenciaDisparo) {
        this.cadenciaDisparo = cadenciaDisparo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void engatillado() {
        
    }
    
}
