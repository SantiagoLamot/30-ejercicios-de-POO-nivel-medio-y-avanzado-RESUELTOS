/**
 * Ejercicio 4
 * Consigna: Hacer una clase abstracta Animal con método hacerSonido y varias subclases que lo implementen.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        //Se instancian dos animales diferentes, los cuales heredan de animal
        Animal a1 = new Perro();
        Animal a2 = new Cerdo();
        //Se muestra al polimorfismo al hacer el sonido corriespondiente a cada uno.
        System.out.println(a1.hacerSonido());
        System.out.println(a2.hacerSonido());
    }
}