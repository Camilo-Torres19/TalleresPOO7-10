package Empleados;

/**
 *
 * @author camilo.torreso
 */
public class Gerente extends Empleado {
    private double salarioBase;
    private double bonificacion;
    
    public Gerente(String nombre, double salarioBase, double bonificacion){
        super(nombre);
        this.salarioBase =salarioBase;
        this.bonificacion = bonificacion;     
    }
    public double calcularSalario(){
        return salarioBase+bonificacion;
    }
}
