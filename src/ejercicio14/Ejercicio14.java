/**
 * Ejercicio 14
 * Consigna: Crear una clase Vehículo con polimorfismo: Auto, Moto, Bicicleta.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Vehiculo a1 = new Auto("Volkswagen","Rojo", "2014", "PNK432");
        Vehiculo m1 = new Moto("Motomel", "Blanca", "2012", 250);
        Vehiculo b1 = new Bicicleta("Shimano", "Negra", "2025", 29);

        System.out.println(a1);
        System.out.println(m1);
        System.out.println(b1);
    }
}