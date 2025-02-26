/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UsoIncorrecto;

/**
 *
 * @author camilo.torreso
 */
public class Prueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Pérez", 50000);
        Gerente gerente1 = new Gerente("Ana López", 80000, "Ventas");

        System.out.println(empleado1.getNombre() + ", " + empleado1.getSalario());
        System.out.println(gerente1.mostrarDetalles());
    }
}
