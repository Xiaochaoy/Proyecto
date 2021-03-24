package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static CrearPersona crearPersona = new CrearPersona();

    public static void main(String[] args) {

            Menu menu = new Menu();
            while (menu.mostrar()){}

    }
}
