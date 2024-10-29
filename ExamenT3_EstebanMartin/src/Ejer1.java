import java.util.Scanner;

public class Ejer1 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

         float n1;
        float n2;
        do {

            System.out.println("Introduce un numero: ");
             n1 = teclado.nextInt();
            System.out.println("Introduce un numero: ");
             n2 = teclado.nextInt();

            if (n1 > 0 && n2 > 0) {
                //En el caso de que ambos números sean positivos, se mostrará un
                //menú ofreciendo las opciones de suma, resta, multiplicación y
                //división
                int opcion;
                do {
                    System.out.println("1.Suma: ");
                    System.out.println("2.Resta: ");
                    System.out.println("3.Multiplicacion: ");
                    System.out.println("4.Division: ");
                    System.out.println("5.Otros numeros: ");
                    opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("La suma de los numeros es: " +(int) (n1 + n2));
                            break;
                        case 2:
                            System.out.println("La resta de los numeros es: " +(int) (n1 - n2));
                            break;
                        case 3:
                            System.out.println("La multiplicacion es: " +(int) (n1 * n2));
                            break;
                        case 4:
                            System.out.println("La division es: " +(n1 / n2));
                            break;
                        case 5:
                            System.out.println("Preparando otros numeros.");
                            break;
                    }
                } while (opcion != 5);

            }


            if (n1 < 0 || n2 < 0) {
                //En el caso de que alguno de los números sea negativo, aparecerá un
                //mensaje avisando de que no se pueden realizar operaciones sobre
                //números negativos
                System.out.println("No se puede realizar operaciones de numeros negativos.");

            }
        }while(n1 >0 && n2>0);
        System.out.println("Se acabo el programa.");

    }
}
