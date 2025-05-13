/**
 * Ejercicio 6
 * Consigna: Diseñar una interfaz Figura con método calcularArea(), implementada por Círculo y Rectángulo.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Figura f1 = new Rectangulo(4.0, 3.0);
        Figura f2 = new Circulo(5.0);

        System.out.println(f1);
        System.out.println(f2);
    }
}