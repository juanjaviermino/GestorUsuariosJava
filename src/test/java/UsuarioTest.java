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
}
