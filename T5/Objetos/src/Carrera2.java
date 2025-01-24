import model.Coche1;
import model.Coche2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

public class Carrera2 {
    private ArrayList<Coche2> listaCoches2 = new ArrayList<>(8);
    static Scanner scanner = new Scanner(System.in);

    public boolean inscribirParticipante(String marca, String modelo, String matricula, int cv, int km) {
        for (Coche2 coche2 : listaCoches2) {
            if (coche2.getMatricula().equalsIgnoreCase(matricula)) {
                return false;
            }
        }
        Coche2 cocheNuevo = new Coche2(marca, modelo, matricula, cv, km);
        listaCoches2.add(cocheNuevo);
        return true;
    }

    public ArrayList<Coche2> mostrarCoches() {
        return new ArrayList<>(listaCoches2);
    }

    public void descalificarParticipante(String matricula) {
        if (listaCoches2.removeIf(new Predicate<Coche2>() {
            @Override
            public boolean test(Coche2 coche2) {
                return coche2.getMatricula().equalsIgnoreCase(matricula);

            }
        })) {
            System.out.println("Borrado correctamente");
        } else {
            System.out.println("No esta en la lista");
        }
    }

    public void mostrarGanador() {

    }

    private void ordenarParticipantes() {
        listaCoches2.sort(new Comparator<Coche2>() {
            @Override
            public int compare(Coche2 o1, Coche2 o2) {
                if (o1.getKm() > o2.getKm()){
                    return -1;
                } else if (o1.getKm()< o2.getKm()) {
                    return 1;
                }
                return 0;
            }
        });
    }

    public void numVueltas() {
        int numVueltas = scanner.nextInt();
        for (int vuelta = 1; vuelta <= numVueltas; vuelta++) {
            for (Coche2 coche2 : listaCoches2) {
                coche2.recorrido();
                System.out.println(coche2.toString() + " ha recorrido " + coche2.getKm() + " km");
            }
        }
    }

}
