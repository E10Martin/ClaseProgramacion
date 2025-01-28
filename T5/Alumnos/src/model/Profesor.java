package model;

import java.util.Random;

public class Profesor {
     static Random aleatorio = new Random();
    public Profesor(){}
    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion(aleatorio.nextDouble()*10);
        alumno.getAsignatura2().setCalificacion(aleatorio.nextDouble()*10);
        alumno.getAsignatura3().setCalificacion(aleatorio.nextDouble()*10);
    }
    public double calcularMedia(Alumno alumno){
        return (alumno.getAsignatura1().getCalificacion() +
                alumno.getAsignatura2().getCalificacion() +
                alumno.getAsignatura3().getCalificacion()) / 3.0;
    }
}
