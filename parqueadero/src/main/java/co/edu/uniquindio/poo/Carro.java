package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Carro extends Vehiculo{

    static Scanner scanner = new Scanner(System.in);

    /**
     * Constructor.
     */
    public Carro(String placa, int modelo, String propietario){
        super(placa, modelo, propietario);
    }

    /**
     * Metodo para crear un carro.
     */
    public static void crearCarro(){
        System.out.print("Por favor ingrese la placa: ");
        String placa = scanner.nextLine();
        System.out.println("Por favor ingrese el modelo: ");
        int modelo = scanner.nextInt();
        //Agregar el propietario (Tiene que vincularse con la clase Propietario)...
        System.out.println("Por favor ingrese la velocidad maxima de la moto (Km/h): ");
        int velMax = scanner.nextInt();
        Carro carro = new Carro(placa, modelo, placa, propietario);
    }
    
}
