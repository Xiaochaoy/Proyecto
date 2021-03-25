package com.company;

public class Cabeza {
    static void mostrar(String cabeza) {
        char[] charArray = cabeza.toCharArray();
        int letras = charArray.length;
        //System.out.println("------------------------");
        for (int i = 1; i <= letras; i++) {
            if (i == 1){
                System.out.print("+--");
            } else if (i == letras) {
                System.out.println("--+");
            } else{
                System.out.print("-");
            }
        }
        //System.out.println("|----    " + cabeza + "    ----|");
        for (int i = 0; i <= letras; i++) {
            if (i == 1){
                System.out.print("|");
                System.out.print(" " + cabeza + " ");
            }else if (i == letras) {
                System.out.println("|");
            }
        }
        //System.out.println("------------------------");
        for (int i = 1; i <= letras; i++) {
            if (i == 1){
                System.out.print("+--");
            } else if (i == letras) {
                System.out.println("--+");
            } else{
                System.out.print("-");
            }
        }
    }
}
