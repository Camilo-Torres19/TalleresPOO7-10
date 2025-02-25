
package Estudiantes;

/**
 *
 * @author HP
 */
public class Prueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);
        Estudiante estudiante = new Estudiante("María", 20, "A12345");
        
        persona.mostrarInformacion();
        estudiante.mostrarInformacion();
    }
}
