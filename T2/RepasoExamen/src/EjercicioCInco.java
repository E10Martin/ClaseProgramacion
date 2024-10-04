import java.util.Scanner;

public class EjercicioCInco {
    static Scanner teclado = new Scanner(System.in);
    public static float areaTriangulo(float baseTriangulo, float alturaTriangulo){
        return  ((baseTriangulo*alturaTriangulo)/2);
    }
    public static float areaCirculo(float radioCirculo){
        return (float)  (Math.PI*(Math.pow(radioCirculo,2)));
    }

    public static void main(String[] args) {
        //Area Triangulo
        System.out.println("Introduce la base del triangulo: ");
        float baseTriangulo = teclado.nextInt();
        System.out.println("Introduce el area del triangulo: ");
        float alturaTriangulo = teclado.nextInt();
        System.out.println("Lado1 triangulo: ");
        float lado1 = teclado.nextFloat();
        System.out.println("Lado2 triangulo: ");
        float lado2 = teclado.nextFloat();
        System.out.println("Lado3 triangulo: ");
        float lado3 = teclado.nextFloat();
        float totalTriangulo =  areaTriangulo(baseTriangulo, alturaTriangulo);
        System.out.printf("El área del triángulo con base %.0f y altura %.0f es %.2f\n",baseTriangulo,alturaTriangulo,totalTriangulo);
        boolean isosceles = (lado1==lado2) || (lado1==lado3) || (lado2==lado3);
        System.out.println("El triángulo es isósceles:"+isosceles);
        boolean equilatero = (lado1==lado2) &&  (lado2==lado3);
        System.out.println("El triángulo es equliatero:"+equilatero);

        //Area Circulo
        System.out.println("Introduce el radio del circulo: ");
        float radioCirculo = teclado.nextFloat();
        float totalCirculo =areaCirculo(radioCirculo);
        System.out.printf("El área del círculo es %.3f",totalCirculo);


    }
}
