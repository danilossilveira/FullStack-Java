import Classes.Barbaro;
import Classes.Clerigo;
import Classes.Personagem;

import java.util.Scanner;

public class Main extends Personagem{
    public static void main(String[] args) {
        Barbaro barbaro = new Barbaro();
        Clerigo clerigo = new Clerigo();
        Personagem personagem = new Personagem();
        Scanner scanner = new Scanner(System.in);
        personagem.cabecario();
        int escolha = scanner.nextInt();
        switch(escolha){
            case 1:{
                int ficha = scanner.nextInt();
                if (ficha == 1){
                    barbaro.fichaTecnica();
                }

                }
            }
        }

    }
}