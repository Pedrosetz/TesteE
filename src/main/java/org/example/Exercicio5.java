package org.example;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra: ");

        String palavra = scanner.nextLine();

        String resultado = inverterPalavra(palavra);

        System.out.println("Palavra invertida: " + resultado);
    }

    public static String inverterPalavra(String palavra) {
        char[] caracters = new char [palavra.length()];

        for (int i = 0; i < palavra.length(); i++){
            caracters[i] = palavra.charAt(palavra.length()  - 1 - i);
        }

        return new String(caracters);
    }


}
