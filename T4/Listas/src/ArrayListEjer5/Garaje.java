package ArrayListEjer5;

import java.util.ArrayList;

public class Garaje {

    private ArrayList<Object[]> listaCoches = new ArrayList<>();

    public void añadirCoche(String marca, String modelo, int cv, String matricula) {
        Object[] coche = new Object[]{marca, modelo, cv, matricula};
        if (listaCoches.size() < 5) {

            if (!estaCoche(matricula)) {
                listaCoches.add(coche);
            }else {
                System.out.println("La amatricula esta en la lista, imposible de agregar");
            }
        } else{
            System.out.println("Garaje lleno");
        }
    }

    private boolean estaCoche(String matricula) {
        for (Object[] coche : listaCoches) {
            if (coche[3].equals(matricula)) ;
            System.out.println("El coche esta.");
        }
        return true;
    }

    public void mostrarCoches() {
        for (Object[] coche : listaCoches) {
            System.out.println(coche[3] + " - " + coche[0] + " - " + coche[1]);
        }

    }
}
