import java.math.BigDecimal;

public class CuentaBancaria {
    final private String cliente;
    private BigDecimal saldo = new BigDecimal("0");
    
    public CuentaBancaria(String cliente){
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
    public void depositar(BigDecimal d){
        this.saldo = saldo.add(d);
        System.out.println("Deposito exitoso");
    }
    public void retirarDinero(BigDecimal d){
        if(saldo.compareTo(d)>=0){
            this.saldo = saldo.subtract(d);
            System.out.println("Retiro exitoso");
        }
        else{
            System.out.println("Retiro rechazado, saldo insuficiente");
        }
    }
    public String toString()
    {
        return "Titular: "+cliente+", saldo: $"+saldo;
    }
}
