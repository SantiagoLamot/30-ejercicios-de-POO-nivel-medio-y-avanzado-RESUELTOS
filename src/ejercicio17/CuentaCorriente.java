import java.math.BigDecimal;

public class CuentaCorriente {
    private String nombre;
    private BigDecimal saldo = new BigDecimal("0");
    private BigDecimal limite = new BigDecimal("15000");

    public CuentaCorriente(String nombre){
        this.nombre = nombre;
    }

    public void deposito(BigDecimal sum){
        this.saldo = saldo.add(sum);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void retiro(BigDecimal sum){
        if(saldo.compareTo(sum) >= 0 && limite.compareTo(sum) >= 0){
            this.limite=limite.subtract(sum);
            this.saldo= saldo.subtract(sum);
            System.out.println("retiro exitoso");
        }
        else{
            System.out.println("Error al realizar retiro");
        }
    }
}
