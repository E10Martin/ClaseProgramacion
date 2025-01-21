package model;

public class Coche2 {

    private String marca, modelo, matricula;
    private int cv, km;
    private Coche2 ganador;

    public Coche2(String marca, String modelo, String matricula, int cv, int km){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.km = 0;
    }

    @Override
    public String toString() {
        return "Coche2{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", cv=" + cv +
                ", km=" + km +
                ", ganador=" + ganador +
                '}';
    }
}
