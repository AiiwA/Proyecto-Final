package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PuestoTest {

    /**
     * Prueba para no aceptar puestos negativos
     */
    @Test
    public void puestosNegativos(){
        assertThrows(Throwable.class,()->new Puesto(-1, -1));
    }
    
}
