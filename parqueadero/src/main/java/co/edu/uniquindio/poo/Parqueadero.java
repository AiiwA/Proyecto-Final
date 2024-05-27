package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

public class Parqueadero {

    private Puesto[][] puestos;
    private Collection<Registro> historial;
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
        boolean resultado = false;

        for (Registro registro : historial) {
            if (registro.getVehiculo().getPlaca().equals(vehiculo.getPlaca()) && registro.getHoraSalida() == null) {
                System.out.println("Ya existe un vehículo con la misma placa parqueado.");
                return false;
            }
        }

        if (fila >= 0 && fila < puestos.length && columna >= 0 && columna < puestos[0].length) {
            Puesto puesto = puestos[fila-1][columna-1];
            if (!puesto.estaOcupado()) {
                puesto.asignarVehiculo(vehiculo);
                vehiculo.setHoraIngreso(LocalDateTime.now());
                historial.add(new Registro(vehiculo, LocalDateTime.now(), fila, columna));
                resultado = true;
            }
        }
    
        return resultado;
    }

    public Vehiculo retirarVehiculo(int fila, int columna) {
        Vehiculo vehiculo = null;
    
        if (fila >= 0 && fila < puestos.length && columna >= 0 && columna < puestos[0].length) {
            Puesto puesto = puestos[fila][columna];
            if (puesto.estaOcupado()) {
                vehiculo = puesto.getVehiculo();
                LocalDateTime horaSalida = LocalDateTime.now();
                double tarifa = vehiculo.getTarifa(tarifaCarro, tarifaMoto, tarifaMotoHibrida);
                double costo = vehiculo.calcularTarifa(horaSalida);
                dineroRecaudadoDiario += costo;
                dineroRecaudadoMensual += costo;
                puesto.retirarVehiculo();
            }
        }
    
        for (Registro registro : historial) {
            if (registro.getVehiculo().equals(vehiculo) && registro.getHoraSalida() == null) {
                LocalDateTime horaSalida = LocalDateTime.now();
                registro.setHoraSalida(horaSalida);
                double costo = vehiculo.calcularTarifa(horaSalida);
                registro.setCosto(costo);
                break;
            }
        }
    
        return vehiculo;
    }
    

    public void mostrarParqueadero(){
        for (int i = 0; i < puestos.length; i++) {
            for (int j = 0; j < puestos[i].length; j++) {
                System.out.print(puestos[i][j].estaOcupado() ? "O " : "L ");
            }
            System.out.println();
        }
    }

    public void establecerTarifas(double tarifaCarro, double tarifaMoto, double tarifaMotoHibrida) {
        this.tarifaCarro = tarifaCarro;
        this.tarifaMoto = tarifaMoto;
        this.tarifaMotoHibrida=tarifaMotoHibrida;
    }

    public void generarReporteDiario() {
        System.out.println("Reporte Diario:");
        System.out.println("Total Recaudado: " + dineroRecaudadoDiario);
        dineroRecaudadoDiario = 0.0;
    }
    
    public void generarReporteMensual() {
        System.out.println("Reporte Mensual:");
        System.out.println("Total Recaudado: " + dineroRecaudadoMensual);
        dineroRecaudadoMensual = 0.0;
    }

    //get del tamaño del parqueadero
    public int[] getTamano() {
        return new int[]{puestos.length, puestos[0].length};
    }

    public Puesto[][] getPuestos() {
        return puestos;
    }


    
}