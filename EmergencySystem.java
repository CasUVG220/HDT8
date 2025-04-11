// EmergencySystem.java
import java.util.HashMap;

public class EmergencySystem {
    private HashMap<String, String> enfermedades;
    private VectorHeap<Paciente> cola;

    public EmergencySystem() {
        enfermedades = new HashMap<>();
        cola = new VectorHeap<>();
    }

    public void registrarEnfermedad(String descripcion, String prioridad) {
        enfermedades.put(descripcion.toLowerCase(), prioridad.toUpperCase());
    }

    public boolean agregarPaciente(String nombre, String descripcion) {
        String prioridad = enfermedades.get(descripcion.toLowerCase());
        if (prioridad == null) return false;
        Paciente p = new Paciente(nombre, descripcion, prioridad.charAt(0));
        cola.add(p);
        return true;
    }

    public void mostrarPacientes() {
        if (cola.isEmpty()) {
            System.out.println("No hay pacientes.");
        } else {
            cola.printAll();
        }
    }

    public void atenderPaciente() {
        if (cola.isEmpty()) {
            System.out.println("No hay pacientes para atender.");
        } else {
            System.out.println("Atendiendo a: " + cola.remove());
        }
    }
}
