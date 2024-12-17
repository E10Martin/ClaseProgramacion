package Ejer1.controller;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

        private static final int NUM_HABITACIONES = 20;
        private List<String[]> reservas;

        public Hotel() {
            reservas = new ArrayList<>();
        }

        public boolean registrarReserva(int numHabitacion, String nombreHuesped, int telefonoHuesped, String dni, int numAlojadas) {
            for (String[] reserva : reservas) {
                if (reserva[3].equals(dni)) {
                    System.out.println("Error: El huesped ya tiene una reserva activa.");
                    return false;
                }
            }

            for (String[] reserva : reservas) {
                if (Integer.parseInt(reserva[0]) == numHabitacion) {
                    System.out.println("Error: La habitacion " + numHabitacion + " ya esta ocupada.");
                    return false;
                }
            }

            if (numHabitacion > 0 && numHabitacion <= NUM_HABITACIONES) {
                String[] nuevaReserva = {String.valueOf(numHabitacion), nombreHuesped, String.valueOf(telefonoHuesped), dni, String.valueOf(numAlojadas)};
                reservas.add(nuevaReserva);
                System.out.println("Reserva registrada correctamente.");
                return true;
            } else {
                System.out.println("Error: Numero de habitación no valido.");
                return false;
            }
        }

        public boolean cancelarReserva(String dni) {
            for (String[] reserva : reservas) {
                if (reserva[3].equals(dni)) {
                    reservas.remove(reserva);
                    System.out.println("Reserva cancelada correctamente.");
                    return true;
                }
            }
            System.out.println("Error: No se encontro una reserva con ese DNI.");
            return false;
        }

        public void mostrarReservas() {
            if (reservas.isEmpty()) {
                System.out.println("No hay reservas en el hotel.");
                return;
            }

            for (String[] reserva : reservas) {
                System.out.println("Habitacion: " + reserva[0] + ", Huesped: " + reserva[1] + ", DNI: " + reserva[3] + ", Personas: " + reserva[4]);
            }
        }

        public void mostrarReservasOrdenadas() {
            reservas.sort((r1, r2) -> r1[3].compareTo(r2[3]));
            System.out.println("Reservas ordenadas por DNI:");
            for (String[] reserva : reservas) {
                System.out.println("Habitacion: " + reserva[0] + ", Huesped: " + reserva[1] + ", DNI: " + reserva[3] + ", Personas: " + reserva[4]);
            }
        }
    }

