package Desafio3;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner Desafio3 = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = Desafio3.nextInt();
        long fatorial = 1;
        for (int i = 1; i <= numero; i++){
            fatorial *=i;
        }
        System.out.println("O resultado é:" + fatorial);
    }
}