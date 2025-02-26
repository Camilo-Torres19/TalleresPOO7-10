/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author camilo.torreso
 */
public class Persona implements Hablador, Trabajador {
    private String nombre;
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public void Hablar(){
        System.out.println(nombre+" esta hablando.");
    }
    public void Trabajar(){
        System.out.println(nombre+" esta trabajando.");
    }
}
