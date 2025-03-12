/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicio;

import com.mycompany.model.Arma;
import com.mycompany.model.IObserver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan David
 */
public class ServicioArma {

    private ArrayList<Arma> armas = new ArrayList<>();
    private List<IObserver> guis = new ArrayList<>();

    public void añadirArma(Arma arm) {
        if (arm != null) {
            armas.add(arm);
            cambio();
        }
    }

    public void listarArma() {
        for (Arma arm : armas) {
            System.out.println(arm.toString());
        }
    }

    /**
     *
     * @return
     */
    public List<Arma> getArmas() {
        return armas;
    }

    public void eliminarArma(Arma arma) {
        if (arma != null) {
            armas.remove(arma);
            cambio();
        }
    }

    public void actualizarArma(Arma armaAct, Arma nueva) throws Exception {
        if (armaAct == null) {
            throw new Exception("Vuelve a buscar y seleccionar el arma que quieres actualizar");
        } else {

            for (Arma ar : armas) {
                System.out.println(armaAct.equals(ar));
                if (armaAct.equals(ar)) {
                    System.out.println("Entraaa");
                    System.out.println(nueva);
                    armas.remove(ar);
                    armas.add(nueva);
                }
            }
        }
        cambio();
    }

    public void registrarGUI(IObserver gui) {
        guis.add(gui);
        System.out.println(guis);
    }

    public void desRegistrarGUI(IObserver gui) {
        guis.remove(gui);
        System.out.println(guis);

    }

    public void cambio() {
        for (IObserver gui : guis) {
            gui.cambio();
        }
    }
}
