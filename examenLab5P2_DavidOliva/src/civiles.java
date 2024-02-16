
import java.util.ArrayList;
import java.util.Date;

/*
 */
/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class civiles extends Personas{

    private ArrayList<Tramites> tramites = new ArrayList();

    public civiles() {
    }

    public civiles(String nombre, String apellido, int contraseña, Date nacimiento, String sexo, String departamento,Tramites tramites) {
        super(nombre, apellido, contraseña, nacimiento, sexo, departamento);
        this.tramites.add(tramites);
    }

    public ArrayList<Tramites> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramites> tramites) {
        this.tramites = tramites;
    }

    @Override
    public String toString() {
        return "civiles{" + "tramites=" + tramites + '}';
    }

}
