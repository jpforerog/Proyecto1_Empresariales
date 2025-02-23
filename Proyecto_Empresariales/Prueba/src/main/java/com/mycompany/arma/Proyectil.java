/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arma;
/**
 *
 * @author Unibague
 */
public class Proyectil {
    private String nombre;
    private float velocidad;
    private float radoExplosion;

    public Proyectil(String tipo, float velocidad, float radoExplosion) {
        this.nombre = tipo;
        this.velocidad = velocidad;
        this.radoExplosion = radoExplosion;
    }
    

    public String getTipo() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.nombre = tipo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getRadoExplosion() {
        return radoExplosion;
    }

    public void setRadoExplosion(float radoExplosion) {
        this.radoExplosion = radoExplosion;
    }

    @Override
    public String toString() {
        return "Tipo: "+this.nombre+" Velocidad: "+this.velocidad+" Radio de explosion: "+this.radoExplosion; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
  
        
    
    
    
}
