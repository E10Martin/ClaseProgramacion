import java.util.Scanner;

public class Formulario {


    private String nombre;
    private String apellido;
    private String dni;


    public void mostrarDatos(){
        if (nombre==null || apellido == null || dni == null){
            throw new NullPointerException("Alguno de los datos no esta relleno");
        }else {
            System.out.println("nombre = " + nombre);
            System.out.println("apellido = " + apellido);
            System.out.println("dni = " + dni);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws LongException {
        if (nombre ==null || nombre.isEmpty()){
            throw new LongException("El nombre no es valido");
        }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws LongException {
        if (nombre ==null || nombre.isEmpty()){
            throw new LongException("El nombre no es valido");
        }
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws LetrasExcepcion, LongException {
        char ultimaLetra = dni.charAt(dni.length()-1);
        //si  ultima letra no es una letra
        if (Character.isDigit(ultimaLetra)){
            //da error
            throw new LetrasExcepcion("el ultimo digito no es una letra");
        }
        if (dni.length()!=9){
            throw new LongException("El tamaño del dni no es correcto");
        }
        this.dni = dni;
    }
}
