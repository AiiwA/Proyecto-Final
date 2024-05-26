package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Propietario {

    private String nombre,apellido, cedula;
    private Collection<Vehiculo>vehiculos;

    /**
     * Constructor de la clase Propietario
     * @param nombre
     * @param contacto
     */
    public Propietario(String nombre,String Apellido ,String cedula) {
        this.nombre=nombre;
        this.cedula=cedula;
        this.vehiculos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula=cedula;
    }

    public Collection<Vehiculo> getVehiculos(){
        return vehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    
}
