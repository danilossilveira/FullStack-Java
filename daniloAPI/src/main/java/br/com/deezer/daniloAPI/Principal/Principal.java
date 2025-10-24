package br.com.deezer.daniloAPI.Principal;

import br.com.deezer.daniloAPI.Model.DadosMusica;
import br.com.deezer.daniloAPI.Model.ObjetoMusicas;
import br.com.deezer.daniloAPI.Model.PlayList;
import br.com.deezer.daniloAPI.Service.ConsumoAPI;
import br.com.deezer.daniloAPI.Service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private final String ENDERECO = "https://api.deezer.com/search?q=";
    Scanner scan = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();
    private PlayList minhaPlaylist;
    private List<DadosMusica> musicasAdicionadas = new ArrayList<>();

    public List<DadosMusica> MusicaPesquisa(){
        System.out.println("Qual música que você procura?");
        String nomeMusica = scan.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeMusica.replace(" ","+"));
        ObjetoMusicas dados = conversor.obterDados(json, ObjetoMusicas.class);
        List<DadosMusica> list = dados.musicas();
        if (list.isEmpty()) {
            System.out.println("Nenhuma música encontrada.");
            return list;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Música " + (i + 1) + ":");
            System.out.println(list.get(i));
            System.out.println("---------------------------");
        }

        return list;
    }

    public void criarPlaylist() {
        System.out.println("Qual é o nome da sua nova playList?");
        String playListName = scan.nextLine();
        minhaPlaylist = new PlayList(playListName);
        musicasAdicionadas.clear();
        System.out.println("Playlist " + playListName + " criada.");
    }

    public void PlaylistAdd(List<DadosMusica> list){
        DadosMusica musica = list.get(0);
        minhaPlaylist.adicionarMusica(musica);
        musicasAdicionadas.add(musica);
        System.out.println(musica + " Adicionada na playlist");
    }

    public void exibirPlaylist() {
        System.out.println("🎧 Sua playlist:");
        for (int i = 0; i < musicasAdicionadas.size(); i++) {
            DadosMusica m = musicasAdicionadas.get(i);
            System.out.println((i + 1) + ". " + m.titulo() + " - " +
                    (m.artista() != null ? m.artista().nome() : "Artista desconhecido"));
        }
    }
}
