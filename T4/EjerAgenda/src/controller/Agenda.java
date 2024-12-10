package controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private ArrayList<Object[]> listaContactos;

    //constructor
    public Agenda(){
        listaContactos = new ArrayList<>();
    }
    public boolean agregarPersona(String nombre, String apellido, int telefono, String dni){

        Object[] contacto ={nombre, apellido, telefono, dni};
        if (buscarUsuario(dni) == null){
            //agregar
            listaContactos.add(contacto);
            return true;
        }
        //no agregar
        return false;
    }

    private Object[] buscarUsuario(String dni){

        for (Object[] item:listaContactos) {

            if (String.valueOf(item[3]).equals(dni)){
                return item;
            }
        }
        return null;
    }

    public int listarDatosPersonales(String dni){

        Object[] usuario = buscarUsuario(dni);
        if (listaContactos.isEmpty()){
            //lista vacia
            return 1;
        } else if (buscarUsuario(dni)==null) {
            //lista no esta vacia pero el usuario no esta
            return 2;
        }
        //la lista no esta vacia pero el usuario si esta
        for (Object item:usuario) {
            System.out.println(item);
        }
        return -1;
    }


}
