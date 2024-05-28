package co.edu.uniquindio.poo;

import java.util.Scanner;
//
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
                System.out.println("Ingrese la tarifa por hora para carro:");
                double tarifaCarro = scanner.nextDouble();
                System.out.println("Ingrese la tarifa por hora para moto clásica:");
                double tarifaMotoClasica = scanner.nextDouble();
                System.out.println("Ingrese la tarifa por hora para moto híbrida:");
                double tarifaMotoHibrida = scanner.nextDouble();
                parqueadero.establecerTarifas(tarifaCarro, tarifaMotoClasica, tarifaMotoHibrida);
                break;
            } 
            else{
                System.out.println("El tamaño del parqueadero debe ser positivo, intente otra vez");
            }

        }
        parqueadero = new Parqueadero(filas, columnas);
        

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
    
            if (continuar) {
                mostrarMenu();
                opcion = scanner.nextInt();
            }
        }
    }

    public static void parquearVehiculo(){
        System.out.println("Ingrese el tipo de vehículo (1=Carro, 2=Moto, 3=Moto Híbrida): ");
        int tipo = scanner.nextInt();
        System.out.println("Ingrese la placa del vehículo: ");
        String placa = scanner.next();
        System.out.println("Ingrese el modelo del vehículo: ");
        int modelo = scanner.nextInt();
        System.out.println("Ingrese el nombre del propietario: ");
        String nombre = scanner.next();
        System.out.println("Ingrese el apellido del propietario: ");
        String apellido = scanner.next();
        System.out.println("Ingrese la cédula del propietario: ");
        String cedula = scanner.next();
        System.out.println("Ingrese la fila del puesto: ");
        int fila = scanner.nextInt();
        System.out.println("Ingrese la columna del puesto: ");
        int columna = scanner.nextInt();
        Propietario propietario = new Propietario(nombre,apellido,cedula);
        Vehiculo vehiculo;
        switch (tipo) {
            case 1:
                vehiculo = new Carro(placa, modelo, propietario);
                break;
            case 2:
                System.out.println("Ingrese la velocidad máxima de la moto: ");
                int velMax = scanner.nextInt();
                vehiculo = new Moto(placa, modelo, propietario, velMax);
                break;
            case 3:
                System.out.println("Ingrese la velocidad máxima de la moto híbrida: ");
                int velMaxHibrida = scanner.nextInt();
                vehiculo = new Motohibrida(placa, modelo, propietario, velMaxHibrida);
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                return;
        }

        boolean exito = parqueadero.parquearVehiculo(vehiculo, fila, columna);
        if (exito) {
            System.out.println("Vehículo parqueado con éxito.");
        } else {
            System.out.println("No se pudo parquear el vehículo. Verifique si el puesto está ocupado o si las coordenadas son válidas.");
        }
        
    }


    public static void retirarVehiculo(){
        System.out.println("Ingrese la fila del puesto: ");
        int fila = scanner.nextInt();
        System.out.println("Ingrese la columna del puesto: ");
        int columna = scanner.nextInt();
        Vehiculo vehiculo = parqueadero.retirarVehiculo(fila, columna);
        if (vehiculo != null) {
            System.out.println("Vehículo retirado con éxito. Detalles: " + vehiculo.getPlaca());
        } else {
            System.out.println("No se pudo retirar el vehículo. Verifique si las coordenadas son válidas y si el puesto está ocupado.");
        }
    }


    public static void verificarDisponibilidad(){
        System.out.println("Ingrese la fila del puesto: ");
        int fila = scanner.nextInt();
        System.out.println("Ingrese la columna del puesto: ");
        int columna = scanner.nextInt();
        if (fila >= 0 && fila < parqueadero.getTamano()[0] && columna >= 0 && columna < parqueadero.getTamano()[1]) {
            Puesto puesto = parqueadero.getPuestos()[fila][columna];
            if (puesto.estaOcupado()) {
                System.out.println("El puesto está ocupado por el vehículo con placa: " + puesto.getVehiculo().getPlaca());
            } else {
                System.out.println("El puesto está libre.");
            }
        } else {
            System.out.println("Coordenadas del puesto no válidas.");
        }
    }


    public static void establecerTarifa(){
        System.out.println("Ingrese la tarifa por hora para carro:");
        double tarifaCarro = scanner.nextDouble();
        System.out.println("Ingrese la tarifa por hora para moto clásica:");
        double tarifaMotoClasica = scanner.nextDouble();
        System.out.println("Ingrese la tarifa por hora para moto híbrida:");
        double tarifaMotoHibrida = scanner.nextDouble();
        parqueadero.establecerTarifas(tarifaCarro, tarifaMotoClasica, tarifaMotoHibrida);
        System.out.println("Tarifas establecidas con éxito.");
    }


    public static void generarReporteDiario(){
        parqueadero.generarReporteDiario();

    }    

    public static void generarReporteMensual(){
        parqueadero.generarReporteMensual();

    }

}