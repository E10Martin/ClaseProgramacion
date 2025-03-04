package model;

import java.util.ArrayList;

public class Clientes  {

    private String nombre, apellidos;
    private  ArrayList<Clientes> listaPersonas = new ArrayList<>();

    public Clientes(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        listaPersonas = new ArrayList<>();
    }

    public Clientes() {
        listaPersonas = new ArrayList<>();
    }

    private Clientes estaCliente (String nombre){
        for ( Clientes clientes: listaPersonas) {
            if (clientes.getNombre().equalsIgnoreCase(nombre)){
                return clientes;
            }
        }
        return null;
    }

    public void anadirCliente(Clientes clientes){
        if (estaCliente(clientes.getNombre()) !=null){
            System.out.println("No se ha podido agregar el cliente ");
        } else {
            listaPersonas.add(clientes);
            System.out.println("Cliente agregado correctamente ");
        }
    }

    public void mostrarCliente(){
        for (Clientes clientes:listaPersonas){
            System.out.println(clientes.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<Clientes> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Clientes> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public String toString() {
        return "Clientes;" + "nombre= " + nombre + ", apellidos= " + apellidos ;
    }


}
