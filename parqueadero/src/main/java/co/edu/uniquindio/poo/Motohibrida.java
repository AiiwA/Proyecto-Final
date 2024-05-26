package co.edu.uniquindio.poo;

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

    @Override
    public double calcularTarifa() {
        return tarifaMotoHibrida;
    }
    
}
