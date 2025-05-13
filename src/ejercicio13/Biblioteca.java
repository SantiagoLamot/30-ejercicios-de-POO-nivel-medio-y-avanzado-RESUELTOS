import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private List<Libro> biblioteca;

    public Biblioteca(){
        biblioteca = new ArrayList<>();
    }

    public List<Libro> getBiblioteca() {
        return biblioteca;
    }
    public void setBiblioteca(List<Libro> biblioteca) {
        this.biblioteca = biblioteca;
    }
    public void add(Libro l){
        biblioteca.add(l);
    }
    public void cambiarEstadoLibro(String libro){
        biblioteca.stream()
        .filter(l -> l.getTitulo().equals(libro))
        .findFirst()
        .ifPresent(Libro::cambiarEstado);
    }
    public void listarLibros(){
        biblioteca.forEach(System.out::println);
    }
}
