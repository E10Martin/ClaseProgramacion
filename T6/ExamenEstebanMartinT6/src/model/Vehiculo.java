package model;

public class Vehiculo {

    private String marca, modelo, estado;
    private int serie, precioVenta;

    public Vehiculo(String marca, String modelo, String estado, int serie, int precioVenta) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.serie = serie;
        this.precioVenta = precioVenta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

}
