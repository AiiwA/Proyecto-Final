package co.edu.uniquindio.poo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Motohibrida extends Moto {

    /**
     * Constructor moto hibrida
     * @param placa
     * @param modelo
     * @param propietario
     * @param velMax
     */
    public Motohibrida(String placa, int modelo, Propietario propietario, int velMax){
        super(placa, modelo, propietario, velMax);
    }

    /**
     * Metodo para crear una moto hibrida.
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

    public double calcularTarifa(LocalDateTime horaSalida, double tarifa) {
        Duration duracion = Duration.between(getHoraIngreso(), horaSalida);
        long horas = duracion.toHours();
        return horas * tarifa;
    }

    public double getTarifa(double tarifaCarro, double tarifaMoto, double tarifaMotoHibrida) {
        return tarifaMotoHibrida;
    }
}
