package co.edu.uniquindio.poo;
import java.util.Scanner;

public class Moto extends Vehiculo {

    static Scanner scanner = new Scanner(System.in);

    private static  boolean hibrida;
    private static  int velMax;

/**
 * Constructor de la clase Moto.
 */

    public Moto(boolean hibrida, String placa, int modelo, Propietario propietario, int velMax){
        super(placa, modelo, propietario);
        this.hibrida = hibrida;
        this.velMax = velMax;
    }

    /**
     * Metodo para crear una moto.
     */

    public static void crearMoto(){
        boolean aux = false;

        /**
         * Ciclo para asegurarse que el usuario ingrese un dato valido.
         */
        while (!aux){
            System.out.println("Por favor ingrese una opción:");
            System.out.println("1. Hibrida.          2. Clásica.");
            int select = scanner.nextInt();

            /**
             * Switch para la seleccion del tipo de moto.
             */
            switch (select) {
                case 1:
                    System.out.println("Ha seleccionado su moto como hibrida.");
                    hibrida = true;
                    aux = true;
                    break;
                
                case 2:
                    System.out.println("Ha seleccionado su moto como clásica.");
                    hibrida = false;
                    aux = true;
                    break;
            
                default:
                    System.out.println("No es válido. Intente nuevamente:");
                    break;
            }
        }
        System.out.print("Por favor ingrese la placa: ");
        String placa = scanner.nextLine();
        System.out.println("Por favor ingrese el modelo: ");
        int modelo = scanner.nextInt();
        //Agregar el propietario (Tiene que vincularse con la clase Propietario)...
        System.out.println("Por favor ingrese la velocidad maxima de la moto (Km/h): ");
        int velMax = scanner.nextInt();
        Moto moto = new Moto(hibrida, placa, modelo, propietario, velMax);
    }


/**
 * Metodos gets y sets
 */

    public boolean getHibrida(){
        return hibrida;
    }

    public  void setHibrida(boolean hibrida) {
        Moto.hibrida = hibrida;
    }

    public  int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        Moto.velMax = velMax;
    }

}

