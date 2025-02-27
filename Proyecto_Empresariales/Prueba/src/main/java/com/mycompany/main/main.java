/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
 
import com.mycompany.arma.*;
import java.time.LocalDate;

/**
 *
 * @author jupaf
 */
public class main {

    public static void main(String[] args) {
        Arma rifle = new Rifle(5, 1, "joa", 100, 5, 5);
        while(true){
            rifle.disparar(rifle);
        }
        
        //Arma arm2 = new Arma(20, 10, "hola", LocalDate.MIN, 40);
        
        /*for (int i = 0; i < 10; i++) {
            arm2.recargar();
            System.out.println("Recarga No: " + i);
        }
    
        // Simular varias recargas
        for (int j = 0; j < 10; j++) {
            rifle.recargar();
        }*/
        
    }
    
}
