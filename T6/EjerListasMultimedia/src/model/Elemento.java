package model;

public class Elemento {
    private String id, titulo, formato;
    private int tamano;
    private Persona autor;
    public Elemento(String id, String titulo, String formato, int tamano, Persona autor){
        this.id = id;
        this.titulo = titulo;
        this.formato = formato;
        this.tamano = tamano;
        this.autor = autor;
    }
    public Elemento(){}
    public void mostrarDatos(){
        System.out.println("id "+ id);
        System.out.println("titulo "+ titulo);
        System.out.println("formato "+ formato);
        System.out.println("tamaño "+ tamano);
        System.out.println("autor "+ autor);
    }

    public String getIdentificador() {
        return id;
    }

    public void setIdentificador(String identificador) {
        this.id = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamaño) {
        this.tamano = tamaño;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }
}
