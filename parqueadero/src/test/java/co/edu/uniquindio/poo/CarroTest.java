package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;


public class CarroTest {
    private static final Logger LOG = Logger.getLogger(CarroTest.class.getName());
//
    /**
     * Prueba para verificar que el modelo no sea negativo.
     */
    @Test
    public void modeloNegativo(){
        LOG.info("Inicio de la prueba");
        Propietario propietario = new Propietario("Alejandro", "Muñoz", "76283");
        assertThrows(Throwable.class, ()-> new Carro("hdh937", -2009, propietario));
        LOG.info("Fin de la prueba");
    }
}