package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto, textoAlReves = "", textoSinEspacios = "";

        System.out.print("Escribe una frase: ");
        texto = entrada.nextLine();
        System.out.println();

        for (int i = texto.length() - 1; i >= 0 ; i--) {
            if (texto.charAt(i) != ' ') {
                textoAlReves += texto.toLowerCase().charAt(i);
            }
        }

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ') {
                textoSinEspacios += texto.toLowerCase().charAt(i);
            }
        }

        if (textoSinEspacios.equals(textoAlReves)) {
            System.out.print("El texto es un políndromo");
        } else {
            System.out.print("El texto no es un políndromo");
        }
        System.out.println();
    }
}
