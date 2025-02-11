package model;

import java.util.ArrayList;

public class Garaje {
     private   ArrayList<Vehiculo> lista = new ArrayList<>();


    public Garaje() {
        this.lista = lista;
    }

    public  void agregarCoche(Coche coche){
        lista.add(coche);
    }public  void agregarMoto(Motos motos){
        lista.add(motos);
    }public  void agregarBici(Bicis bicis){
        lista.add(bicis);
    }

    public void mostrarGaraje(){
        for (Vehiculo vehiculo:lista) {
            System.out.println(vehiculo);
        }
    }


}
