import controller.Centro;
import model.Doctor;
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
                    String nombrePaciente = scanner.next();
                    System.out.println("Apellido");
                    String apellidoPaciente = scanner.next();
                    System.out.println("nss");
                    int nssPaciente= scanner.nextInt();
                    System.out.println("Dolencia");
                    String dolenciaPaciente = scanner.next();

                    hospital.anadirPaciente(new Paciente (nombrePaciente, apellidoPaciente, nssPaciente, dolenciaPaciente));
                    hospital.anadirPaciente(new Paciente ("Veseli", "Bulgs", 12345678, "Espermanal"));

                    break;
                case 2:
                    System.out.println("Nombre");
                    String nombreDoctor = scanner.next();
                    System.out.println("Apellido");
                    String apellidoDoctor = scanner.next();
                    System.out.println("nss");
                    int nColegiadoDoctor= scanner.nextInt();

                    hospital.anadirDoctor(new Doctor(nombreDoctor, apellidoDoctor, nColegiadoDoctor));
                    hospital.anadirDoctor(new Doctor("Martin", "Loko", 100));

                    break;
                case 3:
                    hospital.mostrarDoctor();
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
//1. (Centro salud genérico)
//
//Crea una aplicación que permita gestionar los pacientes y médicos de un centro de salud. Para ello el sistema contará con las siguientes clases:
//
//- Paciente: nombre, apellido, nss y dolencia
//- Doctor: nombre, apellido, número colegiado
//- Centro: lista de pacientes y lista de doctores
//- Cita: fecha de la cita, especialidad, doctor asociado, paciente asociado
//
//Los doctores pueden tener especialidades, donde las que se permiten recoger en el sistema son
//
//- Digestivo: además de los datos del doctor esta clase tendrá un atributo de años experiencia y un método de realizar intervención
//- General: adeás de los datos del doctor, esta clase tendrá un atributo de tipo (familiar o infantil. Este tipo no cambia y siempre es el mismo) y un método que sea recetar pastillas
//- Traumatólogia: además de los datos del doctor, esta clase tendrá un método que sea realizarVenda
//
//Crear un centro de salud que permita:
//
//- Admitir paciente
//- Contratar doctor
//- Ver todos los doctores
//- Ver todos los pacientes
//- Ver todas las citas que tienen los pacientes
//- Ver todos las citas que tienen los doctores:
//- Pedir cita por parte de un paciente. Para pedir una cita, el centro de salud pedirá el nss del paciente y la especialidad para la que quiere dicha cita y el dia de la misma.
//    - En el caso de ser un centro de salud que no gestione esas citas, saltará un error.
//    - En el caso de poder gestionar la cita, se le asignará a un doctor del centro
//
//Además de esto, personaliza la clase para que se pueda:
//
//- Crear un centro de salud con cualquier tipo de médico
//- Crear un centro de salud solo con doctores de tipo general
//- Crear un centro de salud solo con doctores de tipo traumatólogo
//- Crear un centro de salud solo con doctores de tipo digestivo
