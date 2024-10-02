import java.util.Scanner;

public class EjercicioCuatro {
    static Scanner teclado = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("Precio coche: ");
        int precioCoche = teclado.nextInt();
        System.out.println("Plazos de pago: ");
        int plazos = teclado.nextInt();
        int total = precioCoche/plazos;
        System.out.printf("Vas a pagar el coche de %d€ en %d meses, con un total de %d€ cada plazo (sin tener en cuenta los intereses)", precioCoche, plazos, total);
System.out.println("\n");
        float resultado = 0;
        resultado +=0.035;
        int interes = (int) (precioCoche*resultado);
        System.out.printf("“El interés pagado (3,5) en el primer mes es de %d” -->  3,5 de %d\n ", interes, precioCoche);

        precioCoche -=total;
        resultado +=0.035;
        interes =(int) (precioCoche*resultado);
        System.out.println("Interes2 "+interes);

        precioCoche -=total;
        resultado += 0.035;
        interes = (int) (precioCoche*resultado);
        System.out.println("Interes3 "+interes);

        precioCoche -=total;
        resultado += 0.035;
        interes =(int) (precioCoche*resultado);
        System.out.println("Interes4 "+interes);

        precioCoche -=total;
        resultado += 0.035;
        interes = (int) ( precioCoche*resultado);
        System.out.println("Interes5 "+interes);

        precioCoche -=total;
        resultado += 0.035;
        interes =(int) (precioCoche*resultado);
        System.out.println("Interes6 "+interes);
    }
}
