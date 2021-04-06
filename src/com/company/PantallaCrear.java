package com.company;

public class PantallaCrear {
    void mostrar() {
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Creació");

        Persona persona = new Persona();
        CampoDeTexto campoDeTexto = new CampoDeTexto();

        persona.nom = campoDeTexto.pedirTexto("El teu nom: ", true);
        persona.edat = campoDeTexto.pedirNumero("Quato anyo: ");
        persona.email = campoDeTexto.pedirTexto("Dame tu correo: ", false);

        Main.personas.persona.add(persona);
    }
}
