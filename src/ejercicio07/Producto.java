import java.math.BigDecimal;

public class Producto {
    private int codigo;
    private String nombre;
    private BigDecimal precio;
    private int stock;

    public Producto() {
    }

    public Producto(int c, String n, BigDecimal p, int s) {
        codigo = c;
        nombre = n;
        precio = p;
        stock = s;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    @Override
    public String toString() {
        return "  "+codigo+"\t"+nombre + "\t\t"+ precio+"\t\t" + + stock;
    }

}
