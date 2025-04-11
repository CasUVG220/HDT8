// EmergencySystemTest.java

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmergencySystemTest {

    @Test
    public void testRegistroYAtencionDePaciente() {
        EmergencySystem sistema = new EmergencySystem();

        sistema.registrarEnfermedad("infarto", "A");
        sistema.registrarEnfermedad("fractura", "C");

        assertTrue(sistema.agregarPaciente("Carlos", "infarto"));
        assertTrue(sistema.agregarPaciente("Ana", "fractura"));
        assertFalse(sistema.agregarPaciente("Luis", "dolor de cabeza")); // No registrada

        // Atendemos al paciente más urgente (infarto)
        sistema.atenderPaciente();  // debería ser Carlos

        // Atendemos siguiente (fractura)
        sistema.atenderPaciente();  // debería ser Ana
    }
}
