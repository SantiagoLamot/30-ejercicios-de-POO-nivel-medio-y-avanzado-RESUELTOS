public class Contacto {
    private String nombre;
    private String telefono;
    public Contacto(){}
    public Contacto(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    @Override
    public String toString() {
        return nombre+"\t\ttelefono:"+telefono;
    }
}
