// EmergencySystemJCFTest.java

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmergencySystemJCFTest {

    @Test
    public void testIngresoYAtencionPacientes() {
        EmergencySystemJCF sistemaJCF = new EmergencySystemJCF();

        sistemaJCF.registrarEnfermedad("parálisis", 'A');
        sistemaJCF.registrarEnfermedad("tos", 'D');

        sistemaJCF.ingresarPaciente("Pedro", "parálisis");
        sistemaJCF.ingresarPaciente("Marta", "tos");
        sistemaJCF.ingresarPaciente("Laura", "desconocido");  // no registrada

        // Simulación de atención, no se valida por consola sino que verificamos que no falle
        sistemaJCF.atenderPaciente(); // Pedro
        sistemaJCF.atenderPaciente(); // Marta
        sistemaJCF.atenderPaciente(); // Nadie más
    }
}
