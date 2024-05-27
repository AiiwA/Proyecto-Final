package co.edu.uniquindio.poo;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public  abstract class Vehiculo {

    private String placa;
    private int modelo;
    public Propietario propietario;
    private LocalDateTime horaIngreso;
    Scanner scanner = new Scanner(System.in);

    /**
     * Constructor de la clase Vehiculo
     * @param placa
     * @param modelo
     * @param propietario
     */
    public Vehiculo(String placa, int modelo, Propietario propietario){
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public abstract void crearVehiculo();
    public abstract double calcularTarifa(LocalDateTime horaSalida, double tarifa);

    public double calcularTarifa(LocalDateTime horaSalida) {
        Duration duracion = Duration.between(getHoraIngreso(), horaSalida);
        long horas = duracion.toHours();
        return horas * getTarifa(0, 0, 0);
    }

    /**
    * metodos set  de los datos de la clase vehiculo
    * @return
    */

    public void setPlaca(String placa){
        this.placa=placa;
    }    

    public void setModelo(int modelo){
        this.modelo=modelo;
    }

    /**
    * Métodos gets de los datos de la clase Vehículo.
    * @return
    */

    public String getPlaca(){
        return placa;
    }

    public int getModelo(){
        return modelo;
    }

    public Propietario getPropietario(){
        return propietario;
    }

    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalDateTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public abstract double getTarifa(double tarifaCarro, double tarifaMoto, double tarifaMotoHibrida);

}