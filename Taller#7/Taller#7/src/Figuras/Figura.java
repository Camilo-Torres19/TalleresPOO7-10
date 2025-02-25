package Figuras;

/**
 *
 * @author camilo.torreso
 */
public abstract class Figura {
    
    public abstract double calcularArea();
    
    public void MostrarArea(){
        System.out.println("El area de la figura es : "+calcularArea());
    }
    
}
