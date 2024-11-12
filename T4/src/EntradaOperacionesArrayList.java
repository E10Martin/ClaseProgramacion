import java.util.Scanner;

public class EntradaOperacionesArrayList {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Object[] cosas = {5, "dam", true, 'a', 5.9, 7};
        /*for (int i = 0; i < cosas.length; i++) {

            if (cosas[i] instanceof String){
                System.out.println(cosas[i]);
                System.out.println("La lomgitud de la palabra es "+ ((String) cosas[i]).length());
            }
        }*/

        //Busquedas --> {1,2,3,4,7,515,15}
        //7 -> recorro y rompo cuando lo encuentro item == elemento
        int[] numeros = {123, 123143, 432134, 5353, 56, 24564, 23};
        System.out.println("Introduce un numero que quieres encontrar; ");

       /*estaNumero(numeroUsuario, numeros);
       if (!estaNumero(numeroUsuario, numeros)){
           System.out.println("El numero no esta");
       }*/
        boolean respuesta;
        do {
            int numeroUsuario = teclado.nextInt();
            respuesta = estaNumero(numeroUsuario, numeros);

        }while(!respuesta);
    }

    public static boolean estaNumero(int numeroBuscar, int[] conjunto){

        for (int item:conjunto) {
            if (item == numeroBuscar){
                System.out.println("Numero encontrado");
                return true;
            }
        }

        return false;
    }
}
