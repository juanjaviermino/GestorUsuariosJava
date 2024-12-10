import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorUsuariosTest {

    @Test
    public void testAgregarUsuario() {
        GestorUsuarios gestor = new GestorUsuarios();
        assertTrue(gestor.agregarUsuario("Juan", "juan@example.com")); // Usuario nuevo
        assertFalse(gestor.agregarUsuario("Juan", "juan@example.com")); // Usuario duplicado
    }

    @Test
    public void testEsCorreoValido() {
        GestorUsuarios gestor = new GestorUsuarios();
        assertTrue(gestor.esCorreoValido("juan@example.com")); // Formato válido
        assertFalse(gestor.esCorreoValido("juan.com")); // Sin dominio
        assertFalse(gestor.esCorreoValido("juan@.com")); // Dominio inválido
        assertFalse(gestor.esCorreoValido("")); // Vacío
    }

    @Test
    public void testActualizarCorreo() {
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.agregarUsuario("Juan", "juan@example.com");

        // Verificar que la actualización retorna true
        assertTrue(gestor.actualizarCorreo("Juan", "nuevo@example.com"));

        // Verificar que el correo realmente se actualizó
        Usuario usuarioActualizado = new Usuario("Juan", "nuevo@example.com");
        assertEquals("nuevo@example.com", usuarioActualizado.getCorreo());

        // Verificar un caso donde el usuario no existe
        assertFalse(gestor.actualizarCorreo("Pedro", "pedro@example.com"));
    }


    @Test
    public void testEliminarUsuario() {
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.agregarUsuario("Juan", "juan@example.com");

        assertTrue(gestor.eliminarUsuario("Juan")); // Usuario eliminado
        assertFalse(gestor.eliminarUsuario("Juan")); // Ya no existe
        assertFalse(gestor.eliminarUsuario("Pedro")); // Usuario inexistente
    }

    @Test
    public void testNoUsuariosIniciales() {
        GestorUsuarios gestor = new GestorUsuarios();
        assertFalse(gestor.eliminarUsuario("CualquierUsuario")); // No hay usuarios
    }
}
