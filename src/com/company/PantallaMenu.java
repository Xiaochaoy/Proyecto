package com.company;

public class PantallaMenu {
    boolean mostrar(){
        Cabeza cabeza = new Cabeza();
        Cabeza.mostrar("Inició");

        Menu menu = new Menu();
        String[] opciones = {"LISTAR","CREAR","BORRAR","SALIR"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        } else if("2".equals(opcion)){
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if("3".equals(opcion)) {
            PantallaDeEliminar pantallaDeEliminar = new PantallaDeEliminar();
            pantallaDeEliminar.mostrar();
        } else if ("4".equals(opcion)){
            return false;
        }
        return true;
    }
}
