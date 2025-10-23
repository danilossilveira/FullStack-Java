package br.com.deezer.daniloAPI.Model;

public class Musica {
    private String titulo;
    private int duracao;
    private boolean explicito;
    private String LINK_MUSICA;

    public Musica(DadosMusica dadosMusica) {
        this.titulo = dadosMusica.titulo();
        this.duracao = dadosMusica.duracao();
        this.explicito = dadosMusica.explicito();
        this.LINK_MUSICA = dadosMusica.LINK_MUSICA();

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public boolean getExplicito() {
        return explicito;
    }

    public void setExplicito(boolean explicito) {
        this.explicito = explicito;
    }

    public String getLINK_MUSICA() {
        return LINK_MUSICA;
    }

    public void setLINK_MUSICA(String LINK_MUSICA) {
        this.LINK_MUSICA = LINK_MUSICA;
    }

    @Override
    public String toString() {
        return "\n Nome da música: " + titulo +
               "\n Duração em segundos: " + duracao +
               "\n Explicita: " + explicito +
               "\n Link da música: " + LINK_MUSICA;

    }
}
