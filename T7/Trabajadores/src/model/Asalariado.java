package model;

public class Asalariado extends Trabajador  implements Empleador{

    private int numeroPagas;
    private double retencion;

    public Asalariado(String nombre, String apellido, int numeroSS, double salario) {
        super(nombre, apellido, numeroSS, salario);
        this.numeroPagas = 12;
        this.retencion = 0.02;
    }
    public Asalariado(int numeroPagas, double retencion) {
        this.numeroPagas = numeroPagas;
        this.retencion = retencion;
    }

  @Override
    public void calcularSalarioMes() {
        double salarioMes=(getSalario()-(getSalario()*retencion))/numeroPagas;
        System.out.println("El salario mensual es: "+salarioMes);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("retencion = " + retencion);
        System.out.println("nPagas = " + numeroPagas);
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public int getnPagas() {
        return numeroPagas;
    }

    public void setnPagas(int nPagas) {
        this.numeroPagas = nPagas;
    }

    @Override
    public boolean realizarTrabajo(int nHoras) {
        System.out.println("el asalariado se dispone a realizar el trabajo");
        return true;
    }
}
