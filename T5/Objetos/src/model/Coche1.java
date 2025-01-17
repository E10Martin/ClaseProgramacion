package model;

import java.util.Random;

public class Coche1 {

    private String marca, modelo, matricula;
    private int cv,km;

    public static Random aleatorio = new Random();
    public Coche1(){
        marca = "sin definir";
        modelo = "sin definir";
        matricula = "sin definir";
        km = 0;
    }

    public Coche1(String marca, String modelo, String matricula, int cv, int km){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.km = km;
    }
}
