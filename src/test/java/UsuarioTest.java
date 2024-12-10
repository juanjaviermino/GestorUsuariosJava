import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testUsuarioConstructor() {
        Usuario usuario = new Usuario("Juan", "juan@example.com");
        assertEquals("Juan", usuario.getNombre());
        assertEquals("juan@example.com", usuario.getCorreo());
    }

    @Test
    public void testSetNombre() {
        Usuario usuario = new Usuario("Juan", "juan@example.com");
        usuario.setNombre("Pedro");
        assertEquals("Pedro", usuario.getNombre());
    }

    @Test
    public void testSetCorreo() {
        Usuario usuario = new Usuario("Juan", "juan@example.com");
        usuario.setCorreo("nuevo@example.com");
        assertEquals("nuevo@example.com", usuario.getCorreo());
    }

    @Test
    public void testEqualsAndHashCode() {
        Usuario usuario1 = new Usuario("Juan", "juan@example.com");
        Usuario usuario2 = new Usuario("Juan", "juan@example.com");
        Usuario usuario3 = new Usuario("Pedro", "pedro@example.com");

        assertEquals(usuario1, usuario2); // Son iguales
        assertNotEquals(usuario1, usuario3); // Diferentes
        assertEquals(usuario1.hashCode(), usuario2.hashCode()); // Hash codes iguales
        assertNotEquals(usuario1.hashCode(), usuario3.hashCode()); // Hash codes diferentes
    }

    @Test
    public void testImprimirInformacion() {
        Usuario usuario = new Usuario("Juan", "juan@example.com");
        usuario.imprimirInformacion(); // Validar manualmente en consola (alternativamente, usa un mock para capturar la salida)
    }

    @Test
    public void testManejarContrasena() {
        Usuario usuario = new Usuario("Juan", "juan@example.com");
        usuario.manejarContrasena("miSecreta123"); // Probar con contraseñas válidas
    }
}
