package com.company;

public class PantallaCrear {
    void mostrar() {
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Creació");

        Persona persona = new Persona();
        CampoDeTexto campoDeTexto = new CampoDeTexto();

        persona.nom = campoDeTexto.pedir("El teu nom: ", true);
        persona.edat = campoDeTexto.pedir("Quato anyo: ", true);
        persona.email = campoDeTexto.pedir("Dame tu correo: ", false);

        Main.personas.persona.add(persona);
    }
}
