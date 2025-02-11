package model;

import java.util.Random;

public class Coche {
    static Random random  = new Random();
    //- Atributo de tipo int que represente los caballos
    //- Atributo de tipo int que represente la velocidad
    //- Atributo de tipo String que represente la matricula
    //- Atributo de tipo String que represente el modelo
    //- Atributo de tipo double que represente los kilómetros recorridos

    private int cv, velocidad;
    private String matricula, modelo;
    private double kmRecorrido;

    public Coche(int cv, int velocidad, String matricula, String modelo, double kmRecorrido) {
        this.cv = 0;
        this.velocidad = velocidad;
        this.matricula = "000AAA";
        this.modelo = "sin especificar";
        this.kmRecorrido = 0.0;
    }

    public Coche(String matricula, String modelo, int cv) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.cv = cv;
    }

    public void acelerar(int cantidad) {
        Random rand = new Random();
        this.velocidad += cantidad;
        if (this.velocidad > 180) {
            this.velocidad = 180;
            System.out.println("Velocidad máxima alcanzada.");
        }
        this.kmRecorrido += this.velocidad * (this.cv * (rand.nextInt(10) + 1));
    }

}
