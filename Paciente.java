// Paciente.java
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String descripcion;
    private String prioridad;

    public Paciente(String nombre, String descripcion, String prioridad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente otro) {
        return this.prioridad.compareTo(otro.prioridad);
    }

    @Override
    public String toString() {
        return nombre + ", " + descripcion + ", prioridad " + prioridad;
    }
}
