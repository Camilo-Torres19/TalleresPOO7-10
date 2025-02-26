/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author camilo.torreso
 */
public class Animal implements Volador, Nadador{
    private String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
   public void Volar(){
       System.out.println(nombre+ "esta volando");
   }
   public void Nadar(){
       System.out.println(nombre+" esta nadando");
   }
}
