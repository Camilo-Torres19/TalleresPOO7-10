/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiantes;

/**
 *
 * @author HP
 */
public class Persona {
    protected String nombre;
    protected int edad;
    
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public String mostrarInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
    
}
