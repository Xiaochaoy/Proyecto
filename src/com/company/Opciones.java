package com.company;

public class Opciones {
    boolean mostrar(){
        System.out.println("1: " + "Lista");
        System.out.println("2: " + "Crear");

        int que = Main.scanner.nextInt();
        Listar listar = new Listar();
        if (que == 1){
            return listar.mostrar();
        }else {
            return false;
        }
    }
}
