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
    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
