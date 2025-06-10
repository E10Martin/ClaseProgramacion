package controller;

import dto.ProfesoresDTO;
import model.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class CentroFormacion {

    static Scanner scanner = new Scanner(System.in);
    private  final static ArrayList<Profesor> listaProfes = new ArrayList<>();

    public  void  menuInsertar(){
        System.out.println("nombre");
        String nombre = scanner.next();
        System.out.println("DNI");
        String dni = scanner.next();
        System.out.println("salarioAnual");
        int salario = scanner.nextInt();

        ProfesoresDTO profesoresDTO = new ProfesoresDTO();
        profesoresDTO.insertarProfe(new Profesor(nombre, dni, salario));
        listaProfes.add(new Profesor(nombre, dni, salario));
    }
    public void eliminar(){

    }

}
