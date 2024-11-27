import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test class for GestorTareas.
 */
public class GestorTareasTest {

    /**
     * Test the agregarTarea method.
     */
    @Test
    public void testAgregarTarea() {
        GestorTareas gestor = new GestorTareas();

        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();

        tarea1.setTitulo("Tarea uno 1");
        tarea2.setTitulo("Tarea uno 2");

        gestor.agregarTarea(tarea1);
        gestor.agregarTarea(tarea2);

        assertEquals(2, gestor.obtenerTotalTareas(), "Deberia tener 2 tarea");
    }

    /**
     * Test the Tarea title.
     */
    @Test
    public void testTituloTarea() {
        Tarea tarea = new Tarea();

        tarea.setTitulo("Titulo de la tarea");

        assertEquals("Titulo de la tarea", tarea.getTitulo(),
            "El titulo de la tarea debe ser Titulo de la tarea");
    }
}
