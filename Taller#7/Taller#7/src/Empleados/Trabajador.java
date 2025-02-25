package Empleados;

/**
 *
 * @author camilo.torreso
 */
public class Trabajador extends Empleado {
    
        private double salarioBase;
        private double comision;
        private double venta;
        
    public Trabajador(String nombre, double salarioBase, double comision, double venta){
        super(nombre);
        this.salarioBase = salarioBase;
        this.comision = comision;
        this.venta = venta;
    }
    public double calcularSalario(){
        return salarioBase + (venta * comision);
    }

    
}
