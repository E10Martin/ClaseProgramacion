package model;

import util.Orientacion;

public class Terreno {

    private Casa casa;
    private int m2;
    private Orientacion orientacion;
    private double valoracion;


    public Terreno(){}
    public Terreno(Casa casa, int m2, Orientacion orientacion, double valoracion) {
        this.casa = casa;
        this.m2 = m2;
        this.orientacion = orientacion;
        this.valoracion = valoracion;
    }

    public void construirCasa(int metrosCuadrados){
        if(casa==null && this.m2>metrosCuadrados){
            //realiar construccion
            casa = new Casa();
            revalorizarTerreno();
        }
    }

    public void revalorizarTerreno(){
        //casa?
        //casa >100->casa.getm2
        //casa piscina?-> casa.isPincina
        //casa orientecion? -> casa.getOrientacion.getRevalorizacion
        if (casa != null ){
            valoracion += valoracion*0.25;

        }
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public class Casa {
        private int m2;
        private boolean piscina;

    }
}
