package controller;

import model.Doctor;
import model.Paciente;

public class Citas  {

    private  int fechaCita;
    private Doctor doctor;
    private Paciente paciente;

    public Citas(int fechaCita, Doctor doctor, Paciente paciente) {
        this.fechaCita = fechaCita;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public void mostrarCita(){
        System.out.println("fechaCita = " + fechaCita);
        doctor.mostrarPersona();
        paciente.mostrarPersona();
    }
}
