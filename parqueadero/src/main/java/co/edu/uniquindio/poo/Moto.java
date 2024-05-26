package co.edu.uniquindio.poo;
import java.util.Scanner;

public class Moto extends Vehiculo {

    static Scanner scanner = new Scanner(System.in);

    private static int velMax;

    /**
     * Constructor de la clase moto
     * @param placa
     * @param modelo
     * @param propietario
     * @param velMax
     */
    public Moto(String placa, int modelo, Propietario propietario, int velMax){
        super(placa, modelo, propietario);
        Moto.velMax = velMax;
    }

    /**
     * Metodo para crear una moto.
     */
    public void crearVehiculo(){

        System.out.println("Ingrese la placa de la moto: ");
        setPlaca(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Ingrese el modelo de la moto");
        setModelo(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Ingrese la velocidad Maxima");
        setVelMax(scanner.nextInt());
        scanner.nextLine();
        
    }



/**
 * Metodos gets y sets
 */

    public  int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        Moto.velMax = velMax;
    }

}

