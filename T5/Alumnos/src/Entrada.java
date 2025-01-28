import model.Alumno;
import model.Asignatura;
import model.Profesor;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        // como haria para tener 5 alumnos
        // se matricula en las mismas asignaturas
        ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();
        listaAsignaturas.add(new Asignatura(1));
        listaAsignaturas.add(new Asignatura(2));
        listaAsignaturas.add(new Asignatura(2));
        Asignatura programacion = new Asignatura(1);
        Asignatura sistemas = new Asignatura(2);
        Asignatura lenguaje = new Asignatura(3);

        Alumno veseli = new Alumno(1,2,3);
        Alumno estepan = new Alumno(1,2,3);


        Profesor profesor = new Profesor();
        profesor.ponerNotas(veseli);
        profesor.ponerNotas(estepan);
        System.out.println("La nota de programacion "+veseli.getAsignatura1().getCalificacion());
        System.out.println("La nota de sistemas "+veseli.getAsignatura2().getCalificacion());
        System.out.println("La nota de Lm "+veseli.getAsignatura3().getCalificacion());
        System.out.println("La media del alumno1 es "+ profesor.calcularMedia(veseli));
        System.out.println("La media del alumno 2es "+ profesor.calcularMedia(estepan));
    }
}
