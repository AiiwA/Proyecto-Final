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

            parqueadero = new Parqueadero(filas, columnas);

            System.out.println("Ingrese la tarifa por hora para carro:");
            double tarifaCarro = scanner.nextDouble();
            System.out.println("Ingrese la tarifa por hora para moto clásica:");
            double tarifaMotoClasica = scanner.nextDouble();
            System.out.println("Ingrese la tarifa por hora para moto híbrida:");
            double tarifaMotoHibrida = scanner.nextDouble();
            parqueadero.establecerTarifas(tarifaCarro, tarifaMotoClasica, tarifaMotoHibrida);
        }
        

        boolean seguir=true;
        while (seguir) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            procesarOpcion(opcion);

            System.out.println("¿Desea realizar otra acción? (S/N): ");
            String continuar = scanner.next();
            if (continuar.equals("N")) {
                seguir = false;
            }
            scanner.close();
            }
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
    }

    public void parquearVehiculo(){

    }

    public void retirarVehiculo(){

    }

    public void verificarDisponibilidad(){

    }

    public void establecerTarifa(){

    }

    public void generarReporteDiario(){

    }    

    public void generarReporteMensual(){

    }

}





