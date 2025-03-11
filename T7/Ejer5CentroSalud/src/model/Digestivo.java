package model;

public class Digestivo extends Doctor{

    private int ansExperiencia;

    public Digestivo(String nombre, String apellido, int nColegiado, int ansExperiencia) {
        super(nombre, apellido, nColegiado);
        this.ansExperiencia = ansExperiencia;
    }

    public void realizarIntervencion() {
        System.out.println(getNombre() + " está realizando una intervención de Digestivo.");
    }

    @Override
    public void mostrarPersona() {
        super.mostrarPersona();
        System.out.println("ansExperiencia = " + ansExperiencia);
    }
}
