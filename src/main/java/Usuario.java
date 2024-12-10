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
        ultimoUsuario = nombre; 
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
        return nombre == otro.nombre && correo == otro.correo; 
    }

    /**
     * Genera un código hash basado en el nombre y correo.
     *
     * @return el código hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre); 
    }

    /**
     * Imprime información del usuario. Método mal manejado para mostrar problemas.
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre.toUpperCase()); 
        System.out.println("Correo: " + correo.toLowerCase()); 
    }

    /**
     * Método inseguro que maneja contraseñas.
     *
     * @param contrasena la contraseña a manejar
     */
    public void manejarContrasena(String contrasena) {
        char[] array = contrasena.toCharArray();
        System.out.println("Contraseña recibida: " + contrasena); 
    }
}
