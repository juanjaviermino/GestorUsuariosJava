import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorUsuariosTest {

    @Test
    public void testAgregarUsuario() {
        GestorUsuarios gestor = new GestorUsuarios();
        assertTrue(gestor.agregarUsuario("Juan", "juan@example.com"));
        assertFalse(gestor.agregarUsuario("Juan", "juan@example.com")); // Ya existe
    }

    @Test
    public void testEsCorreoValido() {
        GestorUsuarios gestor = new GestorUsuarios();
        assertTrue(gestor.esCorreoValido("juan@example.com"));
        assertFalse(gestor.esCorreoValido("juan.com"));
        assertFalse(gestor.esCorreoValido("juan@.com"));
    }

    @Test
    public void testActualizarCorreo() {
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.agregarUsuario("Juan", "juan@example.com");
        assertTrue(gestor.actualizarCorreo("Juan", "nuevo@example.com"));
        assertFalse(gestor.actualizarCorreo("Pedro", "pedro@example.com")); // No existe
    }

    @Test
    public void testEliminarUsuario() {
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.agregarUsuario("Juan", "juan@example.com");
        assertTrue(gestor.eliminarUsuario("Juan"));
        assertFalse(gestor.eliminarUsuario("Pedro")); // No existe
    }
}
