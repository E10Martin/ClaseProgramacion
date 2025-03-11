import controller.Centro;
import model.Paciente;

import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Centro hospital = new Centro();
        int opcion;
        do {
            System.out.println("1. Añadir paciente");
            System.out.println("2. Contratar doctor");
            System.out.println("3. Ver doctores");
            System.out.println("4. Ver pacientes");
            System.out.println("5. Ver citas de los pacientes");
            System.out.println("6. Ver citas de los doctores");
            System.out.println("7. salir");
            System.out.println("Seleccione una opcion");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Nombre");
                    String nombre = scanner.next();
                    System.out.println("Apellido");
                    String apellido = scanner.next();
                    System.out.println("nss");
                    int nss= scanner.nextInt();
                    System.out.println("Dolencia");
                    String dolencia = scanner.next();


                    hospital.anadirPaciente(new Paciente (nombre, apellido, nss, dolencia));

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    hospital.mostrarPaciente();
                    break;
                case 7:
                    System.out.println("Saliendo.....");
                    break;
            }
        }while(opcion != 7);
    }
}
