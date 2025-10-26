package br.com.deezer.daniloAPI;

import br.com.deezer.daniloAPI.Model.DadosMusica;
import br.com.deezer.daniloAPI.Model.PlayList;
import br.com.deezer.daniloAPI.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DaniloApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DaniloApiApplication.class, args);
    }

    @Override
    public void run(String... args){
        Principal principal = new Principal();
        Scanner scan = new Scanner(System.in);
        List<DadosMusica> lista = null;
        System.out.println("O que irá fazer hoje?");
        int escolha =0;
        while (escolha!=5) {
            System.out.println("""
                    1-Buscar por música ou artista
                    2-Adicionar música na sua Playlist
                    3-Ver playlist
                    4-Criar uma nova Playlist
                    5-Finalizar""");
            escolha = scan.nextInt();
            scan.nextLine();

            switch (escolha) {
                case 1: {
                    lista = principal.MusicaPesquisa();
                    break;
                }
                case 2: {
                    if (lista != null && !lista.isEmpty()) {
                        principal.PlaylistAdd(lista);
                    } else {
                        System.out.println("Nenhuma música disponível para adicionar.");
                    }
                    break;
                }
                case 3: {
                    principal.exibirPlaylist();
                    break;
                }
                case 4: {
                    principal.criarPlaylist();
                    break;
                }
                case 5:{
                    System.out.println("Processo finalizado");
                    break;
                }
                default:{
                    System.out.println("Opção inválida");
                    break;
                }
             }

        }
    }
}