import java.util.ArrayList;
import java.util.List;

/**
 * Manages tasks for a task manager application.
 */
public class GestorTareas {

  /**
   * List of tasks.
   */
  private final List<Tarea> tareas = new ArrayList<>();

  /**
   * Adds a task to the task manager.
   *
   * @param tarea1 the task to be added, must not be null.
   */
  public void agregarTarea(final Tarea tarea1) {
    if (tarea1 == null) {
      tareas.add(new Tarea());
    } else {
      tareas.add(tarea1);
    }
  }

  /**
   * Gets the total number of tasks.
   *
   * @return the total number of tasks.
   */
  public int obtenerTotalTareas() {
    return tareas.size();
  }

  /**
   * Removes a task by its index.
   *
   * @param codigo the index of the task to be removed.
   */
  public void eliminarTarea(final int codigo) {
    if (codigo < 0 || codigo >= tareas.size()) {
      System.out.println("Índice fuera de rango.");
      return;
    }
    tareas.remove(codigo);
  }

  /**
   * Demonstrates inefficient looping. This method should not be used.
   */
  public void bucleIneficiente() {
    for (int i = 0; i < tareas.size(); i++) {
      for (int j = 0; j < tareas.size(); j++) {
        System.out.println("Comparando tareas.");
      }
    }
  }
}
