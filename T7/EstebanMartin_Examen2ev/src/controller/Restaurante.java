package controller;

import model.Clientes;
import model.Consumicion;

import java.util.ArrayList;

public class Restaurante extends Clientes {

    private ArrayList<Consumicion> listaConsumiciones = new ArrayList<>();

    private int caja= 0;

    public Restaurante(String nombre, String apellidos, ArrayList<Consumicion> listaConsumiciones) {
        super(nombre, apellidos);
        this.listaConsumiciones = listaConsumiciones;

    }

    public Restaurante() {

    }

    public void anadirConsumicion(Consumicion consumicion){
        listaConsumiciones.add(consumicion);
    }
    public void mostrarConsumicion(){
        for (Consumicion consumicion:listaConsumiciones){
            System.out.println(consumicion.toString());
        }
    }
    public void cajaTotal(){

    }
    @Override
    public String toString() {
        return super.toString() + ". Restaurante: " + " listaConsumiciones=" + listaConsumiciones + "} ";
    }

    public ArrayList<Consumicion> getListaConsumiciones() {
        return listaConsumiciones;
    }

    public void setListaConsumiciones(ArrayList<Consumicion> listaConsumiciones) {
        this.listaConsumiciones = listaConsumiciones;
    }
}
