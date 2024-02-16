
import java.util.Date;

/*
 */
/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Empleados extends Personas {

    private String carrera;
    private String puesto;
    private String añostrabajando;

    public Empleados() {
    }

    public Empleados(String carrera, String puesto, String añostrabajando) {
        this.carrera = carrera;
        this.puesto = puesto;
        this.añostrabajando = añostrabajando;
    }

    public Empleados(String carrera, String puesto, String añostrabajando, String nombre, 
            String apellido, int contraseña, Date nacimiento, String sexo, String departamento, String identidad) {
        super(nombre, apellido, contraseña, nacimiento, sexo, departamento, identidad);
        this.carrera = carrera;
        this.puesto = puesto;
        this.añostrabajando = añostrabajando;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getAñostrabajando() {
        return añostrabajando;
    }

    public void setAñostrabajando(String añostrabajando) {
        this.añostrabajando = añostrabajando;
    }

    @Override
    public String toString() {
        return "Empleados{" + "carrera=" + carrera + ", puesto=" + puesto + ", anostrabajando=" + añostrabajando + '}';
    }

}
