package model;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {

    private String nombre, DNI;
    private int salarioAnual;

    public void   mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("DNI = " + DNI);
        System.out.println("salarioAnualBase = " + salarioAnual);
    }
}
