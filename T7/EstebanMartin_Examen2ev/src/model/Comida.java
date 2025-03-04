package model;

public class Comida extends Consumicion {

    private int nCalorias;

    public Comida(String nombre, double precio, int nCalorias) {
        super(nombre, precio);
        this.nCalorias = nCalorias;
    }

    @Override
    public String toString() {
        return super.toString()+". Comida" + "nCalorias= " + nCalorias ;
    }

    public int getnCalorias() {
        return nCalorias;
    }

    public void setnCalorias(int nCalorias) {
        this.nCalorias = nCalorias;
    }
}
