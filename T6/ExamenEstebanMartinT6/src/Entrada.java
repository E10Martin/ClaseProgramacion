import model.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        int opcion;
        do {
            System.out.println("1. Agregar vehiculo para stock");
            System.out.println("2. Buscar en stock");
            System.out.println("3. Vender vehiculo");
            System.out.println("4. Reparar vehiculo");
            System.out.println("5.  Ver caja");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion; ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Que tipo de vehiculo es??");
                    String tipoVehiculo = scanner.next();
                    if (Objects.equals(tipoVehiculo, "coche")){
                        System.out.println("Marca: ");
                        String marca = scanner.next();
                        System.out.println("Modelo: ");
                        String modelo = scanner.next();
                        System.out.println("Estado: ");
                        String estado = scanner.next();
                        System.out.println("Serie: ");
                        int serie = scanner.nextInt();
                        System.out.println("Precio venta: ");
                        int precioVenta = scanner.nextInt();
                        System.out.println("cv: ");
                        int cv = scanner.nextInt();
                        System.out.println("cc: ");
                        int cc = scanner.nextInt();


                        garaje.agregarCoche(new Coche(marca, modelo, estado, serie, precioVenta, cv, cc));
                    }if (Objects.equals(tipoVehiculo, "moto")){
                    System.out.println("Marca: ");
                    String marca = scanner.next();
                    System.out.println("Modelo: ");
                    String modelo = scanner.next();
                    System.out.println("Estado: ");
                    String estado = scanner.next();
                    System.out.println("Serie: ");
                    int serie = scanner.nextInt();
                    System.out.println("Precio venta: ");
                    int precioVenta = scanner.nextInt();
                    System.out.println("cv: ");
                    String transmision = scanner.next();
                    System.out.println("cc: ");
                    double peso = scanner.nextDouble();

                    garaje.agregarMoto(new Motos(marca, modelo, estado, serie, precioVenta, transmision, peso));
                    }if (Objects.equals(tipoVehiculo, "bici")){
                    System.out.println("Marca: ");
                    String marca = scanner.next();
                    System.out.println("Modelo: ");
                    String modelo = scanner.next();
                    System.out.println("Estado: ");
                    String estado = scanner.next();
                    System.out.println("Serie: ");
                    int serie = scanner.nextInt();
                    System.out.println("Precio venta: ");
                    int precioVenta = scanner.nextInt();
                    System.out.println("cv: ");
                    String tipo = scanner.next();

                    garaje.agregarBici(new Bicis(marca, modelo, estado, serie, precioVenta, tipo));

                    }
                    break;
                case 2:
                    garaje.mostrarGaraje();
                    break;
                case 3:
                break;
                case 4:
                    break;
                case 5:
                break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion !=6);
    }
}
