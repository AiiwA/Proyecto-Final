package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private String placa;
    private int modelo;
    private String propietario;

/**
* Constructor de la clase vehículo.
*/

    public Vehiculo(String placa, int modelo, String propietario){
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
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

    public void setPropietario(String propietario){
        this.propietario=propietario;
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

    public String getPropietario(){
        return propietario;
    }

}

