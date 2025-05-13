public class Circulo implements Figura {
    private Double radio;
    
    public Circulo(){}
    
    public Circulo(Double radio){
        this.radio = radio;
    }

    public Double calcularArea(){
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Circulo que posee un radio de "+radio+" y un area de "+calcularArea();
    }
    
}
