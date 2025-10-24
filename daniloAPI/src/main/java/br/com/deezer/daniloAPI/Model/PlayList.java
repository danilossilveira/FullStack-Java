package br.com.deezer.daniloAPI.Model;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<DadosMusica> musicas = new ArrayList<>();

    public PlayList(String nome) {
    }

    public void adicionarMusica(DadosMusica musica) {
        musicas.add(musica);
    }
}

