package model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Productos {

    private int id;
    private String nombre;
    private int precio;
    private int cantidad;

    public void  mostrarProductos(){
        System.out.println("id = " + id);
        System.out.println("nombre = " + nombre);
        System.out.println("precio = " + precio);
        System.out.println("cantidad = " + cantidad);
    }

}
