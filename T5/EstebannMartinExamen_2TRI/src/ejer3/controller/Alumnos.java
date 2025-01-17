package ejer3.controller;

public class Alumnos {
    private String nombre;
    private String apellidos;
    private int telefono;
    private String dni;

    public void alumnoss() {
        nombre = nombre;
        apellidos = apellidos;
        telefono = telefono;
        dni = dni;
    }
        public void alumnos (String nombre, String apellidos,int telefono, String dni){
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.telefono = telefono;
            this.dni = dni;
        }

    public String getNombre() {
        return nombre;
    }

   /* @Override
    public String toString (){
        System.out.print("Alumno{"+ " Nombre; "+ nombre, " Apellido "+ apellidos+ "telefono "+ telefono+ " DNI}");

        return null;
    }*/
}
