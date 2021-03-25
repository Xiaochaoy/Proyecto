package com.company;

public class PantallaListar {
    boolean mostrar() {
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Alumnos");
        int posicionArray = 0;
        for (int i = 0; i < Main.personas.persona.size(); i++) {
         for (Persona persona : Main.personas.persona) {
             System.out.println(i+1 + "- " + persona.nom);
             posicionArray = i;
         }
        }
        System.out.println();
        Menu menu = new Menu();
        String[] opciones = {"Buscar persona", "Salir del programa"};
        String opcion = menu.elegirOpcion(opciones);
        CampoDeTexto campoDeTexto = new CampoDeTexto();
        System.out.println();
        if ("1".equals(opcion)) {
            PantallaBuscar pantallaBuscar = new PantallaBuscar();
            pantallaBuscar.mostrar();
        } else if("2".equals(opcion)){
            return false;
        }
        return true;
    }
}
//halo