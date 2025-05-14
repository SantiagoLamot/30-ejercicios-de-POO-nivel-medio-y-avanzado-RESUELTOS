public class Candidato implements ICandidato {

    private String nombre;
    private int votos=0;
    
    public Candidato(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVotos() {
        return votos;
    }
    public void sumarVoto()
    {
        this.votos++;
    }

    @Override
    public String toString() {
        return "Candidato: "+nombre + ", votos:"+votos;
    }
}
