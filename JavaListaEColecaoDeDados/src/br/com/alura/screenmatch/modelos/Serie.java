package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutosPorEpisodio;

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int getMinutosDeDuracao() {
        return temporadas * episodioPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void fichaTecnica() {
        System.out.println("O nome da série é: "+ getNome());
        System.out.println("O ano de lançamento é: "+ getAnoDeLancamento());
        System.out.println("O filme tem " + getMinutosDeDuracao() + " minutos");
    }
}



/*Serie minhaSerie = new Serie();
        minhaSerie.setNome("The Walking Dead");
        minhaSerie.setAnoDeLancamento(2010);
        minhaSerie.fichaTecnica();

        minhaSerie.setTemporadas(11);
        minhaSerie.setEpisodioPorTemporada(15);
        minhaSerie.setAtiva(true);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println(minhaSerie.getMinutosDeDuracao() + "minutos");*/
