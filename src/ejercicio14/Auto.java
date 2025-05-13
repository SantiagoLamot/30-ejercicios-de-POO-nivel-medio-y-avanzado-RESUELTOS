public class Auto extends Vehiculo{
    public String patente;
    
    public Auto(){
        super();
    }
    public Auto(String marca, String color, String anioFab, String patente)
    {
        super(marca, color, anioFab);
        this.patente = patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    public String getPatente() {
        return patente;
    }
    @Override
    public String toString() {
        return "Automovil patente: " +patente+ super.toString();
    }
}
