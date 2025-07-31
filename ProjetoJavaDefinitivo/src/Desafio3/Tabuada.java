package Desafio3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner Desafio3 = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero;
        numero = Desafio3.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(i*numero);
        }
    }
}
//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
//for (int i = 0; i < 3; i++);