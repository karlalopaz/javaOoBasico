package com.testAutomationCoach.aaEscuela;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Maestro extends Personal {

    protected Materia[] clases;
    protected char turno;
    protected Salon salon;

    public Maestro(String nombre, String apellidoPaterno, String apellidoMaterno, String titulo, int edad, double salario, Materia[] clases, char turno, Salon salon) {
        super(nombre, apellidoPaterno, apellidoMaterno, titulo, edad, salario);
        this.clases = clases;
        this.turno = turno;
        this.salon = salon;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Materia[] getClases() {
        return clases;
    }

    public void setClases(Materia[] clases) {
        this.clases = clases;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public void ponerCalificacion(){
        System.out.println("Calificar examenes");
    }

    public void tomarLista(){
        System.out.println("Tomar asistencia");
    }

    public void impartirClase(){
        System.out.println("Impartir clases");
    }

    public void llegarAlSalon(){
        System.out.println("Maestro llega al salon adecuado dependiendo del horario");
    }

    public void verificarHorario(){
        System.out.println("Verificar horario de clases");
    }
}
