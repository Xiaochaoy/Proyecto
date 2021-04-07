package com.company;

public class Mensaje {
    void mostrarError(String texto){
        System.out.println("\033[31m" + texto + "\033[0m");
    }

    void mostrarWarn(String texto){
        System.out.println("\033[33m" + texto + "\033[0m");
    }
}