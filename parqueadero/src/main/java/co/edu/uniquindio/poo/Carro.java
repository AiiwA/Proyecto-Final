package co.edu.uniquindio.poo;
import java.util.Scanner;

public class Carro extends Vehiculo{

    static Scanner scanner = new Scanner(System.in);

    /**
     * Constructor de la clase Carro
     * @param placa
     * @param modelo
     * @param propietario
     */
    public Carro(String placa, int modelo, Propietario propietario){
        super(placa, modelo, propietario);
    }

    public void crearVehiculo(){

        System.out.println("Ingrese la placa del carro: ");
        setPlaca(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Ingrese el modelo del carro");
        setModelo(scanner.nextInt());
        scanner.nextLine();
    }
    
}
