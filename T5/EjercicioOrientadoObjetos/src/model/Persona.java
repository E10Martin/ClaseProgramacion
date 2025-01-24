package model;

public class Persona {

    private String nombre, apellido, dni;
    private int edad;
    private double peso, altura;

    public  Persona(String nombre, String apellido, String dni, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;

    }
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111111X";
        //edad, peso, altura ya se inicializan a 0
    }
    public Persona(){
        this.nombre = "sin definir";
        this.apellido = "sin definir";
        this.dni = "1111111X";
        // this.edad = 0;
        // this.peso = 0;
        // this.altura =0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarDatos() {
        System.out.printf("Nombre: %s, Apellido: %s, DNI: %s, Edad: %d, Peso: %.2f kg, Altura: %.2f m\n",
                nombre, apellido, dni, edad, peso, altura);
    }

    public double indiceMasa(){
        double imc = peso/Math.pow(altura,2);
        return imc;
    }
    public void incrementarEdad(int edad){
        this.edad += edad;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
