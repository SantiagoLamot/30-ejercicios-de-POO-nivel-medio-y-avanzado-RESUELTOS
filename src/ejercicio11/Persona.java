public class Persona {
    private String nombre;
    private int edad;

    public Persona(){}
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " edad: "+ edad;
    }

}
