package ejercicios;

import java.util.Random;

public class EjerArrayMultidimensionales {
    static Random aleatorio = new Random();
    //definir un array con 5 filas y columnas aleatorias entre 2-6
    //rellenarel array(entero) con aleatorios
    public static void main(String[] args) {
        int filas =(int) aleatorio.nextInt(5)+2;
        int[][] numeros = new int[5][filas];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j <numeros[i].length ; j++) {
                numeros[i][j]= aleatorio.nextInt(21)+5;
            }

        }

        //imprimir array
        System.out.println( "Imprimir normal");
        imprimirArray(numeros);
        //al array hay que quitarle uno a cada posicion
        //y volver a imprimir

        // al array hay que quitarle 1 a cada posicion y volver a imprimir
        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length ; j++) {
                numeros[i][j]-=1;
            }
        }
        System.out.println("Imprimiendo modificado:");
        imprimirArray(numeros);

        //modificar e imprimir el array 8 veces, donde
        //cada vez el usuario indica cuantas unidades se quitan
        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length ; j++) {
                numeros[i][j]-=1;
            }
        }


    }
    public static void imprimirArray(int[][] array) {
        for (int[] row :array) {
            for (int element:row) {
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }

}
