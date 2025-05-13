import java.util.Stack;

/**
 * Ejercicio 9
 * Consigna: Implementar una pila (stack) usando una estructura de datos interna.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Stack<Navegacion> historial = new Stack<>();
        
        historial.push(new Navegacion("Google"));
        historial.push(new Navegacion("Facebook"));
        historial.push(new Navegacion("GitHub"));
        historial.push(new Navegacion("Linkedin"));
        
        while(!historial.isEmpty()){
            System.out.println(historial.pop());
        }
    }
}