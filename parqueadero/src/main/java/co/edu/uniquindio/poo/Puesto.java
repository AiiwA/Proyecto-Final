package co.edu.uniquindio.poo;

public class Puesto {

    private int x;
    private int y;
    private Vehiculo vehiculo;

    public Puesto(int x, int y, Vehiculo vehiculo){
        this.x=x;
        assert(x>=0);
        this.y=y;
        assert(y>=0);
        this.vehiculo=vehiculo;
    }

}
