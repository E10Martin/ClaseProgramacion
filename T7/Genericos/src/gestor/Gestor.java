package gestor;

import model.Coche;

import java.util.ArrayList;

public class Gestor<S, B, I> {

    private ArrayList<S> listado;

    public void anadirElemento(S dato){
        this.listado.add(dato);
    }
}
