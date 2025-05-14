import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Votacion implements IVotacion{
    private List<Candidato> candidatos;
    
    public Votacion(){
        candidatos = new ArrayList<>();
    }

    public void add(Candidato c){
        this.candidatos.add(c);
    }
    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    @Override
    public List<Candidato> obtenerResultado() {
        return candidatos.stream()
            .sorted(Comparator.comparing(Candidato::getVotos).reversed())
            .toList();
    }

    @Override
    public int obtenerTotalVotantes() {
        return candidatos.stream()
        .mapToInt(Candidato::getVotos)
        .sum();
    }

    @Override
    public void cargarVoto(Candidato candidato) {
        candidatos.forEach(c -> {
            if(c.getNombre() == candidato.getNombre())
            {
                c.sumarVoto();
            }
        } );
    }

}
