import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contacto> contactos = new ArrayList<>();
    
    public Agenda(){}

    public void add(Contacto a){
        contactos.add(a);
    }

    public void buscarPorNombre(String nombre){
        List<Contacto> resultado = new ArrayList<>();
        for(Contacto c : contactos){
            if(c.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                resultado.add(c);
            }
        }
        mostrarListaContactos(resultado);
    }

    public void mostrarListaContactos(List<Contacto> r){
        for(Contacto c : r){
            System.out.println(c);
        }
    }

}
