/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author camilo.torreso
 */
public class Prueba {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(10, 5);
        Figura triangulo = new Triangulo(8, 4);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
