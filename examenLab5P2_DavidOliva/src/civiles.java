
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTextField;

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

    public civiles(String nombre, String apellido, int contraseña, Date nacimiento, String sexo, String departamento) {
        super(nombre, apellido, contraseña, nacimiento, sexo, departamento);
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

    void setNombre(JTextField nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
