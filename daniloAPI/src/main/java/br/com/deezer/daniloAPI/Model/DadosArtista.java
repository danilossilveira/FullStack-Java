package br.com.deezer.daniloAPI.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosArtista(@JsonAlias("name") String nome)
{






}
