import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Paciente> colaPacientes = new PriorityQueue<>();

        // Agregar pacientes
        colaPacientes.add(new Paciente("Luis", "fractura de pierna", 'C'));
        colaPacientes.add(new Paciente("Ana", "dolor de cabeza", 'E'));
        colaPacientes.add(new Paciente("Carlos", "parada respiratoria", 'A'));
        colaPacientes.add(new Paciente("Marta", "dolor de estómago", 'D'));
        colaPacientes.add(new Paciente("Pedro", "herida sangrante", 'B'));

        // Atender pacientes en orden de prioridad
        System.out.println("Pacientes en orden de atención:");
        while (!colaPacientes.isEmpty()) {
            System.out.println(colaPacientes.poll());
        }
    }
}
