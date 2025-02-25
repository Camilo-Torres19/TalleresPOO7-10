/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author camilo.torreso
 */
public class Coche extends Vehiculo {
    private int numeroDePuertas;
    
    public Coche(String marca, double velocidadMaxima, int numeroDePuertas){
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
}
