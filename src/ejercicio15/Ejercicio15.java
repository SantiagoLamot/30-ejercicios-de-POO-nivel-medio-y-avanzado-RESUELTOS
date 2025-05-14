/**
 * Ejercicio 15
 * Consigna: Modelar una clase Restaurante con menú y métodos para agregar, buscar y eliminar platos.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Plato p1 = new Plato("papas fritas", "para dos personas");
        Plato p2 = new Plato("hamburguesa doble", "doble carne y doble chedar ");

        Restaurant res = new Restaurant();
        res.add(p1);
        res.add(p2);

        for (Plato p : res.getPlatos()) {
            System.out.println(p);
        }

        res.quitarPlato("hamburguesa doble");
        System.out.println("Luego de quitarse hamburguesa doble");
        for (Plato p : res.getPlatos()) {
            System.out.println(p);
        }

        Plato buscado = res.buscarPlato("papas fritas");

        if (buscado != null) {
            System.out.println("Plato encontrado: " + buscado);
        } else {
            System.out.println("Plato no encontrado.");
        }

    }
}