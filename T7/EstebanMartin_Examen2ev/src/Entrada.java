import controller.Restaurante;
import model.Bebida;
import model.Clientes;
import model.Comida;
import model.Racion;

import java.util.Objects;
import java.util.Scanner;

public class Entrada {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        Clientes cliente = new Clientes();
        Restaurante restaurante = new Restaurante();
        do {
            System.out.println("1. Crear persona");
            System.out.println("2. Añadir comida");
            System.out.println("3. MOstrar");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Nombre");
                    String nombre = scanner.next();
                    System.out.println("Apellido");
                    String apellido = scanner.next();

                    cliente.anadirCliente(new Clientes(nombre, apellido));
                    break;
                case 2:
                    System.out.print("Que tipo de consumicion quieres:");
                    String opComida = scanner.next();
                    if (Objects.equals(opComida, "comida")){
                        String nombe = "Comida";
                        double precio = 9.5;
                        int nCalorias = 100;

                        restaurante.anadirConsumicion(new Comida(nombe, precio, nCalorias));
                    }if (Objects.equals(opComida, "bebida")){
                        String nombe = "bebida";
                        double precio = 5.5;
                        int nMili = 200;

                        restaurante.anadirConsumicion(new Bebida(nombe, precio, nMili ));
                    }if (Objects.equals(opComida, "racion")){
                        String nombe = "Comida";
                        double precio = 14.5;
                    System.out.println("Q cantidad quieres");
                        double cPlato = scanner.nextDouble();

                        restaurante.anadirConsumicion(new Racion(nombe, precio, cPlato));
                    }

                    break;
                case 3:
                    System.out.println("Solo mostrar cliente 1 o cliente+ consumicion 2");
                    int op = scanner.nextInt();
                    if (op == 1) {
                        cliente.mostrarCliente();
                    }
                    if (op == 2) {
                        restaurante.mostrarConsumicion();
                    }
                    else {
                        System.out.println("Opcion no constemplada");
                    }

                    break;
                case 4:
                    System.out.println("caja");
                    System.out.println(1000);
                    break;
                case 5:
                    System.out.println("Saliendooo");
                    break;
            }
        } while (opcion != 5);
    }


}
