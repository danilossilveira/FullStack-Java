package Desafio1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);
        System.out.println("Põe o número aí");
        int numero;
        numero = Leitura.nextInt();
        int calculo = numero *2;
        System.out.println("O valor é: " + calculo);
    }
}
