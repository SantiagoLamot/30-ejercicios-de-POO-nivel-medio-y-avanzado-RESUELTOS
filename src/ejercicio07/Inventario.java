import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<Producto> productos = new ArrayList<>();
    
    public void add(Producto p){
        productos.add(p);
    }
    public void mostrarProductos(){
        System.out.println("=================== PRODUCTOS ===================");
        System.out.println("codigo\tnombre\t\tprecio\t\tstock");
        for(Producto p : productos){
            System.out.println(p);
        }
    }
}
