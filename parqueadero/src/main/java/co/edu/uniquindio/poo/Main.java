package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Parqueadero parqueadero;

    /**
     * Metodo para ingresar el numero de filas y columnas
     * @param args
     */
    public static void main(String[] args) {
        int filas,columnas;
        while(true){
            System.out.println("Ingrese el tamaño de las filas: ");
            filas=scanner.nextInt();
            System.out.println("ingrese el tamaño de las columnas: ");
            columnas=scanner.nextInt();
            if (filas>0 && columnas>0){
                break;
            } 
            else{
                System.out.println("El tamaño del parqueadero debe ser positivo, intente otra vez");
            }
            }
            parqueadero = new Parqueadero(filas, columnas);
        }

    public void seleccionarOpcion(){
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n1. Parquear vehículo");
        System.out.println("2. Retirar vehículo");
        System.out.println("3. Verificar disponibilidad de puesto");
        System.out.println("4. Mostrar parqueadero");
        System.out.println("5. Establecer tarifa");
        System.out.println("6. Generar reporte diario");
        System.out.println("7. Generar reporte mensual");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void procesarOpcion(int opcion) {
        boolean continuar=true;
        while(continuar){
            switch (opcion) {
                case 1:
                    parquearVehiculo();
                    break;
                case 2:
                    retirarVehiculo();
                    break;
                case 3:
                    verificarDisponibilidad();
                    break;
                case 4:
                    parqueadero.mostrarParqueadero();
                    break;
                case 5:
                    establecerTarifa();
                    break;
                case 6:
                    generarReporteDiario();
                    break;
                case 7:
                    generarReporteMensual();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    continuar=false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

    public void parquearVehiculo()

    
    }
    

}

