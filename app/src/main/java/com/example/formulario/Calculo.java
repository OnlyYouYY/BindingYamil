package com.example.formulario;

import java.io.Serializable;

public class Calculo implements Serializable{
    public Calculo(String palabra1, String palabra2, String nombre){
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
        this.nombre = nombre;
    }

    public String getPalabra1(){return palabra1;}
    public String getPalabra2(){return palabra2;}
    public String getNombre(){return nombre;}


    private String palabra1;
    private String palabra2;
    private String nombre;

}
