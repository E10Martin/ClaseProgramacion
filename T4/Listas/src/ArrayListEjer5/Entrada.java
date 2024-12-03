package ArrayListEjer5;

public class Entrada {
    //VISTA
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        System.out.println("Bienvenido a la gestion de datos;");
        garaje.añadirCoche("Mercedes", "c220", 200, "1234A");
        garaje.añadirCoche("Ford", "Fiesta", 150, "1234B");
        garaje.mostrarCoches();
    }
}
