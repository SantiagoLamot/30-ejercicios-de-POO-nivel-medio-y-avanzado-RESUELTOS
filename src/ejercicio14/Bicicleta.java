public class Bicicleta extends Vehiculo{
    private int rodado;

    public Bicicleta(){
        super();
    }
    public Bicicleta(String marca, String color, String anioFab, int rodado){
        super(marca, color, anioFab);
        this.rodado = rodado;
    }

    public void setRodado(int rodado) {
        this.rodado = rodado;
    }
    public int getRodado() {
        return rodado;
    }
    @Override
    public String toString() {
        return "Bicicleta rodado: "+rodado+super.toString();
    }
}
