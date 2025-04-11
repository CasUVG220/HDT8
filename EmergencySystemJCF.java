// EmergencySystemJCF.java
import java.util.*;

public class EmergencySystemJCF {
    private Map<String, Character> enfermedades; // Map de enfermedad 
    private PriorityQueue<Paciente> colaPacientes; // Cola de prioridad

    public EmergencySystemJCF() {
        enfermedades = new HashMap<>();
        colaPacientes = new PriorityQueue<>();
    }

    // Registrar nueva enfermedad 
    public void registrarEnfermedad(String descripcion, char prioridad) {
        enfermedades.put(descripcion.toLowerCase(), prioridad);
    }

    // Ingresar paciente al sistema
    public void ingresarPaciente(String nombre, String descripcion) {
        Character prioridad = enfermedades.get(descripcion.toLowerCase());
        if (prioridad != null) {
            Paciente p = new Paciente(nombre, descripcion, prioridad);
            colaPacientes.offer(p);
        } else {
            System.out.println("⚠ Enfermedad no registrada.");
        }
    }

    // Atenderpaciente
    public void atenderPaciente() {
        if (!colaPacientes.isEmpty()) {
            Paciente siguiente = colaPacientes.poll();
            System.out.println("Atendiendo a: " + siguiente);
        } else {
            System.out.println("No hay pacientes en espera.");
        }
    }

    // Mostrar todos los pacientes en orden de atención
    public void mostrarPacientes() {
        if (colaPacientes.isEmpty()) {
            System.out.println("No hay pacientes en espera.");
            return;
        }

        System.out.println("Pacientes en orden de atención:");
        PriorityQueue<Paciente> copia = new PriorityQueue<>(colaPacientes);
        while (!copia.isEmpty()) {
            System.out.println(copia.poll());
        }
    }
}
