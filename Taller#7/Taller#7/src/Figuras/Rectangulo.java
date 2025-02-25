/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author camilo.torreso
 */
public class Rectangulo extends Figura{
    private double base, altura;
    
    public Rectangulo(double base, double altura){
        this.altura = altura;
        this.base = base; 
    }
    public double calcularArea(){
        return base * altura ;
    }
}
