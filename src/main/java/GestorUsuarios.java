import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * Gestiona las operaciones de usuarios, como agregar, actualizar y eliminar.
 */
public class GestorUsuarios {

    private final HashMap<String, Usuario> usuarios;

    /**
     * Constructor para inicializar el gestor de usuarios.
     */
    public GestorUsuarios() {
        usuarios = new HashMap<>();
    }

    /**
     * Agrega un usuario con nombre y correo electrónico.
     *
     * @param nombre el nombre del usuario
     * @param correo el correo del usuario
     * @return true si el usuario fue agregado, false si ya existe
     */
    public boolean agregarUsuario(final String nombre, final String correo) {
        if (usuarios.containsKey(nombre)) {
            return false;
        }
        usuarios.put(nombre, new Usuario(nombre, correo));
        return true;
    }

    /**
     * Verifica si un correo electrónico tiene un formato válido.
     *
     * @param correo el correo a verificar
     * @return true si el correo es válido, false de lo contrario
     */
    public boolean esCorreoValido(final String correo) {
        String regex = "^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, correo);
    }

    /**
     * Actualiza el correo electrónico de un usuario existente.
     *
     * @param nombre      el nombre del usuario
     * @param nuevoCorreo el nuevo correo del usuario
     * @return true si el correo fue actualizado, false si el usuario no existe
     */
    public boolean actualizarCorreo(final String nombre, final String nuevoCorreo) {
        Usuario usuario = usuarios.get(nombre);
        if (usuario != null) {
            usuario.setCorreo(nuevoCorreo);
            return true;
        }
        return false;
    }

    /**
     * Elimina un usuario del sistema.
     *
     * @param nombre el nombre del usuario a eliminar
     * @return true si el usuario fue eliminado, false si no existe
     */
    public boolean eliminarUsuario(final String nombre) {
        return usuarios.remove(nombre) != null;
    }
}
