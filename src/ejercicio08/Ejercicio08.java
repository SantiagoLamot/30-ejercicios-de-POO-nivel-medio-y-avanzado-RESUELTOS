/**
 * Ejercicio 8
 * Consigna: Desarrollar una clase Agenda para manejar contactos con búsqueda por nombre.
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contacto c1 = new Contacto("Santiago", "123321223");
        agenda.add(c1);
        Contacto c2 = new Contacto("SANTI", "54234534534534");
        agenda.add(c2);
        Contacto c3 = new Contacto("Juan", "234234");
        agenda.add(c3);
        Contacto c4 = new Contacto("Ana", "3232331231");
        agenda.add(c4);
        
        agenda.buscarPorNombre("Santi");
    }
}