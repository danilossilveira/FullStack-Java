package Desafio3;

import java.util.Scanner;

public class NumerosDiferentes {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner Desafio3 = new Scanner(System.in);
        System.out.println("Digite um número");
        n1 = Desafio3.nextInt();
        n2 = Desafio3.nextInt();
        if (n1 == n2){
            System.out.println("Ambos são iguais");
        }
        else if (n1 > n2){
            System.out.println("O primeiro número é maior que o segundo");
        }
        else {
            System.out.println("O segundo número é maior que o primeiro");
        }
    }
}
