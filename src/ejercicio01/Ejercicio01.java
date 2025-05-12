/**
 * Ejercicio 1
 * Consigna: Crear una clase Persona con nombre y edad, y mostrar sus datos.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Persona p1 = new Persona(); //Se utliza el constructor vacio para inicializar la clase
        
        p1.setNombre("Santiago"); //Se utilizan los metodos set para insertar nombre y edad
        p1.setEdad(29);
        
        Persona p2 = new Persona("Juan Bautista", 7); //Se utliza el constructor con parametros para instanciar la clase y setelarle valores.
        System.out.print(p1.toString()); // Se utiliza el metodo toString que fue sobreescrito para mostrar los datos de p1.
        System.out.print("Se llama: "+p2.getNombre() +", y tiene "+p2.getEdad()+" años." ); // Se utilizan los metodos get, para obtener el valor de p2 y concatenarlo con otro texto.
    }
}