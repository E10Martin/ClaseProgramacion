import java.util.Scanner;

public class EjercicioUno {
        //Crea las siguientes variables: nombre, apellido, edad, altura, peso, sexo (M/F).
    //Pon el tipo que consideres correcto
    //ii. Pide por consola cada uno de los datos anteriores y guárdalos en las variables
    //iii. Crea una variable llamada IMC
    static Scanner teclado = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("Nombre:");
        String nombre = teclado.next();
        System.out.println("Apellido:");
        String apellido = teclado.next();
        System.out.println("Edad:");
        int edad = teclado.nextInt();
        System.out.println("Altura:");
        float altura = teclado.nextFloat();
        System.out.println("Peso:");
        float peso = teclado.nextFloat();
        System.out.println("Sexo (M/F):");
        //char sexo = teclado.next().charAt(0);
        String sexo = teclado.next();
        float imc = calculoIMC(peso, altura);
        System.out.printf("Hola %s tu IMC"+" teniendo en cuenta tu altura de %.2fcm y tu peso de %.2fkg, tiene" +
                "un valor de %.2f", nombre, altura, peso,imc);

    }
    public static float calculoIMC(float peso, float altura){
        return (float) (peso / Math.pow(altura,2));

    }
}
