/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UsoIncorrecto;

/**
 *
 * @author camilo.torreso
 */
class Trabajador {
    protected double salario;
    
    public Trabajador(double salario) {
        this.salario = salario;
    }
}

// Error: Java no admite herencia múltiple directa
// class EmpleadoInvalido extends Persona, Trabajador {
//     public EmpleadoInvalido(String nombre, double salario) {
//         super(nombre);
//         this.salario = salario;
//     }
// }
