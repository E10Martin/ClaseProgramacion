package model;

public class Doctor extends Persona{

    private int nColegiado;

    public Doctor(String nombre, String apellido, int nColegiado) {
        super(nombre, apellido);
        this.nColegiado = nColegiado;
    }

    @Override
    public void mostrarPersona() {
        super.mostrarPersona();
        System.out.println("nColegiado = " + nColegiado);
    }

    public int getnColegiado() {
        return nColegiado;
    }

    public void setnColegiado(int nColegiado) {
        this.nColegiado = nColegiado;
    }
}
