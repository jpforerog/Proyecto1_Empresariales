/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;
/**
 *
 * @author Unibague
 */
public class Proyectil {
    private String tipo;
    private float velocidad;
    private float radoExplosion;

    public Proyectil(String tipo, float velocidad, float radoExplosion) {
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.radoExplosion = radoExplosion;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    /*@Override
    public String toString() {
        return "Tipo: "+this.tipo+" Velocidad: "+this.velocidad+" Radio de explosion: "
                +this.radoExplosion; 
    }*/
    
    @Override
    public String toString() {
        return "Proyectil -> " + tipo + " con radio de explosión de " + radoExplosion; 
    }
    
  
        
    
    
    
}
