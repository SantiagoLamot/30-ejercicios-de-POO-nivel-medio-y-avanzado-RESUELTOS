import java.util.Scanner;

/**
 * Ejercicio 10
 * Consigna: Crear una clase para validar contraseñas con excepciones personalizadas.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String contrasenia = scanner.nextLine();

        try {
            ValidarContrasenia.validar(contrasenia);
            System.out.println("Contraseña válida");
        }
        catch (PasswordInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}