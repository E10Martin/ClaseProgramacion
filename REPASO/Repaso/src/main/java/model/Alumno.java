package model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno implements Serializable {
    private String nombre, apellido,correo;
    private static Long serialVersionIUD = 1L;

   public void mostrarDatos(){
       System.out.println("nombre = " + nombre);
       System.out.println("apellido = " + apellido);
       System.out.println("correo = " + correo);
   }
}
