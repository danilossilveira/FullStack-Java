package br.com.alura.screenmatch.modelos;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        var meuFilme = new Filme("O rei leão", 1998);
        meuFilme.avalia(8);
        var meuFilme2 = new Filme("Carros 2", 2006);
        meuFilme2.avalia(7);
        var meuFilme3 = new Filme("Rampage", 2017);
        meuFilme3.avalia(9);
        Serie minhaSerie = new Serie("The walking Dead", 2010);
        minhaSerie.avalia(10);
        ArrayList<Titulo> filmList = new ArrayList<>();
        filmList.add(meuFilme);
        filmList.add(meuFilme2);
        filmList.add(meuFilme3);
        filmList.add(minhaSerie);
        for (Titulo item:filmList) {
            System.out.println(item);
            Filme filme = (Filme) item;
            System.out.println(filme.getSomaDasAvaliacoes());
        }
    }
}

