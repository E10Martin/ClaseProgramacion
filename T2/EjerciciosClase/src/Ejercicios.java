import java.util.Scanner;

public class Ejercicios {
      static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args){
    ejer6();
    }
    public static void ejer1(){
     final String nombre = "Luis González Sanz ";
     final String calle = "C/ Maria de Molina ";
     final int portal = 51;
     final int piso = 1;
     final char letra = 'A' ;
     final int Codigo = 28942;
     final String poblacion = "Alcorcon";
     final String provincia = "Madrid";
     final String pais = "España";

     System.out.println(nombre);
     System.out.printf("%s nº%d,%d%c\n",calle, portal, piso, letra);
     System.out.printf("%d %s %s\n", Codigo, poblacion, provincia);
     System.out.println(pais);
    }
    public static void ejer2(){
        String nombre;
        System.out.println("Introduce tu nombre; ");
        nombre = teclado.nextLine();
        Integer  edad;
        System.out.println("Introduce tu edad; ");
        edad = teclado.nextInt();
        System.out.printf("Tu nombre completo: %s\nTienes: %d años", nombre, edad);

    }
    public static void ejer3(){

        System.out.println("Introduce un num entero;");
        int n1 = teclado.nextInt();

        System.out.println("Introduce otro num entero;");
        int n2 = teclado.nextInt();

        int resultado = n1 + n2;
        System.out.println("El resultado suma es "+resultado);
        resultado = n1 - n2;
        System.out.println("El resultado resta es "+resultado);
        resultado = n1 * n2;
        System.out.println("El resultado multiplicacion es "+resultado);
        resultado = n1 / n2;
        System.out.println("El resultado division es "+resultado);
        resultado = n1 % n2;
        System.out.println("El resultado resto es "+resultado);
        float resultado2 ;
        resultado2 = ( float) n1 / n2;
        System.out.println("El resultado resto es "+resultado2);
        resultado2 = n1%n2;
        System.out.println("El resultado resto es "+resultado2);

    }

    public static void ejer4() {

        double bebidas = 1.25;
        double bocadillos = 2.05;
        System.out.println("Cuantas bebidas quieres;");
         int n1 = teclado.nextInt();
        System.out.println("Cuantos bocadillos quieres;");
        int  n2 = teclado.nextInt();

        float resultado;
        resultado = (float) bebidas*n1;
        System.out.println("Coste bebidas "+ resultado);
        float resultado2;
        resultado2 = (float) bocadillos*n2;
        System.out.println("Coste bocadillos "+ resultado2);
        float consumicion;
        consumicion = (float) resultado+resultado2;
        System.out.println("Coste consumicion "+ consumicion);

    }
    public static void ejer5(){

        System.out.println("Introduce el numero de segundos; ");
         int seg = teclado.nextInt();
        int h = seg/3600;
       System.out.println("Horas; "+ h);
        int segundosRestantes = seg%3600;
        int min = segundosRestantes/60;
        System.out.println("Minutos; "+ min);
        int s = segundosRestantes%60;
        System.out.println("Segundos; "+s);

    }
    public static void ejer6(){
        
    }
}

