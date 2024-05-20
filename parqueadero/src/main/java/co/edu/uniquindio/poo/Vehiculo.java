package co.edu.uniquindio.poo;

public class Vehiculo {

    private String placa;
    private String modelo;
    private String propietario;

/**
* Constructor de la clase vehículo.
*/

    public Vehiculo(String placa, String modelo, String propietario){
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
    }

/**
* Métodos gets de los datos de la clase Vehículo.
* @return
*/

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPropietario(){
        return propietario;
    }
}

