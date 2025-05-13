public class Moto extends Vehiculo{
    
    private int cilindrada;

    public Moto(){
        super();
    }
    public Moto(String marca, String color, String anioFab, int cilindrada){
        super(marca, color, anioFab);
        this.cilindrada = cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return "Moto cilindrada: "+cilindrada+super.toString();
    }
    
}
