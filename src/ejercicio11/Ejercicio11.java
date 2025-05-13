import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Ejercicio 11
 * Consigna: Hacer uso de Streams para filtrar y ordenar una lista de personas por edad.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        List<Persona> lista =  Arrays.asList(
            new Persona("Santiago", 59),
            new Persona("Juan Bautista", 7),
            new Persona("Ana Paula", 31)
        );

        List <Persona> resultado = lista.stream()
        .sorted(Comparator.comparingInt(Persona::getEdad)) // lambda (Persona::getEdad)==(p->p.getEdad())
        .collect(Collectors.toList());

        resultado.forEach(p -> System.out.println(p));// lambda (System.out::println)==(p -> System.out.println(p))
    }
}