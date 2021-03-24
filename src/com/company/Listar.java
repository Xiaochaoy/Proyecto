package com.company;

public class Listar {
    void mostrar(){
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Alumnos");

            for(CrearPersona crearPersona: Main.crearPersona.nom){
                System.out.println(crearPersona.nom);
            }
    }
}
//halo