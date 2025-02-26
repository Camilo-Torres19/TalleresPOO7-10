/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peces;

/**
 *
 * @author camilo.torreso
 */
public class Pez implements Nadador,Respirador {
    private String nombre;
    
    public Pez(String nombre){
        this.nombre = nombre;
    }
    public void Nadar(){
        System.out.println(nombre+" esta nandando.");
    }
    public void Respirar(){
        System.out.println(nombre+" esta repirando.");
    }
}
