package com.company;

public class PantallaCrear {
    void mostrar() {
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Creació");
        //Alumnos alumnos = new Alumnos();
        CampoDeTexto campoDeTexto = new CampoDeTexto();

        String nom = campoDeTexto.pedirTexto("El teu nom: ", true);
        int edat = campoDeTexto.pedirNumero("Quato anyo: ");
        //datos.email = campoDeTexto.pedirTexto("Dame tu correo: ", false);

        //Main.personas.datoes.add(alumnos);
        Main.db.createTables();
        Main.db.insertAlumnos(nom,edat);
    }
}
