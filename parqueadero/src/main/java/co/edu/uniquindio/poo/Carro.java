package co.edu.uniquindio.poo;
import java.time.Duration;
import java.time.LocalDateTime;
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

    public double calcularTarifa(LocalDateTime horaSalida, double tarifa) {
        Duration duracion = Duration.between(getHoraIngreso(), horaSalida);
        long horas = duracion.toHours();
        return horas * tarifa;
    }

    public double getTarifa(double tarifaCarro, double tarifaMoto, double tarifaMotoHibrida) {
        return tarifaCarro;
    }
}