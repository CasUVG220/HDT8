// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmergencySystem sistema = new EmergencySystem();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Registrar enfermedad");
            System.out.println("2. Ingresar paciente");
            System.out.println("3. Ver pacientes en orden que se ingreso");
            System.out.println("4. Atender paciente con prioridad");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Enfermedad: ");
                    String enfermedad = sc.nextLine();
                    System.out.print("Prioridad (A-E): ");
                    String prioridad = sc.nextLine();
                    sistema.registrarEnfermedad(enfermedad, prioridad);
                    System.out.println("Enfermedad registrada.");
                    break;
                case "2":
                    System.out.print("Nombre del paciente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Enfermedad: ");
                    String enf = sc.nextLine();
                    if (sistema.agregarPaciente(nombre, enf)) {
                        System.out.println("Paciente ingresado.");
                    } else {
                        System.out.println("Enfermedad no registrada.");
                    }
                    break;
                case "3":
                    System.out.println("\nPacientes en orden de atención:");
                    sistema.mostrarPacientes();
                    break;
                case "4":
                    sistema.atenderPaciente();
                    break;
                case "5":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}
