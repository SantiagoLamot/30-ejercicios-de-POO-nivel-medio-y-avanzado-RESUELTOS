import java.math.BigDecimal;
public class Programador extends Empleado {
    private String lenguajeFav;

    public Programador(){
        super();
    }
    public Programador(String nombre, BigDecimal salario, String lenguajeFav){
        salario = salario.add(new BigDecimal("500"));//bonus programador
        super(nombre, salario);
        this. lenguajeFav = lenguajeFav;
    }

    public void setLenguajeFav(String lenguajeFav) {
        this.lenguajeFav = lenguajeFav;
    }
    public String getLenguajeFav() {
        return lenguajeFav;
    }

    @Override
    public String toString() {
        return super.toString()+", leguaje favorito de programacion: "+ lenguajeFav;
    }
}
