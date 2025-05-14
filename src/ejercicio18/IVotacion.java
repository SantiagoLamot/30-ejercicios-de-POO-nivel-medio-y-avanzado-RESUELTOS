import java.util.List;

public interface IVotacion {
    public abstract List<Candidato> obtenerResultado();
    public abstract int obtenerTotalVotantes();
    public abstract void cargarVoto(Candidato candidato);
}
