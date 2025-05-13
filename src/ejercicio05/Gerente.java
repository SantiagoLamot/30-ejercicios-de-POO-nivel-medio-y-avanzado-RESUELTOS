import java.math.BigDecimal;

public class Gerente extends Empleado {
    private String area;
    public Gerente(){
        super();
    }
    public Gerente(String nombre, BigDecimal salario, String area){
        salario = salario.add(new BigDecimal("1000"));//bonus por gerente!
        super(nombre, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString()+", gerente de area: "+area;
    }
}
