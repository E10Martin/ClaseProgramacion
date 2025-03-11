package model;


public class General extends Doctor {
    private String tipo;

    public General(String nombre, String apellido, int nColegiado, String tipo) {
        super(nombre, apellido, nColegiado);
        this.tipo = tipo;
    }

    public void recetarPastillas() {
        System.out.println(getNombre() + " está recetando pastillas para un paciente " + tipo + ".");
    }

    @Override
    public void mostrarPersona() {
        super.mostrarPersona();
        System.out.println("tipo = " + tipo);
    }
}
