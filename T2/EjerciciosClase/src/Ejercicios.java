import java.util.Scanner;

public class Ejercicios {
      static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args){
    //ejer1();
    //ejer2();
    //ejer3();
    //ejer4();
    //ejer5();
    //ejer6();
        //ejer11();
       //ejer12();
        //ejer13();
        //ejer15();
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
        //1. Permítase introducir el valor con IVA de una compra con dos decimales (la compra no puede ser superior a 500€ ni inferior a 0€)
        // y el valor del IVA de dicha compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?¿Cuánto fue el IVA?
        // Muéstrese los resultados redondeados a dos decimales. (Compra)

        //*ENTRADA/SALIDA*
        //Valor de la compra (entre 0.00 y 500.00):**298,45**
        //IVA (entre 0 y 25%):**12**
        //Compra: 266.47
        //IVA: 31.98
        //======
        //298.45

        System.out.println("Valor de la compra (entre 0.00 y 500.00): ");
        float valor = teclado.nextFloat();
        System.out.println("IVA (entre 0 y 25%): ");
        float iva = teclado.nextFloat();
        float porcen = iva /100;
        float compra =  porcen* valor;
        // hacerlo en un paso; valor * ((float) iva/100)
        float compraFinal = valor- compra;
        System.out.printf("Compra: %.2f\n", compraFinal);
        System.out.printf("IVA : %.2f", compra);

    }
    public static void ejer7(){
        //1. Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100.
        // Obténgase la longitud de la circunferencia (2πr) y el área del circulo (πr2) .(Circunferencia) NOTA El valor de PI se obtiene con Math.PI
        //*ENTRADA/SALIDA*
        //Escribe un radio entero: **15**
        //Longitud de la circunferencia: 94.24777960769379
        //Area de circulo: 706.8583470577034
        System.out.println("Escribe un radio entero; ");
        int radio = teclado.nextInt();
        double longitudCircunferencia =  Math.PI*radio*2;
        System.out.println("Longitud de la circunferencia: "+ longitudCircunferencia);
        double areaCirculo =  Math.PI*(radio*radio);
        System.out.println("Area de circulo: "+ areaCirculo);
    }
    public static void ejer8(){
        //Hágase una aplicación que permita realizar conversiones de temperaturas entre grados
        //centígrados, farenheit y kelvin (los resultados se muestran redondeados a dos
        //decimales). (Temperaturas)
        //Grados centigrados: **15,70*
        //Farenheit: 60,26 Kelvin: 288,85
        //Grados Farenheit: **45,32**
        //Centigrados: 7,4 Kelvin: 280,55
        //Grados Kelvin: **345,23**
        //Centigrados: 72,08 Farenheit: 161,74
        System.out.println("Grados centigrados; ");
        float centigrados = teclado.nextFloat();
        float calculoF = (9*centigrados)/5+32;
        float calculoK = (float) (centigrados + 273.15);
        System.out.printf("Farenheit: %.2f Kelvin: %.2f\n ",calculoF, calculoK);


        System.out.println("Grados Farenheit: ");
        float farenheit = teclado.nextFloat();
        float calculoC1 = (5*(farenheit-32))/9;
        float calculoK1 = (float)  (calculoC1 + 273.15);
        System.out.printf("Centigrados: %.2f Kelvin: %.2f\n", calculoC1, calculoK1);


        System.out.println("Grados Kelvin; ");
        float kelvin = teclado.nextFloat();
        float calculoC2 = (float) (kelvin - 273.15);
        float calculoF2 = (9*calculoC2)/5+32;
        System.out.printf("Centigrados: %.2f Farenheit: %.2f ",calculoC2, calculoF2);


    }
    public static void ejer9(){
        //Número de bebidas (entre 0 y 20): **3**
        //Número de bocadillos (entre 0 y 20): **5**
        //Precio de cada bebida (entre 0,00 y 3,00): **1,20**
        //Precio de cada bocadillo (entre 0,00 y 3,00): **2,05**
        //Número de alumnos (entre 1 y 10): **5**
        System.out.println("Numero de bebidas (entre 0 y 20):");
        int numBebidas = teclado.nextInt();
        System.out.println("Numero de bocatas (entre 0 y 20):");
        int numBocatas = teclado.nextInt();
        System.out.println("Precio de cada bebida (entre 0,00 y 3,00): ");
        float precioBebida = teclado.nextFloat();
        System.out.println("Precio de cada bebida (entre 0,00 y 3,00): ");
        float precioBocatas = teclado.nextFloat();
        System.out.println("Numero de alumnos (entre 1 y 10): ");
        int numAlumnos = teclado.nextInt();
        //10s alinea el texto a la izquierda con un ancho de 10 caracteres.




        // Imprimir encabezados
        System.out.printf("%-10s %-10s %-8s %-8s\n", "ARTICULO", "CANTIDAD", "PRECIO", "COSTE");
        System.out.println("==========  =========  =======  =======");


        // Imprimir datos
        System.out.printf("%-10s %-10d %-8.2f %-8.2f\n", "Bebida",numBebidas, precioBebida, numBebidas * precioBebida);
        System.out.printf("%-10s %-10d %-8.2f %-8.2f\n", "Bocadillo", numBocatas, precioBebida, numBocatas * precioBocatas);


        // Imprimir total
        System.out.println("                                =======");
        System.out.printf("%-10s %28.2f\n", "TOTAL", (numBebidas *precioBebida) + (numBocatas * precioBocatas));
        System.out.println("-------------------------------");


    }
    public static void ejer10(){
        //Decenas de mil: **7**
        //Unidades de mil: **9**
        //Centenas: **0**
        //Decenas: **5**
        //Unidades: **0**
        //Numero introducido: 79050
        System.out.println("Decenas de mil: ");
        int decenasMil = teclado.nextInt();
        int decenasMil1 = 10000 * decenasMil;
        System.out.println("Unidades de mil: ");
        int unidadesMil = teclado.nextInt();
        int unidadesMil1 = unidadesMil * 1000;
        System.out.println("Centenas: ");
        int centenas = teclado.nextInt();
        int centenas1 = centenas * 100;
        System.out.println("Decenas: ");
        int decenas = teclado.nextInt();
        int decenas1 = decenas * 10;
        System.out.println("Unidades: ");
        int unidades = teclado.nextInt();
        int resultado =  decenasMil1+unidadesMil1+centenas1+decenas1+unidades;
        System.out.println("Numero introducido es; "+resultado);


    }
    public static void ejer11(){
        //1. Hágase una aplicación que lea un entero entre 0 y 100. Compruébese (mostrándose verdadero o falso) las siguientes condiciones:
        //a) Es par
        //b) Es mayor que 50
        //(CompararEntero)
        //*ENTRADA/SALIDA*
        //Escribe un entero entre 0 y 100: **55**
        //Par: false
        //Mayor que 50: true
        System.out.println("Escribe un entero entre 0 y 100: ");
        int num = teclado.nextInt();
        boolean par = (num%2)==0;
        System.out.println("Par: "+ par);
        par =  num > 50;
        System.out.println("Mayor que 50: "+par);
    }
    public static void ejer12(){
        //1. Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:
        //a) Son iguales
        //b) La primera es menor que la segunda
        //c) Son distintas
        //(CompararCadenas)
        //*ENTRADA/SALIDA*
        //Escribe una palabra: **hola**
        //Escribe una palabra: **adios**
        //Son iguales: false
        //La primera es menor que la segunda: false
        //Son distintas: true
        System.out.println("EScribe una palabra: ");
        String p1 = teclado.next();
        System.out.println("EScribe una palabra: ");
        String p2 = teclado.next();
        boolean comprobar = p1.equalsIgnoreCase(p2);
        System.out.println("Son iguales: "+ comprobar);
        comprobar = !p2.equalsIgnoreCase(p1) ;
        System.out.println("Son distintas: "+comprobar);
        int nump1 = p1.length();
        int nump2 = p2.length();
        boolean comparar = nump1 < nump2;
        System.out.println("La primera es menor que la segunda: "+comparar);

    }
    public static void ejer13(){
        //a) El primero es par y el segundo impar
        //b) El primero es superior al doble del segundo e inferior a 8
        //c) Son iguales o la diferencia entre el primero y el segundo es menor que 2
        //(CompararEnteros)
        //*ENTRADA/SALIDA*
        //Escribe un número entre 0 y 9: **4**
        //Escribe un número entre 0 y 9: **7**
        //El primero es par y el segundo impar: true
        //El primero es superior al doble del segundo e inferior a 8: false
        //Son iguales o la diferencia entre el primero y el segundo es menor que 2: true
        System.out.println("Escribe un numero entre 0 y 9: ");
        int n1 = teclado.nextInt();
        System.out.println("Escribe un numero entre 0 y 9: ");
        int n2 = teclado.nextInt();
        boolean comparar = (n1%2 == 0) && !(n2%2 == 0);
        System.out.println("El primero es par y el segundo impar: "+ comparar);
        boolean comparar1 = n1>(2*n2) && n1<8;
        System.out.println("El primero es superior al doble del segundo e inferior a 8: "+ comparar1);
        boolean comparar2 = n1 == n2 || (n1 - n2)<2;
        System.out.println("Son iguales o la diferencia entre el primero y el segundo es menor que 2: "+ comparar2);
    }
    public static void ejer15(){
    //ENTERO: **21**
        //Incrementar 5 unidades: 26
        //Decrementar 3 unidades: 23
        //Multiplicar por 10:
        System.out.println("ENTERO: ");
        int num = teclado.nextInt();
        num +=5;
        System.out.println("Incrementar 5: "+ num);
        num -=3;
        System.out.println("Decrementar 3 unidades: "+ num);
        num *=10;
        System.out.println("Multiplicar por 10: "+ num);
        num /= 2;
        System.out.println("Dividir entre dos: "+ num);


    }
}

