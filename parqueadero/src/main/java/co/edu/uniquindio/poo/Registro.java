package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class Registro {

    private Vehiculo vehiculo;
    private LocalDateTime horaIngreso;
    private int fila,columna;

    public Registro(Vehiculo vehiculo,LocalDateTime horaIngreso, int fila, int columna){
        this.vehiculo=vehiculo;
        this.horaIngreso=horaIngreso;
        this.fila=fila;
        this.columna=columna;
    }

    

}
