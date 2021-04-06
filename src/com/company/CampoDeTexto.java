package com.company;

public class CampoDeTexto {
    String pedirTexto(String prompt){
        return pedirTexto(prompt,false);
    }

    String pedirTexto(String prompt, boolean obligatorio){
        System.out.println("\033[33m" + prompt + "\033[0m");
        if (!obligatorio){
            return Main.scanner.nextLine();
        }else{
            while (true){
                String texto = Main.scanner.nextLine();
                if (!texto.isEmpty()){
                    return texto;
                }else{
                    Mensaje mensaje = new Mensaje();
                    mensaje.mostrarWarn("Te falta poner algo");
                }
            }
        }
    }

    int pedirNumero(String prompt){
        System.out.println("\033[33m" + prompt + "\033[0m");
        Main.scanner.nextLine();
        return Main.scanner.nextInt();
    }
}
