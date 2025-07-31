package Desafio3;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner desafio3 = new Scanner(System.in);
        System.out.println("Digite  um númro");
        int numero = desafio3.nextInt();

        String mensagem = (numero % 2 == 0) ? "par" : "impar";
        System.out.println(mensagem);
    }
}





//Crie um programa que solicite ao usuário a entrada de um número inteiro.
// Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.