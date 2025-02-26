/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aves;

/**
 *
 * @author camilo.torreso
 */
public class Ave implements Cantante, Volador {
    private String nombre;
    
    public Ave(String nombre){
        this.nombre = nombre;
    }
    public void volar(){
        System.out.println(nombre+" esta volando.");
    }
    public void cantar(){
        System.out.println(nombre+" esta nadando.");
    }
}
