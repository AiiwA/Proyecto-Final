package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Parqueadero {

    private Puesto[][] puestos;
    private Collection<Registro> historial;
    private double tarifaCarro;
    private double tarifaMoto;

    /**
     * Constructor de clase parqueadero
     * @param n
     */
    public Parqueadero(int filas, int columnas){
        puestos=new Puesto[filas][columnas];
        historial=new ArrayList<>();
        tarifaCarro=0.0;
        tarifaMoto=0.0;
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                puestos[i][j]= new Puesto(i,j);
            }

        }

    }

    public boolean parquearVehiculo(Vehiculo vehiculo, int fila, int columna) {
        boolean parquear;
        if (fila >= 0 && fila < puestos.length && columna >= 0 && columna < puestos[0].length) {
            Puesto puesto = puestos[fila][columna];
            if (!puesto.estaOcupado()) {
                puesto.asignarVehiculo(vehiculo);
                historial.add(vehiculo);
                parquear=true;
            }
            parquear=false;
        }
        return parquear;
    }

    //get del tamaño del parqueadero
    public int[] getTamano() {
        return new int[]{puestos.length, puestos[0].length};
    }


    
}
