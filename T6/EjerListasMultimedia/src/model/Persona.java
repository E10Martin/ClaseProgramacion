package model;

public class Persona {
    private String nombre,dni;

    public Persona (String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    public Persona(){
    }
    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
