package ec.edu.ups.poo.clases;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona {
    // Atributos

    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaNacimiento;

    // Constructores

    public Familiar() {

    }

    public Familiar(String nombre, String apellido, String cedula, String direccion, String parentesco, String tipoDeSangre, GregorianCalendar fechaNacimiento) {
        super(nombre, apellido, cedula, direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter & Setters

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Metodo para calcular la edad de las personas

    public int calcularEdad() {
        Calendar hoy = Calendar.getInstance();
        int anioActual = hoy.get(Calendar.YEAR);
        int anioNacimiento = fechaNacimiento.get(Calendar.YEAR);
        return (anioActual - anioNacimiento);


    }
    // Metodo toString
    @Override
    public String toString() {
        return super.toString() + "\nParentesco: " + parentesco + "\nTipo de sangre: " + tipoDeSangre + "\nFecha de nacimiento: " + fechaNacimiento;
    }
}
