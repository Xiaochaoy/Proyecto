package com.company;

public class Menu {
    boolean mostrar(){
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Inicio");
        Opciones opciones = new Opciones();
        return opciones.mostrar();
    }
}
