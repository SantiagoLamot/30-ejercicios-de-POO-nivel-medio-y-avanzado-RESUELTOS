import java.math.BigDecimal;

/**
 * Ejercicio 3
 * Consigna: Implementar una clase CuentaBancaria con depósitos y retiros, y manejo de saldo.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        //Se crea la cuenta y se muestran los valores
        CuentaBancaria cuenta = new CuentaBancaria("Santiago Lamot");
        System.out.println(cuenta);
        
        //Se deposita y se muestra el estado
        cuenta.depositar(new BigDecimal("100.10"));
        System.out.println(cuenta);
        
        //Se retira dinero y se muestra el estado
        cuenta.retirarDinero(new BigDecimal("80"));
        System.out.println(cuenta);
        
        //se intenta retirar monto mayor al saldo y se muestra el saldo
        cuenta.retirarDinero(new BigDecimal("21"));
        System.out.println(cuenta);
        
        //se retira el total de lo que se posee y se meustra el saldo.
        cuenta.retirarDinero(new BigDecimal("20.10"));
        System.out.println(cuenta);
    }
}