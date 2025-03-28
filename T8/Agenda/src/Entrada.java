import model.Usuarios;

import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();

        for (int i = 0; i < 1; i++) {
        String nombre = scanner.next();
        String apellido = scanner.next();
        String correo = scanner.next();
        int telefono = scanner.nextInt();

            usuarios = new Usuarios(nombre, apellido, correo, telefono);
        }
        usuarios.mostrarDatos();

        OperacionesUsuario operacionesUsuario = new OperacionesUsuario();
        operacionesUsuario.escribirUsuario("C:\\Users\\Usuario DAM1\\Documents\\GitHub\\ClaseProgramacion\\T8\\Agenda\\src\\agenda.txt", usuarios);

    }
}
