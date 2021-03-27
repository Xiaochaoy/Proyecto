package com.company;

public class PantallaListar {
    boolean mostrar() {
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Alumnos");
         for (Persona persona : Main.personas.persona) {
             System.out.println("- " + persona.nom);
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