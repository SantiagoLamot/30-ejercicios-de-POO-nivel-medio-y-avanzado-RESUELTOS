public class Libro {
    private String titulo;
    private boolean disponible = true;

    public Libro(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void cambiarEstado(){
        this.disponible =!disponible;
    }

    @Override
    public String toString(){
        return titulo+", estado: "+ (disponible?"disponible":"no disponible");
    }
}
