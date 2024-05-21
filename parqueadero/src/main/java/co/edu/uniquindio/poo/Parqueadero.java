package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Parqueadero {

    private Puesto[][] puestos;
    private List<Registro> historial;
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

    //public void procesosInternos(Moto moto, Vehiculo vehiculo){}


    
}
