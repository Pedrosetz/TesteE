package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (fibonacci(numero)){
            System.out.println("O numero " + numero + " pertence a sequencia");
        } else {
            System.out.println("O numero " + numero + " não pertence a sequencia");
        }
    }

    public static boolean fibonacci(int numero) {
        int a = 0;
        int b = 1;

        while (a <= numero){
            if (a == numero){
                return true;
            }

            int proximoNumero = a + b;
            a = b;
            b = proximoNumero;
        }

        return false;
    }
}
