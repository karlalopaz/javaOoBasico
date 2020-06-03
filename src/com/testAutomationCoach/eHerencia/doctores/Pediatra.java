package com.testAutomationCoach.eHerencia.doctores;

public class Pediatra  extends Doctor { //Extends significa... is a... hereda atributos de la clase Doctor (papa)

    public void examinarInfantes() {
        System.out.println("Examinar bebe");
    }
    public void tratarPaciente(){
        System.out.println("pesa al bebe, lo trata con cuidado");
    }
    public void prescribirMedicina() {
        System.out.println("Tome su motrin");
    }
}
