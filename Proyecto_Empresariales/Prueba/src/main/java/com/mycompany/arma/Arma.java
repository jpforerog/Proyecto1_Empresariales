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

    public Arma(int daño, int municion, String nombre, LocalDate fechaCreacion) {
        this.daño = daño;
        this.municion = municion;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
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
    
    public void disparar(){
        
    }
    public void recargar(){
        
    }
    
}
