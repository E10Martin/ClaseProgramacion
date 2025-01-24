
import model.Coche1;
import model.Coche2;

import java.util.Scanner;

public class Entrada2 {

    static Scanner scanner = new Scanner(System.in);
    static Carrera2 carrera = new Carrera2();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("1. Introduce los participantes");
            System.out.println("2. Mostrar participantes");
            System.out.println("3. Introduce el numero de vueltas");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    int nParticipantes;
                    do {
                        System.out.println("Introduce el numero de los participantes");
                        nParticipantes = scanner.nextInt();
                        if (nParticipantes>=9){
                            System.out.println("Solo se pueden inscribir hasta 8 prticipantes");
                        }
                    }while (nParticipantes>=9);
                    for (int i = 0; i < nParticipantes ; i++) {

                        System.out.println("Introduce marca:");
                        String marca = scanner.next();
                        System.out.println("Introduce modelo:");
                        String modelo = scanner.next();
                        System.out.println("Introduce matricula:");
                        String matricula = scanner.next();
                        System.out.println("Introduce cv:");
                        int cv = scanner.nextInt();
                        int km =0;

                        if(carrera.inscribirParticipante(marca, modelo, matricula, cv, km)){
                            System.out.println("Coche "+(i+1)+" incrito correctamente");
                        } else {
                            System.out.println("Matricula duplicada, los siento");
                        }
                        System.out.println("");
                    }

                    break;
                case 2:
                    for (Coche2 Coche :carrera.mostrarCoches()){
                        System.out.println(Coche);
                        System.out.println("");
                    }
                case 3:
                    carrera.numVueltas();
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
            }
        } while (opcion !=4);

    }
}
