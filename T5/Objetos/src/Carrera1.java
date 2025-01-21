import model.Coche1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Carrera1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Coche1> listaCoches1 = new ArrayList<>(6);
        int opcion;
        do {
            System.out.println("1. Introduce los 6 particicpantes");
            System.out.println("2. Vueltas");
            System.out.println("3. Clasificacion y granador");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 0; i < 1; i++) {

                        System.out.println("Introduce la marca; ");
                        String marca = scanner.next();
                        System.out.println("Introduce el modelo; ");
                        String modelo = scanner.next();
                        System.out.println("Introduce la matricula; ");
                        String matricula = scanner.next();
                        System.out.println("Introduce los cv; ");
                        int cv = scanner.nextInt();
                        listaCoches1.add(new Coche1(marca, modelo, matricula, cv));
                    }
                    listaCoches1.add(new Coche1("Ford", "Focus", "12a", 77));
                    listaCoches1.add(new Coche1("Seat", "Ibiza", "123a", 100));
                    listaCoches1.add(new Coche1("Mercedes", "C300", "12345a", 23));
                    listaCoches1.add(new Coche1("Mercedes", "Mila", "123456a", 30));
                    listaCoches1.add(new Coche1("Ferrari", "Loko", "123456a", 30));
                    break;
                case 2:
                    System.out.println("Introduce el numero de vueltas:");
                    int numVueltas = scanner.nextInt();
                    for (int vuelta = 1; vuelta <= numVueltas; vuelta++) {
                        for (Coche1 coche1 : listaCoches1) {
                            coche1.recorrido();
                            System.out.println(coche1.toString() + " ha recorrido " + coche1.getKm() + " km");
                        }
                    }

                    //ordenar mediane una interfar de comparator
                    listaCoches1.sort(new Comparator<Coche1>() {
                        @Override
                        public int compare(Coche1 o1, Coche1 o2) {
                            if (o1.getKm() > o2.getKm()){
                                return -1;
                            } else if (o1.getKm()< o2.getKm()) {
                                return 1;
                            }
                            return 0;
                        }
                    });
                    //ordenar mediante un metodo
                    //ordenarCochesKm(listaCoches1);
                    break;
                case 3:
                    System.out.println("El ganador de la carrera es; "+ listaCoches1.get(0).toString());
                    System.out.println("La clasificacion final es;");
                    for (int i = 0; i < listaCoches1.size(); i++) {
                        System.out.println((i+1)+"- "+ listaCoches1.get(i).toString()+" "+listaCoches1.get(i).getKm()+ "km");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 4);
    }

    public static void ordenarCochesKm(ArrayList<Coche1> listaCoches2) {
        for (int i = 0; i < listaCoches2.size() - 1; i++) {
            for (int j = 0; j < listaCoches2.size() - 1 - i; j++) {
                if (listaCoches2.get(j).getKm() < listaCoches2.get(j + 1).getKm()) {
                    Coche1 orden = listaCoches2.get(j);
                    listaCoches2.set(j, listaCoches2.get(j + 1));
                    listaCoches2.set(j + 1, orden);
                }
            }
        }
    }
}
