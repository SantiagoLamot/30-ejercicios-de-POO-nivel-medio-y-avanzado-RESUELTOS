/**
 * Ejercicio 18
 * Consigna: Crear un sistema de votación entre candidatos con conteo de votos.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Votacion v = new Votacion();
        Candidato c1 = new Candidato("Santiago");
        Candidato c2 = new Candidato("Facundo");
        v.add(c1);
        v.add(c2);

        v.cargarVoto(c1);
        v.cargarVoto(c1);
        v.cargarVoto(c1);
        v.cargarVoto(c2);

        v.getCandidatos().forEach(System.out::println);

        System.out.println("Votantes: "+v.obtenerTotalVotantes());
    }
}