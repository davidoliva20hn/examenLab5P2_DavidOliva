
import java.util.ArrayList;

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
