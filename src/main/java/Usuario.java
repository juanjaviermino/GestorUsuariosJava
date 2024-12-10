import java.util.Objects;

/**
 * Representa un usuario con nombre y correo electrónico.
 */
public class Usuario {

    private String nombre;
    private String correo;
    private static String ultimoUsuario;

    /**
     * Constructor para inicializar el usuario con nombre y correo.
     *
     * @param nombre el nombre del usuario
     * @param correo el correo del usuario
     */
    public Usuario(final String nombre, final String correo) {
        this.nombre = nombre;
        this.correo = correo;
        synchronized (Usuario.class) {
            ultimoUsuario = nombre; // Sincronización para evitar condiciones de carrera.
        }
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return el nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre el nuevo nombre del usuario
     */
    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el correo del usuario.
     *
     * @return el correo del usuario
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo del usuario.
     *
     * @param correo el nuevo correo del usuario
     */
    public void setCorreo(final String correo) {
        this.correo = correo;
    }

    /**
     * Compara si dos usuarios son iguales basados en el nombre y correo.
     *
     * @param obj el objeto a comparar
     * @return true si son iguales, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Usuario)) {
            return false;
        }
        Usuario otro = (Usuario) obj;
        return Objects.equals(nombre, otro.nombre) && Objects.equals(correo, otro.correo);
    }

    /**
     * Genera un código hash basado en el nombre y correo.
     *
     * @return el código hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, correo); // Incluye todos los campos relevantes.
    }

    /**
     * Imprime información del usuario.
     */
    public void imprimirInformacion() {
        if (nombre != null) {
            System.out.println("Nombre: " + nombre.toUpperCase());
        } else {
            System.out.println("Nombre no disponible.");
        }
        if (correo != null) {
            System.out.println("Correo: " + correo.toLowerCase());
        } else {
            System.out.println("Correo no disponible.");
        }
    }

    /**
     * Maneja contraseñas de forma más segura.
     *
     * @param contrasena la contraseña a manejar
     */
    public void manejarContrasena(String contrasena) {
        char[] array = contrasena.toCharArray();
        try {
            System.out.println("Contraseña recibida: [NO SE MUESTRA POR SEGURIDAD]"); // Evita mostrar la contraseña.
        } finally {
            // Limpia el contenido del arreglo para mayor seguridad.
            for (int i = 0; i < array.length; i++) {
                array[i] = '\0';
            }
        }
    }
}
