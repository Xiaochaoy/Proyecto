package com.company;

public class PantallaBuscar {
    void mostrar() {
        Cabeza cabeza = new Cabeza();
        cabeza.mostrar("Buscame este Alumno");
        System.out.print("A quien quieres buscar: ");

        int p = Main.scanner.nextInt();
        Main.scanner.nextLine();

        Datos datos = Main.personas.datos.get(p-1);

        System.out.println("NOM: " + datos.nom);
        System.out.println("EDAT: " + datos.edat);
        System.out.println("EMAIL: " + datos.email);

//        int i = 1;
//        for (Persona persona : Main.personas.persona) {
//            if (p == persona) {
//                System.out.println("NOM: " + persona.nom);
//                System.out.println("EDAT: " + persona.edat);
//                System.out.println("EMAIL: " + persona.email);
//            }
//        }
    }
}