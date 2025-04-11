// MainJCF.java
import java.util.Scanner;

public class MainJCF {
    public static void main(String[] args) {
        EmergencySystemJCF sistema = new EmergencySystemJCF();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Registrar enfermedad");
            System.out.println("2. Ingresar paciente");
            System.out.println("3. Ver pacientes en orden de atención");
            System.out.println("4. Atender siguiente paciente");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Nombre de la enfermedad: ");
                    String enfermedad = sc.nextLine();
                    System.out.print("Prioridad (A-E): ");
                    char prioridad = sc.nextLine().toUpperCase().charAt(0);
                    sistema.registrarEnfermedad(enfermedad, prioridad);
                    break;
                case "2":
                    System.out.print("Nombre del paciente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Enfermedad: ");
                    String desc = sc.nextLine();
                    sistema.ingresarPaciente(nombre, desc);
                    break;
                case "3":
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
        System.out.println("Sistema cerrado.");
    }
}
