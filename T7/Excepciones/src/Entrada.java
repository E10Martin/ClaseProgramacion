import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*String [] cosas = new String[]{"Dato1","Dato2","Dato3"};

        int numero1 = 2;
        int numero2 = 0;
        String nombre;

        System.out.println("A que posicion quieres acceder");
        int posicion = scanner.nextInt();
        try {
            System.out.println(cosas[posicion]);
            int resultado = numero1/numero2;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El size es mas grande que la posicion indicada");
        } catch (ArithmeticException e){
            System.out.println("Error en la division entre 0");
        } finally {
            System.out.println("terminando proceso");
        }

        System.out.println("Terminando el programa");
        //System.out.println("El numero de letras de tu nombre es "+nombre.length());*/

        Operaciones operaciones = new Operaciones();
        operaciones.divisionEntre0(20);
        operaciones.crearFichero("ejemplo.txt");

    }
}
