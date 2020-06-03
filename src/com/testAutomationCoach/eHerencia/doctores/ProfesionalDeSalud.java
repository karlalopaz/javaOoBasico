package com.testAutomationCoach.eHerencia.doctores;

public class ProfesionalDeSalud {

    protected String nombre;
    protected String profesion;
    //private int numMuertitos;

    public ProfesionalDeSalud(String nombre, String profesion){ //int numMuertitos) {
        this.nombre = nombre;
        this.profesion = profesion;
       // this.numMuertitos = numMuertitos;
    }

    public void tratarPaciente() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


}
