package br.com.deezer.daniloAPI.Model;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private String nome;
    private List<DadosMusica> musicas = new ArrayList<>();

    public PlayList(String nome) {
        this.nome = nome;
    }

    public void adicionarMusica(DadosMusica musica) {
        musicas.add(musica);
    }
    public String getNome() {
        return nome;
    }
}

