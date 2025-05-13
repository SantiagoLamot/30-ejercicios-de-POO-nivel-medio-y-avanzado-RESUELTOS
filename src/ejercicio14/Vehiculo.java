public abstract class Vehiculo {
    private String marca;
    private String color;
    private String añoFabricacion;

    public Vehiculo(){

    }

    public Vehiculo(String marca, String color, String añofab){
        this.marca = marca;
        this.color = color;
        this.añoFabricacion = añofab;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    public String getAñoFabricacion() {
        return añoFabricacion;
    }
    @Override
    public String toString() {
        return " marca: "+ marca +", color: "+color+ ", año: "+añoFabricacion;
    }
}
