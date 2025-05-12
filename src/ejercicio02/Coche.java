public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;
    public Coche(){}
    public Coche(String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setVelocidad(int vel){
        this.velocidad = vel;
    }
    @Override
    public String toString()
    {
        return "Coche marca: "+marca+" modelo: "+modelo+" velocidad: "+ velocidad;
    }
    public void acelerar(){
        //se incrementa la velocidad en 10.
        velocidad +=10;
        System.out.println("¡El vehiculo acelero!");
    }
    public void frenar(){
        //Se usa un condicionante para no tener una velocidad negativa, lo cual no corresponde, en caso de poder se disminuye en 10.
        if(velocidad-10 <=0){
            velocidad = 0;
            System.out.println("¡El vehiculo esta parado!");
        }
        else{
            velocidad -=10;
            System.out.println("¡El vehiculo disminuyo la velocidad!");
        }
    }
}
