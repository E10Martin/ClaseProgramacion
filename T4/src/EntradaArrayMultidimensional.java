import java.util.Scanner;

public class EntradaArrayMultidimensional {
    static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        int [][] numeros ={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16,17}};

        //cuantas filas tengo
        int numeroFilas = numeros.length; //4
        //numero columnas de la primera fila
        int numeroFila1 = numeros[0].length;
        int numeroFila2 = numeros[1].length;
        //sacar el ultimo elemento
        int ulltimomNUmero = numeros[numeros.length-1][numeros[numeros.length-1].length-1];

        int primreValor = numeros[0][0];
        //modificar posicion
        numeros[0][0]= 0;
        //acceder a todos los elementos
        //forma for
        //filas
        for (int i = 0; i < numeros.length; i++) {
            //columnas
            for (int j = 0; j <numeros[i].length ; j++) {
                System.out.print(numeros[i][j]+"\t");
            }
            System.out.println();
        }
        //forma foreach
        for (int[] item:numeros) {
            for (int element :item) {
                System.out.print(element+"\t");
            }
            System.out.println();
        }

    }
}
