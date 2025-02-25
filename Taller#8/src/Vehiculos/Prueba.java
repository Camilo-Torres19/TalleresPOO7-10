/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author HP
 */
public class Prueba {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", 180);
        Coche coche = new Coche("Honda", 220, 4);

        vehiculo.detalles();
        coche.MostarInfo();
    }
}
