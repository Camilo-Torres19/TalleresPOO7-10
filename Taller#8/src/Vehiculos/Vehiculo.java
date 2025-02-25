/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author camilo.torreso
 */
public class Vehiculo {
    private String marca;
    private double velocidadMaxima;
    
    public Vehiculo(String marca, double velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    public String detalles(){
        return "Vehiculo marca : "+marca + " Su velocidad maxima es de : "+velocidadMaxima;
    }
}
