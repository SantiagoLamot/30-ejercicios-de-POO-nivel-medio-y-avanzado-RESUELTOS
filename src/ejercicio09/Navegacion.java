import java.text.SimpleDateFormat;
import java.util.Date;

public class Navegacion {
    private String sitio;
    private Date fecha;

    public Navegacion(){}

    public Navegacion(String sitio)
    {
        this.sitio = sitio;
        this.fecha = new Date();
    }


    public void setSitio(String sitio) {
        this.sitio = sitio;
    }
    public String getFecha() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm 'hs'");
        return formato.format(fecha);

    }
    public String getSitio() {
        return sitio;
    }

    @Override
    public String toString() {
        return sitio+"\nfecha: "+getFecha();
    }
}
