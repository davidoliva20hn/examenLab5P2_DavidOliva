
import java.util.Date;
import java.util.Random;

/*
 */
/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Personas {

    private String nombre;
    private String apellido;
    private int contraseña;
    private Date nacimiento;
    private String sexo;
    private String departamento;
    private String identidad;

    public Personas() {
    }

    public Personas(String nombre, String apellido, int contraseña, Date nacimiento, String sexo, String departamento, String identidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.departamento = departamento;
        this.identidad = identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrasena=" + contraseña + ", nacimiento=" + nacimiento + ", sexo=" + sexo + ", departamento=" + departamento + ", identidad=" + identidad + '}';
    }

    public String Indentidad() {
        String Id = "";
        Random n = new Random();
        if (departamento.equals("Francisco Morazán")) {
            int m = n.nextInt(1, 28);
            if (m <= 9) {
                Id = "01" + "0" + m;
            } else {
                Id += 01 + m;
            }
        } else if (departamento.equals("Cortés")) {
            int m = n.nextInt(1, 12);
            if (m <= 9) {
                Id = "02" + "0" + m;
            } else {
                Id += 02 + m;
            }
        } else if (departamento.equals("Comayagua")) {
            int m = n.nextInt(1, 21);
            if (m <= 9) {
                Id = "03" + "0" + m;
            } else {
                Id += 03 + m;
            }
        }
        Id += "-" + nacimiento.getYear() + String.valueOf(n.nextInt(12345, 29999));
        return Id;
    }

}
