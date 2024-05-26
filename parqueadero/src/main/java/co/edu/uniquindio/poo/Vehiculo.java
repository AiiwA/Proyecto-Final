package co.edu.uniquindio.poo;
import java.util.Scanner;

public  abstract class Vehiculo {

    private String placa;
    private int modelo;
    public Propietario propietario;
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
    public abstract double calcularTarifa();

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

}

