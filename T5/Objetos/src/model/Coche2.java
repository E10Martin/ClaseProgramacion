package model;

import java.util.Random;

public class Coche2 {

    static Random aleatorio = new Random();
    private String marca, modelo, matricula;
    private int cv, km;
    private Coche2 ganador;

    public Coche2(String marca, String modelo, String matricula, int cv, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.km = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void recorrido(){
        int kmRecorrido = aleatorio.nextInt(26)+50;
        this.km += kmRecorrido;
    }

    public int getKm() {
        return km;
    }

    @Override
    public String toString() {
        return "Coche2{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", cv=" + cv +
                ", km=" + km +
                '}';
    }
}
