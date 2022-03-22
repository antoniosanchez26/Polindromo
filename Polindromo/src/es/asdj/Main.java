package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto,texto2 = "",textosinespacios = "";

        System.out.print("Escribe una frase: ");
        texto = entrada.nextLine();
        System.out.println();

        for (int i = texto.length() -1; i >= 0 ; i--) {
            if (texto.charAt(i) != ' ') {
                texto2 += texto.charAt(i);
            }
        }

        for (int i = 0; i > texto.length();i++) {
            if (texto.charAt(i) != ' ') {
                textosinespacios += texto.charAt(i);
            }
        }

        if (texto.equalsIgnoreCase(texto2)) {
            System.out.print("El texto es un políndromo");
        } else {
            System.out.print("El texto no es un políndromo");
        }
        System.out.println();
        for (int i = 0; i < texto.length();i++) {
            System.out.print(textosinespacios.charAt(i));
        }
    }
}
