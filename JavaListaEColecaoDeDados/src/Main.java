import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static <Arraylist> void main(String[] args) {
         Filme meuFilme = new Filme("O rei leão", 1998);

        meuFilme.setMinutosDeDuracao(130);

        meuFilme.fichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaMedia());

        var meuFilme2 = new Filme("Carros 2", 2006);
        meuFilme2.setMinutosDeDuracao(120);
        meuFilme2.fichaTecnica();
        meuFilme2.avalia(6);
        meuFilme2.avalia(9);
        meuFilme2.avalia(10);
        System.out.println(meuFilme.somaMedia());

    var meuFilme3 = new Filme("Rampage", 2017);
        meuFilme3.setMinutosDeDuracao(140);
        meuFilme3.fichaTecnica();
        meuFilme3.avalia(6);
        meuFilme3.avalia(7);
        meuFilme3.avalia(8);
        System.out.println(meuFilme.somaMedia());

        Serie minhaSerie = new Serie("The walking Dead", 2010);
        minhaSerie.fichaTecnica();
        minhaSerie.setTemporadas(11);
        minhaSerie.setEpisodioPorTemporada(15);
        minhaSerie.setAtiva(true);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println(minhaSerie.getMinutosDeDuracao() + "minutos");

        ArrayList<Filme> filmList = new ArrayList<>();
        filmList.add(meuFilme);
        filmList.add(meuFilme2);
        filmList.add(meuFilme3);
        System.out.println("Tamanho da lista: " + filmList.size());
        System.out.println("Primeiro filme: " + filmList.get(0).getNome());
        System.out.println("toString do filme: " + filmList);
        Collections.sort(filmList);
        System.out.println(filmList);
        filmList.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(filmList);
}
}
