package com.testAutomationCoach.aAbstraccion;

public class ejemploAlarma {
    public static void main(String[] args) {
        Alarma a = new Alarma();

        System.out.println("Dame la hora");
        String horaReloj = libs.Input.get_string();

        //pedir las horas
        // guardarlo en una variable

        a.setearFecha(25, 10);
        a.setearHoraActual(horaReloj); //poner la variable
        a.setearAlarma("6:45");
        a.suenaAlarma();
    }
}
