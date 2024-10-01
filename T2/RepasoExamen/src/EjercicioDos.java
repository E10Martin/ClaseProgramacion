import java.util.Scanner;

public class EjercicioDos {
    //nombre participante
    //ii. número de jugadores del participante
    //iii. presupuesto del participante
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //Jugador 1
        System.out.println("Nombre: ");
        String nombre1 = teclado.nextLine();
        System.out.println("Numero jugadores: ");
        int numJugadores1 = teclado.nextInt();
        System.out.println("Presupuesto: ");
        int presu1 = teclado.nextInt();

        //Jugador 2
        System.out.println("Nombre: ");
        String nombre2 = teclado.nextLine();
        System.out.println("Numero jugadores: ");
        int numJugadores2 = teclado.nextInt();
        System.out.println("Presupuesto: ");
        int presu2 = teclado.nextInt();

        //Jugador 3
        System.out.println("Nombre: ");
        String nombre3 = teclado.nextLine();
        System.out.println("Numero jugadores: ");
        int numJugadores3 = teclado.nextInt();
        System.out.println("Presupuesto: ");
        int presu3 = teclado.nextInt();

        //“1. El primer participante tiene 11 jugadores: (true o false)”
        //“2. El segundo participante tiene jugadores pares: (true o false)”
        //“3. El tercer participante tiene presupuesto positivo: (true o false)”
        //“4. La liga está preparada para empezar: (true o false)”
        boolean j1 = numJugadores1 ==11;
        System.out.println("1.El primer participante tiene 11 jugadores: " +j1);
        boolean j2 = numJugadores2%2 == 0;
        System.out.println("2.El segundo participante tiene jugadores pares: "+ j2);
        boolean j3 =presu3>=0 ;
        System.out.println("3.El tercer participante tiene resupuesto positivo: "+ j3);
        boolean total = (numJugadores1==0 && numJugadores2==0 && numJugadores3==0) && (presu1>=0 && presu2>=0 && presu3>=0);
        System.out.println("4.La liga está preparada para empezar: "+ total);





    }
}
