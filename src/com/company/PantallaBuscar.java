package com.company;

public class PantallaBuscar {
    void mostrar() {
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Buscame este Alumno");
        System.out.print("A quien quieres buscar: ");

        String p = Main.scanner.nextLine();

        for (Persona persona : Main.personas.persona) {
            if (p.equals(persona.nom)) {
                System.out.println("NOM: " + persona.nom);
                System.out.println("EDAT: " + persona.edat);
                System.out.println("EMAIL: " + persona.email);
            }
        }
    }
}