import model.ClasePadre;

public class Entrada {

    public static void main(String[] args) {
        ClasePadre clasePadre = new ClasePadre("Lionel","Messi",34,"pepsi@hotmail.com");

        ClasePadre.ClaseHija claseHija = clasePadre.new ClaseHija("Celia","Martin", 19,"mmc@cas.com");
        //claseHija.mostrarDatos();
        // clasePadre.setClaseHija(claseHija);
        clasePadre.mostrarDatos();

    }
}
