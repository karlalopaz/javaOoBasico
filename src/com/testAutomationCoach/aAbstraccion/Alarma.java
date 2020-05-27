package com.testAutomationCoach.aAbstraccion;

public class Alarma {

    //atributo:
    String horaAlarma;
    //int minutosAlarma;
    //int segundosAlarma;
    int numDia;
    int numMes;
    String horaReloj;
    //int minutosReloj;
    //int segundosReloj;
    int znoose;

    //Metodos

    public void setearFecha(int numDia, int numMes){
        this.numDia = numDia;
        this.numMes = numMes;
    }

    public void setearHoraActual(String horaReloj){
        this.horaReloj=horaReloj;
    }

    public void setearAlarma(String horaAlarma){
        this.horaAlarma = horaAlarma;
    }

    public void setearZnoose(int znoose){
    }

    public void suenaAlarma(){
        if(horaAlarma.equals(horaReloj)){
            System.out.println("Suena alarma!");
        }
    }
}
