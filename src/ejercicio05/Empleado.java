import java.math.BigDecimal;

public class Empleado {
    private String nombre;
    private BigDecimal salario;
    
    public Empleado(){}
    public Empleado(String nombre, BigDecimal salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public BigDecimal getSalario() {
        return salario;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+", salario: $"+salario;
    }
}
