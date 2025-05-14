import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Ejercicio 17
 * Consigna: Hacer una clase CuentaCorriente con límites de sobregiro.
 */
public class Ejercicio17 {
    public static void main(String[] args) {

        CuentaCorriente ct = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (ct == null) {
                limpiarConsola();
                System.out.println("Ingrese su nombre y apellido para crear cuenta bancaria");
                String nombre = sc.nextLine();
                ct = new CuentaCorriente(nombre);
            } else {
                limpiarConsola();
                mostrarMenu(ct);
                int op = sc.nextInt();
                sc.nextLine(); // limpio el teclado
                switch (op) {
                    case 1:
                        ct.deposito(new BigDecimal(hacerDeposito()));
                        break;
                    case 2:
                        ct.retiro(new BigDecimal(hacerExtraccion()));
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            }
        }
    }

    private static String hacerExtraccion() {
        System.out.println("Ingrese el monto a extraer");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static String hacerDeposito() {
        System.out.println("Ingrese el monto a depositar");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static void mostrarMenu(CuentaCorriente ct) {
        System.out.println("========================================");
        System.out.println("Titular: " + ct.getNombre() + "\tSaldo: " + ct.getSaldo());
        System.out.println("========================================");
        System.out.println("1- Realizar deposito");
        System.out.println("2- Extraer dinero");
        System.out.println("0- Salir");
        System.out.println("========================================");
        System.out.println("Seleccione una opcion");
    }

    public static void limpiarConsola() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la consola.");
        }
    }
}