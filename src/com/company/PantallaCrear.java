package com.company;

public class PantallaCrear {
    void mostrar() {
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Creació");

        Datos datos = new Datos();
        CampoDeTexto campoDeTexto = new CampoDeTexto();

        datos.nom = campoDeTexto.pedirTexto("El teu nom: ", true);
        datos.edat = campoDeTexto.pedirNumero("Quato anyo: ");
        datos.email = campoDeTexto.pedirTexto("Dame tu correo: ", false);

        Main.personas.datos.add(datos);
    }
}
