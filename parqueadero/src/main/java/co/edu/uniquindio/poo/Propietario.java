package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Propietario {

    private String nombre;
    private String contacto;
    private Collection<Vehiculo>vehiculos;

    public Propietario(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.vehiculos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Collection<Vehiculo> getVehiculos(){
        return vehiculos;
    }
    
}
