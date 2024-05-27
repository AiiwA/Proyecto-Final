package co.edu.uniquindio.poo;

public class Puesto {

    private int fila;
    private int columna;
    private Vehiculo vehiculo;

    /**
     * Comstructor de la clase puesto
     * @param fila
     * @param columna
     */
    public Puesto(int fila, int columna){
        this.fila=fila;
        this.columna=columna;
        this.vehiculo=null;
    }

    /**
     * metodo para no ingresar un vehiculo a un puesto ocupado
     * @param vehiculo
     */
    public boolean estaOcupado(){
        return vehiculo !=null;
    }

    /**
     * metodo para ingresar un vehiculo a un puesto vacio
     * @param vehiculo
     */
    public void asignarVehiculo(Vehiculo vehiculo){
        this.vehiculo=vehiculo;
    }

    /**
     * metodo para retirar un vehiculo
     * @return
     */
    public Vehiculo retirarVehiculo(){
        Vehiculo vehiculoRetirado=this.vehiculo;
        return vehiculoRetirado;

    }

    public Vehiculo getVehiculo(){
        return vehiculo;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    

}
