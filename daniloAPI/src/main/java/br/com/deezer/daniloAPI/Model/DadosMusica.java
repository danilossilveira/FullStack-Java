package br.com.deezer.daniloAPI.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosMusica(@JsonAlias("title") String titulo,
                          @JsonAlias("duration") int duracao,
                          @JsonAlias("explicit_lyrics") boolean explicito,
                          @JsonAlias("link") String LINK_MUSICA,
                          @JsonAlias("artist") DadosArtista artista)
                        {



    @Override
    public String toString() {
    return
       "\nTítulo: " + titulo +
       "\n Artista: " + (artista != null ? artista.nome() : "Desconhecido") +
       "\nDuração: " + duracao + " segundos" +
       "\nExplícito: " + (explicito ? "sim" : "não") +
       "\nLink: " + LINK_MUSICA;
    }

}
