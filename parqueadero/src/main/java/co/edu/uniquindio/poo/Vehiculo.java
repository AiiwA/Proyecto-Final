package co.edu.uniquindio.poo;
import java.util.Scanner;

public  abstract class Vehiculo {

    private String placa;
    private int modelo;
    public Propietario propietario;
    Scanner scanner = new Scanner(System.in);

    /**
    * Constructor de la clase vehículo.
    */

    public Vehiculo(String placa, int modelo, Propietario propietario){
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
    }

        /**
         * Metodo para elegir moto o carro como vehiculo a añadir
        */
    public void crearVehiculo(){
        boolean aux = false;
        while (!aux) {
            System.out.println("Que tipo de vehiculo desea? 1.Moto.         2.Carro.");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    Moto.crearMoto();
                    Moto.determinarTipo();
                    aux = true;
                    break;
                
                case 2:
                    Carro.crearCarro();
                    aux = true;
                    break;
            
                default:
                    System.out.println("Error. Elija una opción válida.");
                    break;
            }
        }
            Moto.crearMoto();
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

}

