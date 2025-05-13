/**
 * Ejercicio 12
 * Consigna: Simular un sistema de tareas con clases Tarea y Usuario, y asignación entre ellos.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Santiago");
        Usuario u2 = new Usuario("Juan");

        Tarea t1 = new Tarea("Main", "Hacer metodo principal");
        Tarea t2 = new Tarea("Interfaz Persona", "hacer IPersona");
        u1.asignarTarea(t1);
        u1.asignarTarea(t2);
        u1.listarTareas();
        
        u2.asignarTarea(new Tarea("Clase Persona","Implementar clase persona"));
        u2.listarTareas();
    }
}