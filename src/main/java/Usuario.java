/**
 * Representa un usuario con nombre y correo electrónico.
 */
public class Usuario {

    private String Nombre; 
    private String CORREO; 

    /**
     * Constructor para inicializar el usuario con nombre y correo. 
     *
     * @param nombre el nombre del usuario
     * @param correo el correo del usuario
     */
    public Usuario(String Nombre, String CORREO) { 
        this.Nombre=Nombre; 
        this.CORREO=CORREO; 
    }

    public String getNombre() {return Nombre;} 

    public void setNombre( String nombre ) { 
        this.Nombre=nombre; 
    }

    public String getCorreo() {
        return this.CORREO; } 

    public void setCorreo(String correo){
        this.CORREO=correo; } 

    public void metodoSinComentario() { 
        System.out.println("Este método no tiene comentario"); 
    }
}


