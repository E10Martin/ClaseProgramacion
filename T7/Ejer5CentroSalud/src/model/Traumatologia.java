package model;

public class Traumatologia extends Doctor{

    public Traumatologia(String nombre, String apellido, int nColegiado) {
        super(nombre, apellido, nColegiado);
    }

    public void realizarVenda() {
        System.out.println(getNombre() + " está realizando una venda a un paciente");
    }


}
