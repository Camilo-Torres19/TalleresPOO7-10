
package Empleados;

/**
 *
 * @author camilo.torreso
 */
public class Prueba {
    public static void main(String[] args) {
        Empleado gerente1 = new Gerente("Carlos",50,5);
        Empleado trabajador1 = new Trabajador("Steven", 50, 0.10,5);
        
        gerente1.mostrarSalario();
        trabajador1.mostrarSalario();
    }
}
