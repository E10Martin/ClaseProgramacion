import java.util.Scanner;

public class EjerFor {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //ejer1();
        //ejer3();
        //ejer4();
        ejer5();
    }
    public static void ejer1(){
        //Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
        // Obténgase la media con dos decimales de las temperaturas introducidas por consola. (TemperaturasIntroducidas)
        System.out.println("Cuantas temperaturas quires introducir;");
        int nTemperatura = teclado.nextInt();
        int temperatura = 0;
        int sumatorio = 0;
        if (nTemperatura<=0){
            nTemperatura = 10;
        }
        for (int i = 0; i<nTemperatura; i++){
            System.out.println("Introduce temperatura");
            temperatura = teclado.nextInt();
            sumatorio = sumatorio+temperatura;
         }
        System.out.println("La suma de todas las temperaturas "+ sumatorio);
        System.out.println("La media de todas las temperaturas "+(float) sumatorio/nTemperatura);


    }
    public static void ejer3(){

        for (int i = 0; i < 11; i++){
            System.out.println("Tabla de multiplicar del "+ i);
            for (int j = 0; j<11; j++){
                //tabla de multiplicar de i
                System.out.printf("%d * %d = % d\n",i, j, i*j);
            }
        }
    }
    public static void ejer4(){
        System.out.println("");
        int n1 = teclado.nextInt();
        System.out.println("");
        int n2 = teclado.nextInt();

        for (int i = n1; i<=n2; i++ ){
            System.out.printf("El numero %d tabla de mulriplicar:\n",i );
            for (int j = 0; j<=10; j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j );
            }
        }

    }
    public static void ejer5(){
        //Dado dos enteros entre 0 y 5 (la base y el exponente),
        // obtener la potencia del primero elevado al segundo sin utilizar el método “pow”. Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243.
        // Casos particulares: 00 = Error y n0 = 1.(BaseExponente)
        System.out.println("Numero:");
        int base = teclado.nextInt();
        System.out.println("Numero:");
        int exponente = teclado.nextInt();
        int total = 1;

        if (base == 0 && exponente == 0){
            System.out.println("Error ttune.");
        } else {
            for (int i  = 0; i<=exponente; i++){
                total *= base;
            }
        }
        System.out.printf("Base; %d     Exponente; %d     Resultado; %d",base, exponente, total);

    }

}
