import java.util.Scanner;

public class Entrada {


    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        int opcion;
        do {
            System.out.println("1. Rellenar el nombre");
            System.out.println("2. Rellenar el apellido");
            System.out.println("3. Rellenar el dni");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            if (opcion>=5){
                System.out.println("Faltan");
            }
            switch (opcion){
                case 1:
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();
                    try{
                        formulario.setNombre(nombre);
                    } catch (LongException e ){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Introduce los apellidos: ");
                     String apellido = scanner.nextLine();
                    try{
                        formulario.setApellido(apellido);
                    } catch ( LongException e ){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Introduce el DNI: ");
                    String dni = scanner.nextLine();
                    try{
                        formulario.setDni(dni);
                    } catch (LetrasExcepcion | LongException e ){
                        System.out.println(e.getMessage());
                    }

                    break;
                case 4:
                    try{
                        formulario.mostrarDatos();
                    } catch (NullPointerException e ){
                        System.out.println(e.getMessage());
                    }

                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 4.");
            }
        } while (opcion != 4);
    }
}
