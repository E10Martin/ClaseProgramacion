package util;

public enum Proveedor {

    //tipos definidos

    MAHOU("Cerveza mahou",5,"Juan Gomez"),
    COCACOLA("Bebida Gaseosa",10,"Maria Gomez"),
    COMIDASSL(),
    BEBIDASSL("Bebidas gaseosa", 15,"Vaselinas Rodriguez");

    // variables
    private String nombre;
    private int descuento;
    private String contacto;
    // constructores
    Proveedor(){
        this.nombre = "sin definir";
        this.descuento = 0;
        this.contacto = "sin contacto";
    }
    Proveedor(String nombre, int descuento, String contacto) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.contacto = contacto;
    }

    // metodos
}
