package model;

public class Bicis extends Vehiculo {

    private String tipo;

    public Bicis(String marca, String modelo, String estado, int serie, int precioVenta, String tipo) {
        super(marca, modelo, estado, serie, precioVenta);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
