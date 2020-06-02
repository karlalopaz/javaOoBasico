package com.testAutomationCoach.cMethods;

public class guitarraElectrica {
    String nombre;
    String modelo;
    String color;
    guitarrista[] famoso;

    public guitarraElectrica(String nombre, String modelo, String color) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.color = color;
        famoso = new guitarrista[5];
    }

    public void afinarGuitarra() {
    }

    public void tunearGuitarra() {
    }

}