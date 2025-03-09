/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicio;


import com.mycompany.model.Arma;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan David
 */
public class ServicioArma {
    private ArrayList<Arma> armas = new ArrayList<>();
    
    public void añadirArma(Arma arm){
        if(arm!=null){
            armas.add(arm);
        }
    }
    public void listarArma(){
        for (Arma arm : armas) {
            System.out.println(arm.toString());
        }
    }
    /**
     *
     * @return
     */
    public List<Arma> getArmas(){
        return armas;
    }
    
    public void eliminarArma(Arma arma) {
        if (arma != null) {
            armas.remove(arma);
        }
    }
}
