import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Ejer2 {
    //2.	(3 puntos) Crea un programa que permita calificar de forma aleatoria a alumnos.
    // Para ello el programa nada más iniciar pedirá el número de alumnos de la clase y los nombres de cada uno de ellos.
    // Una vez hecho esto pedirá confirmación de si se quiere empezar a calificar. Una vez confirmado el sistema calificará entre 1- 10 a los alumnos.
    // Una vez terminado el proceso, el sistema dará las opciones de:
    //a.	Ver suspensos: mostrará el nombre y nota de los alumnos suspensos
    //b.	Ver calificaciones: mostrará el nombre y nota de todos los alumos ordenados por precio
    public static Scanner scanner = new Scanner(System.in);
    public static Random aleatorio = new Random();

    public static void main(String[] args) {

        System.out.println("Indica cuantos alumnos quieres");
        int numAlumnos = scanner.nextInt();

        ArrayList<String> nombreAlumnos = new ArrayList<>(numAlumnos);
        ArrayList<Integer> notaAlumnos = new ArrayList<>(numAlumnos);
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Introduce el nombre del alumno; ");
            nombreAlumnos.add(scanner.next());
        }
        //Calificar de forma aleatoria
        for (int i = 0; i < numAlumnos; i++) {
            notaAlumnos.add(aleatorio.nextInt(10)+1);
        }
        int opcion;
        System.out.println("");
        do {
            System.out.println("1.Ver susensos");
            System.out.println("2. Ver calificaciones. ");
            System.out.println("3. Salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    System.out.println("Nombre: "+ nombreAlumnos);
                    System.out.println( "Calificacion "+notaAlumnos);
                    break;
                case 3:

            }
        } while (opcion != 3);
    }
}
