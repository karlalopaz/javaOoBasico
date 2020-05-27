package com.testAutomationCoach.aAbstraccion;

public class ejemploArticulo {
    public static void main(String[] args) {
        Articulo laptop = new Articulo();
        laptop.nombre = "HP laptop";
        laptop.cantidadExistencias = 12000;

        laptop.agregarCarrito();
        laptop.guardarParaMasTarde();

    }
}
