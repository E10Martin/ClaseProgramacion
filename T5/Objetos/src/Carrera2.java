import model.Coche2;

import java.util.ArrayList;

public class Carrera2 {
    private ArrayList<Coche2> listaCoches2 = new ArrayList<>(8);

    public boolean inscribirParticipante(String marca, String modelo, String matricula, int cv, int km){
       listaCoches2.add(new Coche2(marca, modelo, matricula, cv, km));
        return false;
    }
}
