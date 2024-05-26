package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Parqueadero {

    private Puesto[][] puestos;
    private Collection<Vehiculo> historial;
    private double tarifaCarro,tarifaMoto,tarifaMotoHibrida;
    private double dineroRecaudadoDiario, dineroRecaudadoMensual;

    /**
     * Constructor de la clase parqueadero
     * @param filas
     * @param columnas
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
        boolean parquear=false;
        if (fila >= 0 && fila < puestos.length && columna >= 0 && columna < puestos[0].length) {
            Puesto puesto = puestos[fila][columna];
            if (!puesto.estaOcupado()) {
                puesto.asignarVehiculo(vehiculo);
                historial.add(vehiculo);
                vehiculo.getPropietario().agregarVehiculo(vehiculo);
                parquear=true;
            }
            else{
                parquear=false;
            }
        }
        return parquear;
    }

    public void mostrarParqueadero(){

    }

    public void establecerTarifas(double tarifaCarro, double tarifaMoto, double tarifaMotoHibrida) {
        this.tarifaCarro = tarifaCarro;
        this.tarifaMoto = tarifaMoto;
        this.tarifaMotoHibrida=tarifaMotoHibrida;
    }

    public void generarReporteDiario() {
        dineroRecaudadoDiario = 0.0;
        for (Vehiculo vehiculo : historial) {
            dineroRecaudadoDiario += vehiculo.calcularTarifa();
        }
        System.out.println("Reporte Diario:");
        System.out.println("Total Recaudado: " + dineroRecaudadoDiario);
    }

    //get del tamaño del parqueadero
    public int[] getTamano() {
        return new int[]{puestos.length, puestos[0].length};
    }


    
}
