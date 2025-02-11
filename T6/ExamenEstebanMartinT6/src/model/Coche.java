package model;

public class Coche extends Vehiculo {

    private int cv, cc;

    public Coche(String marca, String modelo, String estado, int serie, int precioVenta, int cv, int cc) {
        super(marca, modelo, estado, serie, precioVenta);
        this.cv = cv;
        this.cc = cc;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }


}
