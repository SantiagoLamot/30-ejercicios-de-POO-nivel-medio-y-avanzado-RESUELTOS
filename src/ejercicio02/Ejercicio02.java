/**
 * Ejercicio 2
 * Consigna: Crear una clase Coche con atributos marca, modelo y velocidad. Agregar métodos para acelerar y frenar.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        //Se crea el objeto con valores y se muestran los mismos.
        Coche coche = new Coche("Ford", "Focus", 80);
        System.out.println(coche.toString());
        // se invoca al metodo acelerar y se muestra los nuevos valores
        coche.acelerar();
        System.out.println(coche.toString());
        // se llama al metodo frenar y se vuelve a mostrar sus valores
        coche.frenar();
        System.out.println(coche.toString());
        // se le setea una velocidad de 5, luego al no poder ser la velocidad negativa se informa que el auto esta frenado y se muestra la velocidad.
        coche.setVelocidad(5);
        coche.frenar();
        System.out.println(coche.toString());
    }
}