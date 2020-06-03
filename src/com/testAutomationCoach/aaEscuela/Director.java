package com.testAutomationCoach.aaEscuela;

public class Director extends Personal {
    protected char turno;

    public Director(String nombre, String apellidoPaterno, String apellidoMaterno, String titulo, int edad, double salario, char turno) {
        super(nombre, apellidoPaterno, apellidoMaterno, titulo, edad, salario);
        this.turno = turno;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }
}
