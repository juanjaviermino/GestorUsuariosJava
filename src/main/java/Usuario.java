/**
 * Representa un usuario con nombre y correo electrónico.
 */
public class Usuario {

    private String nombre;
    private String correo;

    /**
     * Constructor para inicializar el usuario con nombre y correo.
     *
     * @param nombre el nombre del usuario
     * @param correo el correo del usuario
     */
    public Usuario(final String nombre, final String correo) {
        this.nombre = nombre;
        this.correo = correo;
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
     * Método placeholder sin funcionalidad real.
     */
    public void metodoSinComentario() {
        System.out.println("Este método no tiene comentario.");
    }
}
