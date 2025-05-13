public class Rectangulo implements Figura {
    private Double base;
    private Double altura;

    public Rectangulo(){}
    public Rectangulo(Double base, Double altura){
        this.base=base;
        this.altura=altura;
    }
    public Double calcularArea(){
        return base * altura;
    }
    @Override
    public String toString(){
        return "Rectangulo base: "+base+", altura: "+altura+", area: "+calcularArea();
    }
}
