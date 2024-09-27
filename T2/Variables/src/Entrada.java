public class Entrada {
     //mod_acc mod_adicional nombre (argumentos) { cuerpo }
    static int edadClase = 50;
    public static void main (String [] args){

        System.out.println("Proyecto variables");
        valoresMaximos();

        //Tipo nombre = valor (el valor es opcional)
        String nombre = "Borja";
        final String CIF = "FJF456";

        char letra = 'A';
        Character letraCompleja = 'a';

        int edad = 69; // numeros sin decimal (-65.435, 65.435)
        Integer edadCompleja =69;

        System.out.println("MI edad "+ edad);
        edad = 70;
        System.out.println("edad nueba "+ edad);
        short numeropequeno = 23; //numero pequeno (-255,255)
        long telefono = 123456789;
        float altura = 3.14f;
        double decimalesDetalles = 3.324141;
        boolean carne = true; //true o false
    }
    public static void miMetodo() {
        String nombre = "Julia";
        int edad = 40;
        edadClase = 80;
    }
    public static void otroMetodo () {
           edadClase = 90;
    }

    public static void valoresMaximos() {
        System.out.println("Imprimiendo los valores maxioms y minimos ");
        System.out.printf("El valor");
    }


}
