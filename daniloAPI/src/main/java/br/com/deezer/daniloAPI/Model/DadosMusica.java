package br.com.deezer.daniloAPI.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosMusica(@JsonAlias("title") String titulo,
                          @JsonAlias("duration") int duracao,
                          @JsonAlias("explicit_lyrics") boolean explicito,
                          @JsonAlias("link") String LINK_MUSICA)
                        {
}
