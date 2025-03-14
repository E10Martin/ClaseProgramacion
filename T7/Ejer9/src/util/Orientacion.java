package util;

public enum Orientacion {

    NORTE("Norte ",1.1), SUR("Sur ",1.1), ESTE("Este ", 1.05), OESTE("Oeste ",1.05);

    private double revalorizacion;
    private String nombre;

    Orientacion(String nombre, double revalorizacion){
        this.revalorizacion = revalorizacion;
        this.nombre = nombre;
    }

    public double getRevalorizacion() {
        return revalorizacion;
    }

    public void setRevalorizacion(double revalorizacion) {
        this.revalorizacion = revalorizacion;
    }
}
