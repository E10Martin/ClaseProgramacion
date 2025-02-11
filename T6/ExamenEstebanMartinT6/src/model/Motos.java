package model;

public class Motos extends Vehiculo {

    private String transmision;
    private double peso;

    public Motos(String marca, String modelo, String estado, int serie, int precioVenta, String transmision, double peso) {
        super(marca, modelo, estado, serie, precioVenta);
        this.transmision = transmision;
        this.peso = peso;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}
