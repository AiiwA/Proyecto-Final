package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public  class ParqueaderoTest{

    @Test
    public void CrearParqueadero(){
        int filas=5;
        int columnas=5;
        Parqueadero parqueadero= new Parqueadero(filas,columnas);
        int[] tamanio = parqueadero.getTamanio();

        assertEquals(filas, tamanio[0]);
        assertEquals(columnas, tamanio[1]);
        

    }

}


