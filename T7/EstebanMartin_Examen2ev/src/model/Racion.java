package model;

public class Racion extends Consumicion {

    private double cantidadPlato;

    public Racion(String nombre, double precio, double cantidadPlato) {
        super(nombre, precio);
        this.cantidadPlato = cantidadPlato;
    }

    public String toString() {
        return super.toString()+". Racion" + "cantida= " + cantidadPlato ;
    }
    public double getCantidadPlato() {
        return cantidadPlato;
    }

    public void setCantidadPlato(double cantidadPlato) {
        this.cantidadPlato = cantidadPlato;
    }
}
