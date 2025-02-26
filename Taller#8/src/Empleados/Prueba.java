/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author camilo.torreso
 */
public class Prueba {
    
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Karla Gomez",500000);
        Empleado gerente = new Gerente("Vanessa Lopez",1200000,"Sistemas");
        
        //Utilizacion de los metodos de la calse base y de la clase heredada
        empleado.mostrarDetalles();
        gerente.mostrarDetalles();
    }
}
