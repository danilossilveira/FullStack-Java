package Classes;

import java.util.Random;
import java.util.Scanner;

public class Personagem2 {
    public void ficha() {
        System.out.println("Nome: barbar");
        System.out.println("Classe: Barbaro");
        System.out.println("Energia: 10");
        System.out.println("Especial: 12");
    }

    public void cabecario() {
        System.out.println("RPG SKILLO");
        System.out.println("BARBARO VS CLERIGO");
        String opcoes = """
                Você é o barbaro,
                1- Atacar
                2- Ver status do barbaro
                3- Especial
                """;
        System.out.println(opcoes);
    }

    public static void main(String[] args) {
        Personagem2 personagem = new Personagem2();
        personagem.cabecario();
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int danoDoBarbaro = 0;
        int vidaDoBarbaro = 120;
        int especialDoBarbaro = 30;
        int energiaDoBarbaro = 10;
        while (numero < 4) {

            int danoDoClerigo = 0;
            int vidaDoClerigo = 100;
            int especialDoClerigo = 32;
            int energiaDoClerego = 12;
            if (numero == 1) {
                Random random = new Random();
                int dado = random.nextInt(21);
                if (dado < 20) {
                    danoDoBarbaro = 20;
                    vidaDoClerigo = 100 - danoDoBarbaro;
                    System.out.println("o número do dado foi " + dado);
                    System.out.println("Você fez um ataque, deu " + danoDoBarbaro + " de dano no clerigo");
                    System.out.println("O clerigo está com " + vidaDoClerigo + " de vida");
                } else {
                    danoDoBarbaro = (int) (20 * 1.2);
                    vidaDoClerigo = 100 - danoDoBarbaro;
                    System.out.println("o número do dado foi " + dado);
                    System.out.println("CRITICO, você deu " + danoDoBarbaro + " de dano no clerigo");
                    System.out.println("O clerigo está com " + vidaDoClerigo + " de vida");
                }


                System.out.println("Vez do Clerigo");
                int dadoInimigo = random.nextInt(21);
                if (dadoInimigo < 20) {
                    danoDoClerigo = 23;
                    vidaDoBarbaro = 120 - danoDoClerigo;
                    System.out.println("o número do dado do clerigo foi " + dadoInimigo);
                    System.out.println("O Clerigo atacou, deu " + danoDoClerigo + " de dano em você");
                    System.out.println("Você esta  com " + vidaDoBarbaro + " de vida");
                } else {
                    danoDoClerigo = (int) (23 * 1.2);
                    vidaDoBarbaro = 120 - danoDoClerigo;
                    System.out.println("o número do dado do clerigo foi " + dadoInimigo);
                    System.out.println("CRITICO, o clerego deu " + danoDoClerigo + " de dano em você");
                    System.out.println("Você esta  com " + vidaDoBarbaro + " de vida");
                }


            } else if (numero == 3) {
                vidaDoClerigo = vidaDoClerigo - especialDoBarbaro;
                energiaDoBarbaro = energiaDoBarbaro - 3;
                System.out.println("Você usou o especial, você deu " + especialDoBarbaro + " de dano no clerego");
                System.out.println("O clerigo ficou com " + vidaDoClerigo + " de vida");
                System.out.println("Você tem " + especialDoBarbaro + " de energia");
            } else {
                System.out.println("Esta opção não existe, tente novamente");
            }

        }
    }
}
