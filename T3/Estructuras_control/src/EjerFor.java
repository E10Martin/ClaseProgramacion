import java.util.Scanner;

public class EjerFor {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //ejer1();
        ejer3();
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

}
