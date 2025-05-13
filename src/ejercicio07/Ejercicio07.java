import java.math.BigDecimal;

/**
 * Ejercicio 7
 * Consigna: Crear una clase Inventario que use un ArrayList para almacenar productos.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.add(new Producto(1, "Mouse", new BigDecimal("20000"), 6));
        inventario.add(new Producto(2, "Teclado", new BigDecimal("12000"), 3));
        inventario.add(new Producto(3, "Monitor", new BigDecimal("120000"), 2));
        inventario.add(new Producto(4, "HDMI", new BigDecimal("7000"), 7));
        inventario.add(new Producto(5, "Not HP", new BigDecimal("500000"), 3));
        inventario.add(new Producto(6, "USB C", new BigDecimal("1200"), 20));

        inventario.mostrarProductos();
    }
}