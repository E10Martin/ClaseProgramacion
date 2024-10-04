public class Entrada {
    public static void main(String[] args) {
        int nota = 6;
        String mensaje = null;
        //if --> 0 - 10 -> nota correcta
        if (nota >= 6 && nota <= 10) {
            System.out.println("La nota es correcta ");
            //decido que tipo de nota es
            //ss -> 0-4,99
            //ap -> 5-6,99
            //nt -> 7-8,99
            //sb -> 9-9,99
            //mt -> 10
            if (nota < 5) {
                System.out.println("SS");
            } else if (nota < 7) {
                System.out.println("ap");
            } else if (nota < 9) {
                System.out.println("nt");
            } else if (nota < 10) {
                System.out.println("mt");
            }
        } else {
            System.out.println("La nota no es correcta");
        }
        System.out.println("Terminando la ejecucucion");
    }
}

