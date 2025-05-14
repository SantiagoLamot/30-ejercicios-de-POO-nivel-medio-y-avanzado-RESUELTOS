public class Plato {
    private final int id;
    private static int proxId=1;
    private String nombre;
    private String descripcion;

    public Plato(){
        this.id = proxId;
        proxId++;
    }
    public Plato(String nombre, String descripcion){
        this.id = proxId;
        proxId++;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "id: "+id+", plato: "+nombre+ "\ndescripcion: "+descripcion;
    }
}
