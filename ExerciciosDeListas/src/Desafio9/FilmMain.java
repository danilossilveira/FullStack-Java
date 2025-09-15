package Desafio9;

import java.util.ArrayList;

public class FilmMain {
    public static void main(String[] args) {
        var film1 = new Film("Carros 2", "Ação", 9);
        var film2= new Film("Shrek", "Ação", 5);
        var film3 = new Film("Rampage", "Ação", 7);
        ArrayList<Film> list = new ArrayList<>();
        list.add(film1);
        list.add(film2);
        list.add(film3);
        System.out.println(list);
        System.out.println(list.get(0));
    }
}

//Crie uma classe Filme com os atributos titulo, genero e avaliacao.
//Adicione filmes à lista e imprima os com avaliação acima de 8.
