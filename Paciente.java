public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String descripcion;
    private char prioridad;

    public Paciente(String nombre, String descripcion, char prioridad) {
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

    public char getPrioridad() {
        return prioridad;
    }

    // Ordena por prioridad (A es más urgente que B, etc.)
    @Override
    public int compareTo(Paciente otro) {
        return Character.compare(this.prioridad, otro.prioridad);
    }

    @Override
    public String toString() {
        return nombre + ", " + descripcion + ", prioridad " + prioridad;
    }
}
