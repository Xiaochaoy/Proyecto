package com.company;

public class PantallaBuscar {
    void mostrar() {
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Buscame esta .|.");
        System.out.print("A quien quieres buscar: ");

        int p = Main.scanner.nextInt();
        for (int i = 0; i < Main.personas.persona.size(); i++) {
            for (Persona persona : Main.personas.persona) {
                if (p == i) {
                    System.out.println(Main.personas.persona.get(p-1));
                }
            }
        }
    }
}