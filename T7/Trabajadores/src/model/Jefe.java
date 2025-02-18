package model;

public class Jefe extends Trabajador implements Empleador{

    private String acciones;
    public Jefe() {
    }

    public Jefe(String nombre, String apellido, int numeroSS, double salario) {
        super(nombre, apellido, numeroSS, salario);
    }

    @Override
    public void calcularSalarioMes() {
        System.out.println("El salario mensual es :"+getSalario());
    }


    @Override
    public boolean realizarTrabajo(int nHoras) {
        System.out.println("El jefe se dispone a trabajar un numero de horas");
        return true;
    }
}
