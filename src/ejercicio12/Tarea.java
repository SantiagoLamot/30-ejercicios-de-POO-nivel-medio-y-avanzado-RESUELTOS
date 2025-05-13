public class Tarea {
    public String nombre;
    public String descripcion;
    public boolean terminada  = false;

    public Tarea(){}

    public Tarea(String nombre, String descripcion){
        this.nombre =nombre;
        this.descripcion = descripcion;
    }

    public void terminarTarea(){
        this.terminada = true;
    }

    @Override
    public String toString() {
        return nombre + ", descripcion: "+descripcion;
    }
}
