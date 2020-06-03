package com.testAutomationCoach.eHerencia.doctores;

public class Doctor extends ProfesionalDeSalud{

    public String especialidad;
    private double salario;

    public Doctor(String nombre, String profesion, String especialidad, double salario){
        super(nombre, profesion); //super es "super clase" que sirve para pasar los atributos de la clase padre a la hija.
        this.especialidad = especialidad;
        this.salario = salario;
    }

    /*public Doctor(String nombre, String especialidad){ //constructor con otras entradas
        super(nombre, "Doctor");
        this.especialidad=especialidad;
    }

    public Doctor(){ //constructor vacio.
        super();
    }*/

    public void tratarPaciente(){
        System.out.println("Saque la lengua y diga aaaaa!");
        System.out.println("pegar con el martillito en la rodilla");
    }
    public void prescribirMedicina() {
        System.out.println("Tome su paracetamol");
    }

    public String getEspecialidad() {
        return null;
    }
}
