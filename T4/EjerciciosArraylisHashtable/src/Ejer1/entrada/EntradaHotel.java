package Ejer1.entrada;

import Ejer1.controller.Hotel;

import java.util.Scanner;

public class EntradaHotel {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        int opcion;
        do {

            System.out.println("\nMenu hotel");
            System.out.println("1. Registrar reservas");
            System.out.println("2. Cancelar reservas");
            System.out.println("3. Mostrar reservas actuales");
            System.out.println("4. Mostrar reservas ordenadas");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Numero habitacion;");
                    int numHabitacion = teclado.nextInt();
                    System.out.println("Nombre huesped;");
                    String nombreHuesped = teclado.next();
                    System.out.println("Telefono huesped;");
                    int telefonoHuesped = teclado.nextInt();
                    System.out.println("Dni huesped;");
                    String dni = teclado.next();
                    System.out.println("Numero personas alojadas;");
                    int numAlojadas = teclado.nextInt();
                    hotel.registrarReserva(numHabitacion, nombreHuesped, telefonoHuesped, dni, numAlojadas);
                    break;
                case 2:
                    System.out.println("¿Quieres cancelar la reserva?");
                    System.out.print("Necesito su DNI; ");
                    String dniCancelar = teclado.next();
                    hotel.cancelarReserva(dniCancelar);
                    break;
                case 3:
                    hotel.mostrarReservas();
                    System.out.println("");
                    break;
                case 4:
                    hotel.mostrarReservasOrdenadas();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Saliendo, gracias por confiar en nosotros.............");
                    break;
                default:
                    System.out.println("Opcion invalida");

            }
        } while (opcion !=5);
    }

}
