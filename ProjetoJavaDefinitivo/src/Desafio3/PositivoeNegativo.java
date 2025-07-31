package Desafio3;

import java.util.Scanner;

public class PositivoeNegativo {
    public static void main(String[] args) {
        int numero;
        Scanner Desafio3 = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = Desafio3.nextInt();
        if (numero > 0){
            System.out.println("Este número é positivo");
        }
        else {
            System.out.println("Este número é negativo");
        }
    }
}


//Crie um programa que solicite ao usuário digitar um número.
// Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".