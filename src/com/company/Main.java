package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Personas personas = new Personas();

    public static void main(String[] args) {

        PantallaMenu pantallaMenu = new PantallaMenu();
        while(pantallaMenu.mostrar()) { }
    }
}
