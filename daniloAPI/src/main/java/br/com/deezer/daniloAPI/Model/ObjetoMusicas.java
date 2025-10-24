package br.com.deezer.daniloAPI.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ObjetoMusicas(@JsonAlias("data")List<DadosMusica>musicas){
}
