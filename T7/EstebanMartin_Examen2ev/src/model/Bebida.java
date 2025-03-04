package model;

public class Bebida extends Consumicion {

    private double cMililitros;

    public Bebida(String nombre, double precio, double cMililitros) {
        super(nombre, precio);
        this.cMililitros = cMililitros;
    }

    public String toString() {
        return super.toString()+". Bebida" + "cMililitros= " + cMililitros ;
    }
    public double getcMililitros() {
        return cMililitros;
    }

    public void setcMililitros(double cMililitros) {
        this.cMililitros = cMililitros;
    }
}
