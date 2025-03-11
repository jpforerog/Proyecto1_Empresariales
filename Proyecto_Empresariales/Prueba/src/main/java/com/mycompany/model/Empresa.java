/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author jupaf
 */
public class Empresa {
    private int nit;
    private static Empresa empresa;
    private Empresa(){
        
    }
    public static Empresa getInstance(){
        if(empresa == null){
            empresa = new Empresa();
            empresa.nit = 2000000;
        }
        return empresa;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
    
}
