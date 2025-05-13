import java.math.BigDecimal;

/**
 * Ejercicio 5
 * Consigna: Crear una jerarquía Empleado -> Gerente y Programador, y mostrar sus datos.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Santiago", new BigDecimal("2000"));
        Empleado emp2 = new Programador("Juan", new BigDecimal("2000"), "Java");
        Empleado emp3 = new Gerente("Santiago", new BigDecimal("2000"), "Contaduria");

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }
}