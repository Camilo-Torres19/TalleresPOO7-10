/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UsoIncorrecto;

/**
 *
 * @author camilo.torreso
 */
class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String mostrarDetalles() {
        // Error: nombre y salario son privados en Empleado
        // return "Nombre: " + nombre + ", Salario: " + salario + ", Departamento: " + departamento;
        return "Nombre: " + getNombre() + ", Salario: " + getSalario() + ", Departamento: " + departamento;
    }
}
