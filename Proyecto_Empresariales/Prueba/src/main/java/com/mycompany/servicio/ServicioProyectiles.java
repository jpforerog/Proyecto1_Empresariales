/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicio;


import com.mycompany.model.Proyectil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jupaf
 */
public class ServicioProyectiles {
    private ArrayList<Proyectil> proyectiles = new ArrayList<>();
    
    public void añadirProyectil(Proyectil pro){
        if(pro!=null){
            proyectiles.add(pro);
        }
    }
    public void listarProyectiles(){
        for (Proyectil pro : proyectiles) {
            System.out.println(pro.toString());
        }
    }
    /**
     *
     * @return
     */
    public List<Proyectil> getProyectiles(){
        return proyectiles;
    }
    
    public void eliminarProyectil(Proyectil proyectil) {
        if (proyectil != null) {
            proyectiles.remove(proyectil);
        }
    }
    
}
