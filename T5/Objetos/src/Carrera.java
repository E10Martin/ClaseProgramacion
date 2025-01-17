import model.Coche;

import java.util.ArrayList;

public class Carrera {

    public static void main(String[] args) {
        ArrayList<Coche> listaCoches = new ArrayList<>();

        Coche coche1 = new Coche("Ford", "Fiesta",69);
        listaCoches.add(new Coche("Ford", "Focus", "Plata"));
        listaCoches.add(new Coche("Seat", "Ibiza", "Blanco"));
        listaCoches.add(new Coche("Mercedes", "C300", 400));
        listaCoches.add(coche1);

        for (Coche coche:listaCoches) {
            coche.mostrarDatos();
        }
    }
}
