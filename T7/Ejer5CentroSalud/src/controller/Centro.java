package controller;

import model.Doctor;
import model.Paciente;

import java.util.ArrayList;

public class Centro {

    private ArrayList<Paciente> listaPacientes = new ArrayList<>();
    private ArrayList<Doctor> listaDoctores= new ArrayList<>();

    public void Centro(){
    }


    public void anadirPaciente(Paciente paciente){
        listaPacientes.add(paciente);
        System.out.println("Paciente "+ paciente.getNombre()+" añadido");
    }

    public void mostrarPaciente(){
        System.out.println("Los pacientes en el centro Hospital: ");
        for (Paciente paciente:listaPacientes) {
            paciente.mostrarPersona();
        }
    }

    public void anadirDoctor(Doctor doctor){
        listaDoctores.add(doctor);
        System.out.println("Paciente "+ doctor.getNombre()+" añadido");
    }

    public void mostrarDoctor(){
        System.out.println("Los doctores en el centro Hospital: ");
        for (Doctor doctor:listaDoctores) {
            doctor.mostrarPersona();
        }

    }
}
