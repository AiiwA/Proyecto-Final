package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class Registro {
    private Vehiculo vehiculo;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;
    private int fila;
    private int columna;
    private double costo;

    public Registro(Vehiculo vehiculo, LocalDateTime horaIngreso, int fila, int columna) {
        this.vehiculo = vehiculo;
        this.horaIngreso = horaIngreso;
        this.fila = fila;
        this.columna = columna;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "vehiculo=" + vehiculo.getPlaca() +
                ", horaIngreso=" + horaIngreso +
                ", horaSalida=" + horaSalida +
                ", fila=" + fila +
                ", columna=" + columna +
                ", costo=" + costo +
                '}';
    }
}

