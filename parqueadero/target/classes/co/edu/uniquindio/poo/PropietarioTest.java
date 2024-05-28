package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class PropietarioTest {
    private static final Logger LOG = Logger.getLogger(PropietarioTest.class.getName());
//
    /**
     * Prueba para verificar que los datos no esten vacios ni nulos.
     */
    @Test
    public void datosNulos(){
        LOG.info("Inicio de la prueba datosNulos");
        assertThrows(Throwable.class, ()-> new Propietario(null, null, null));
        LOG.info("Fin de la prueba");
    }
}
