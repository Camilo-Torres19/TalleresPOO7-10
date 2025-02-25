
package Figuras;

/**
 *
 * @author camilo.torreso
 */
public class Prueba {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4,6);
        circulo.MostrarArea();
        rectangulo.MostrarArea();
    }
}
