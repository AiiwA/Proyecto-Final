package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class PuestoTest {
    private static final Logger LOG = Logger.getLogger(PuestoTest.class.getName());

    /**
     * Prueba para verificar que las filas y columnas no sean negativas.
     */
    @Test
    public void puestosNegativos(){
        LOG.info("Inicio de la prueba.");
        assertThrows(Throwable.class, ()-> new Puesto(-12, -34));
        LOG.info("Fin de la prueba");
    }
}
