import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Restaurant {

    private List<Plato> platos;

    public Restaurant() {
        this.platos = new ArrayList<>();
    }

    public void add(Plato p) {
        platos.add(p);
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }

    public void remove(Plato p) {

    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void quitarPlato(String nombrePlato) {
        List<Plato> resultado = platos.stream()
                .filter(p -> !p.getNombre().equals(nombrePlato))
                .collect(Collectors.toList());
        this.setPlatos(resultado);
    }

    public Plato buscarPlato(String nombrePlato) {
        return platos.stream()
                .filter(p -> p.getNombre().equals(nombrePlato))
                .findFirst()
                .orElse(null);
    }

}
