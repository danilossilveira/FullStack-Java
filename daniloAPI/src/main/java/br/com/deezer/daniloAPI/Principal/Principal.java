package br.com.deezer.daniloAPI.Principal;


import br.com.deezer.daniloAPI.Model.DadosMusica;
import br.com.deezer.daniloAPI.Model.Teste;
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

    public void menu(){
        System.out.println("Música");
        var nomeMusica = scan.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeMusica.replace(" ","+"));
        Teste dados = conversor.obterDados(json, Teste.class);
        System.out.println(dados);






        List<DadosMusica> musicc = new ArrayList<>();
        for(int i = 1; i<dados.musicas())
    }
}
