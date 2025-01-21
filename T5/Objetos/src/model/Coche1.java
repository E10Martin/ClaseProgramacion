
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
        cv = 0;
        km = 0;
    }

    public Coche1(String marca, String modelo, String matricula, int cv){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.km = 0;
    }
    @Override
    public String toString(){
        return marca+ " " +modelo + " Matricula: "+ matricula +" " +"Cv: "+ cv;

    }

    public void recorrido(){
        int kmRecorridos = aleatorio.nextInt(26)+50;
        this.km += kmRecorridos;

    }

    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
}
/*
Un coche tiene un atributo KM,
los cuales pueden decir la distancia que ha recorrido un coche
Para poder hacer una carrera, es necesario que se pida por consola
los datos de 6 participantes, donde se debe indicar marca, modelo,
matricula, cv.
Una vez indicados todos los participantes, es necesario indicar cuantas
vueltas consta la carrera
Una vez indica el nº de vueltas, la carrera comienza. Para ello en cada vuelta
cada coche recorre un numero de km aleatorio (50-75)
Una vez se terminan las vueltas el sistema mostrara:

El ganado es el coche XXXX XXXX XXXXX
La clasificacion final es:
1- XXXX XXXX XXXX XX
2- XXXX XXXX XXXX XX

 */
