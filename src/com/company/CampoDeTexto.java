package com.company;

public class CampoDeTexto {
    String pedir(String prompt){
        return pedir(prompt,false);
    }
    String pedir(String prompt, boolean obligatorio){
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
}
