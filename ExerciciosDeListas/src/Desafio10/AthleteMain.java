package Desafio10;

import java.util.ArrayList;

public class AthleteMain {
    public static void main(String[] args) {
        var athlete1 = new Athlete("Alan Patrick", "Futebol", 10);
        var athlete2 = new Athlete("Rsmon Dino", "Fisiculturismo", 8);
        var athlete3 = new Athlete("Jhon Sena", "Luta livre", 6);

        ArrayList<Athlete> list = new ArrayList<>();
        list.add(athlete1);
        list.add(athlete2);
        list.add(athlete3);
        System.out.println(list);
        System.out.println(list.get(0));
    }
}


//Crie uma classe Atleta com os atributos nome, modalidade e pontuacao.
//Adicione atletas à lista e imprima o campeão (maior pontuação).