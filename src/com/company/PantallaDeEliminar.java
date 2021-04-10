package com.company;

public class PantallaDeEliminar {
    void mostrar() {

        //Main.db.deleteTables();

        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Borra este Alumno");
        System.out.print("A quien quieres borrar: ");

        String p = Main.scanner.nextLine();

        Main.db.deleteAlumnos(p);
    }
}