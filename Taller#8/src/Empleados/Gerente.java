/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author camilo.torreso
 */
public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double salario, String departament){
        super(nombre, salario);
        this.departamento = departamento;
    }
    public String mostrarDetalles(){
        return "Nombre : "+nombre+ "; Salario : "+salario+"; departamento : "+departamento;
    }
}
