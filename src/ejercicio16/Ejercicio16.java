/**
 * Ejercicio 16
 * Consigna: Crear una clase Estudiante con promedio, y métodos para saber si aprueba.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Estudiante es = new Estudiante("Juan Bautista");

        es.addNotas(10);
        es.addNotas(8);
        es.addNotas(6);

        System.out.println("promedio: " + es.getPromedio());
        System.out.println("Estado del estudante: " + es.aprueba());
    }
}