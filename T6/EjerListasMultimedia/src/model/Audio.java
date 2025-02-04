package model;

public class Audio extends Elemento {
    private double duracion;
    private String soporte;

    public Audio(String identificador, String titulo, String formato, int tamaño, Persona autor, double duracion, String soporte) {
        super(identificador, titulo, formato, tamaño, autor);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("duracion "+duracion);
        System.out.println("soporte "+soporte);
    }

    public Audio(double duracion, String soporte) {
        this.duracion = duracion;
        this.soporte = soporte;
    }
    public Audio() {}

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
