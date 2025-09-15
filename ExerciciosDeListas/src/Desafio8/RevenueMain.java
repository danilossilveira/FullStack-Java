package Desafio8;

import java.util.ArrayList;

public class RevenueMain {
    public static void main(String[] args) {
        var revenue1 = new Revenue("Tapioca", 120);
        var revenue2 = new Revenue("Feijoada", 20);
        var revenue3 = new Revenue("Queijo", 140);
        ArrayList<Revenue> list = new ArrayList<>();
        list.add(revenue1);
        list.add(revenue2);
        list.add(revenue3);
        System.out.println(list);
        System.out.println(list.get(1));
    }

}
//Crie uma classe Receita com os atributos nome e tempoPreparo.
//Adicione receitas à lista e imprima as que levam menos de 30 minutos.
