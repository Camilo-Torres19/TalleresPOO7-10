package Empleados;

/**
 *
 * @author camilo.torreso
 */
public abstract class Empleado {
    private String nombre;
    
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    
    public abstract double calcularSalario();
    
    public void mostrarSalario(){
        System.out.println("----*** DETALLES DEL EMPLEADO ***----");
        System.out.println("Empleado : "+nombre);
        System.out.println("Total salario : "+calcularSalario());
        System.out.println("-------------------------------------");
    }
}
