/**
 * Represents a task in the task manager.
 */
public class Tarea {

    /**
     * The title of the task.
     */
    private String titulo;

    /**
     * Sets the title of the task.
     *
     * @param titulo the title to set, must not be null.
     */
    public void setTitulo(final String titulo) {
        if (titulo == null) {
            throw new NullPointerException("El título no puede ser nulo");
        }
        this.titulo = titulo;
    }

    /**
     * Gets the title of the task.
     *
     * @return the task title.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * A placeholder method that does nothing relevant.
     */
    public void metodoInutil() {
        System.out.println("Este método no hace nada relevante.");
    }
}
