package model;

public class Coche {

    //propiedades
    private String marca,modelo,color,matricula,bastidor;

    private double precio;

    private int cv, par;

    //constructores -> por defecto tengo el constructor vacio sin escribir nada
    public Coche(){
        //inicializar el objeto y por ello todos los atributos de este
        matricula = "sin definir";
        modelo = "sin definir";
        bastidor = "sin definir";
        marca = "sin definir";
        color = "sin definir";
    }
    public Coche(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    public Coche(String marca, String modelo, int cv){
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        par =(int) Math.pow(cv*2,2);
    }
    public Coche(String marca, String modelo, String color,String matricula, int cv, double precio, String bastidor){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.cv = cv;
        this.par = (int) Math.pow(cv*2,2);
        this.precio = ( precio +(precio*0.15));
        this.bastidor = bastidor;

    }

    //metodos
    public void mostrarDatos(){
        System.out.println("la marca es: "+ this.marca);
        System.out.println("la modelo es: "+ this.modelo);
        System.out.println("la cv es: "+ this.cv);
        System.out.println("El color es: "+ this.color);
        System.out.println("El par es: "+ this.par);
        System.out.println("El n bastidor es: "+ this.bastidor);
        System.out.println("La matricula es: "+ this.matricula);
        System.out.println("El precio es: "+ this.precio);
        System.out.println();
    }

    //metodos especiales

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getCv(){
        return this.cv;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }
}
