package com.company;

public class PantallaListar {
    boolean mostrar() {
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Alumnos");

        int i=1;
        for (Alumnos alumnos : Main.db.selectAlumnos()) {
             System.out.println(i + " - " + alumnos.nom);
             i++;
        }

        System.out.println();
        Menu menu = new Menu();
        String[] opciones = {"Buscar persona", "Borrar persona", "Volver para atras"};
        String opcion = menu.elegirOpcion(opciones);
        CampoDeTexto campoDeTexto = new CampoDeTexto();
        System.out.println();
        if ("1".equals(opcion)) {
            PantallaBuscar pantallaBuscar = new PantallaBuscar();
            pantallaBuscar.mostrar();
        }else if("2".equals(opcion)){
            PantallaDeEliminar pantallaDeEliminar = new PantallaDeEliminar();
            pantallaDeEliminar.mostrar();
        } else if("3".equals(opcion)){
            return false;
        }
        return true;
    }
}
//halo