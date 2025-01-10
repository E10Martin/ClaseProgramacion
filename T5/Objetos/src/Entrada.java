import model.Coche;

public class Entrada {


    public static void main(String[] args) {

        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Ford","Fiesta", "gris");
        Coche coche3 = new Coche("Opel", "Corsa", 100);
        Coche coche4 = new Coche("Mercedes","Mila","azul", "1234A", 110, 100, "veseli");
        System.out.println("Los datos del coche 1 son;");
        coche1.setMarca("Seat");
        coche1.mostrarDatos();
        System.out.println();
        System.out.println("Los datos del coche 2 son;");
        coche2.mostrarDatos();
        System.out.println();
        System.out.println("Los datos del coche 3 son;");
        coche3.mostrarDatos();
        System.out.println();
        System.out.println("Los datos del coche 4 son;");
        coche4.mostrarDatos();

    }


}
