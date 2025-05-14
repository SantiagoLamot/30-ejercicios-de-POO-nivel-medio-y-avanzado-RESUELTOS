import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Double> notas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public void addNotas(double n) {
        notas.add(n);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        double suma = notas.stream()
            .reduce(0.0, (a , b) -> a + b);
        return suma / notas.size();
    }

    public String aprueba(){
        if(getPromedio()>=7){
            return "aprueba";
        }
        return "recursa";
    }
}
