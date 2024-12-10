import controller.Agenda;

import java.util.Scanner;

public class Entrada {

    //constructor
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.next();
        System.out.print("Introduce tu apellido: ");
        String apellido = teclado.next();
        System.out.print("Introduce tu telefono: ");
        int telefono = teclado.nextInt();
        System.out.print("Introduce tu DNI: ");
        String dni = teclado.next();
        if (agenda.agregarPersona(nombre,apellido,telefono,dni)){
            //agregado
            System.out.println("Usuario agregado correctamente");
        } else {
            System.out.println("Error al agregr usuario");
        }
        //si la lista esta vacia -> aviso
        switch (agenda.listarDatosPersonales(dni)){
            case 1:
                System.out.println("No se pueden hacer busquedas sobre una lista vacia");
            break;
            case 2:
                System.out.println("NO esta en la lista (s/n)");
                String contestacion = teclado.next();
                if (contestacion.equalsIgnoreCase("s")){
                    //pido datos
                    //agregar persona
                    agenda.agregarPersona(nombre, apellido, telefono, dni);
                }else
            break;
            case 3:
            break;

        }
    }


}
