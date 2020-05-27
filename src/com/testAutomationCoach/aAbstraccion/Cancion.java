package com.testAutomationCoach.aAbstraccion;

public class Cancion {
    //atributos:
    String titulo;
    String nombreArtista;
    int duracionMin;
    int duracionSeg;
    String letra;
    int anioLanzamiento;

    //metodos

    public void crearCancion(String titulo, String nombreArtista, int duracionMin, int duracionSeg, String letra, int anioLanzamiento){
    }
    public void editarCancion(String titulo, String nombreArtista, int duracionMin, int duracionSeg, String letra, int anioLanzamiento){
    }
    public void borrarCancion(String titulo, String nombreArtista, int duracionMin, int duracionSeg, String letra, int anioLanzamiento){
    }
    public void buscarCancion(String titulo, String letra, String nombreArtista){
    }
    public void reproducirCancion(){
        buscarCancion(titulo, letra, nombreArtista);
    }

}
