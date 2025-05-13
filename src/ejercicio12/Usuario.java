import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final int legajo;
    private static int proximoLeg = 1;
    private final String nombre;
    private List<Tarea> tareas;
    
    public Usuario(String nombre){
        this.nombre =  nombre;
        this.legajo = proximoLeg;
        proximoLeg++;
        this.tareas = new ArrayList<>();
    }
    public void asignarTarea(Tarea t){
        tareas.add(t);
    }

    public void listarTareas(){
        System.out.println("Tareas de: "+nombre+" legajo "+legajo);
        tareas.forEach(System.out::println);
    }
}





