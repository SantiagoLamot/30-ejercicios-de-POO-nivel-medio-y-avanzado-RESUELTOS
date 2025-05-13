/**
 * Ejercicio 13
 * Consigna: Diseñar una clase Biblioteca con manejo de préstamos de libros.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro l1 = new Libro("Biografia de Messi");
        Libro l2 = new Libro("Java 8");
        Libro l3 = new Libro("Java 21");
        biblioteca.add(l1);
        biblioteca.add(l2);
        biblioteca.add(l3);
        biblioteca.listarLibros();
        biblioteca.cambiarEstadoLibro("Java 8");
        biblioteca.listarLibros();
    }
}