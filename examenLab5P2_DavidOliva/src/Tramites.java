
import java.util.Date;

/*
 */

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Tramites {

    private String nombre;
    private String descripción;
    private Date fechasolicitud;
    private String identidad;

    public Tramites() {
    }

    public Tramites(String nombre, String descripción, Date fechasolicitud, String identidad) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.fechasolicitud = fechasolicitud;
        this.identidad = identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Date getFechasolicitud() {
        return fechasolicitud;
    }

    public void setFechasolicitud(Date fechasolicitud) {
        this.fechasolicitud = fechasolicitud;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "Tramites{" + "nombre=" + nombre + ", descripcion=" + descripción + ", fechasolicitud=" + fechasolicitud + ", identidad=" + identidad + '}';
    }

}
