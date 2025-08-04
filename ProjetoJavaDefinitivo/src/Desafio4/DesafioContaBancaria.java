package Desafio4;

import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        String dadosBancarios = """
               -----------------------------------------------------
                Nome do usuário:                 Danilo Silveira
                Tipo de conta:                   Corrente
                Saldo disponível:                R$3000,00
                ----------------------------------------------------
                """;

        double saldo = 3000.00;
        System.out.println(dadosBancarios);

        Scanner leitura = new Scanner(System.in);

        while (true) {
            String funcoes = """
                
                Operações
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
            System.out.println(funcoes);

            int numeros = leitura.nextInt();

            if (numeros == 1) {
                System.out.println("Seu saldo é R$ " + saldo);
            } else if (numeros == 2) {
                System.out.println("Qual valor você quer receber?");
                double receber = leitura.nextDouble();
                saldo += receber;
                System.out.println("Você recebeu R$ " + receber);
            } else if (numeros == 3) {
                System.out.println("Quanto você quer transferir?");
                double transferir = leitura.nextDouble();
                if (transferir <= saldo) {
                    saldo -= transferir;
                    System.out.println("Você transferiu R$ " + transferir);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (numeros == 4) {
                System.out.println("Operação finalizada. Obrigado!");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        leitura.close();
    }
}