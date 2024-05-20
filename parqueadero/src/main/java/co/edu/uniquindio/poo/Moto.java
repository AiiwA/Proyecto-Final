package co.edu.uniquindio.poo;
import java.util.Scanner;

public class Moto extends Vehiculo {

    Scanner scanner = new Scanner(System.in);

    private boolean hibrida;

/**
 * Constructor de la clase Moto.
 */

    public Moto(boolean hibrida, String placa, String modelo, String propietario){
        super(placa, modelo, propietario);
        this.hibrida = hibrida;
    }

    /**
     * Método para determinar el tipo de la moto.
     */

    public boolean determinarTipo(boolean hibrida){

        int select = scanner.nextInt();
        boolean aux = false;

        /**
         * Ciclo para asegurarse que el usuario ingrese un dato valido.
         */
        while (!aux){
            System.out.println("Por favor ingrese una opción:");
            System.out.println("1. Hibrida.          2. Clásica.");

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
        return hibrida;
    }

/**
 * Metodos gets
 */

    public boolean getHibrida(){
        return hibrida;
    }
}

