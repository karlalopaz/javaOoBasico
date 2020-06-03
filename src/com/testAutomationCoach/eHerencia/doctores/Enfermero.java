package com.testAutomationCoach.eHerencia.doctores;

public class Enfermero extends ProfesionalDeSalud {

    public void cuidarPaciente() {
        System.out.println("Bañar al paciente");
    }

    public void administrarMedicinas() {
        System.out.println("Inyectar");
        System.out.println("Dar pastillas");
        System.out.println("Dar jarabe");
    }
}
