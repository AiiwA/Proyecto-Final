package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.beans.Transient;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class MotoTest {
    private static final Logger LOG = Logger.getLogger(MotoTest.class.getName());


    /**
     * Prueba para verificar que la velocidad no sea negativa.
     */
    @Test
    public void velNegativa(){
        LOG.info("Inicio de la prueba");
        assertThrows(Throwable.class, ()-> new Moto("dho204", 2015, "Juan", -12));
        LOG.info("Fin de la prueba.");
    }

    /**
     * Prueba para verificar que la moto tenga propietario.
     */
    @Test
    public void sinPropietario(){
        LOG.info("Inicio de la prueba sinPropietario.");
        assertThrows(Throwable.class, ()-> new Moto("asu244", 2020, null, 94));
        LOG.info("Fin de la prueba");
    }
}
