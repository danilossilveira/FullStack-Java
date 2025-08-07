import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
       /* Filme meuFilme = new Filme();
        meuFilme.setNome("O rei leão");
        meuFilme.setAnoDeLancamento(1994);
        meuFilme.setMinutosDeDuracao(130);

        meuFilme.fichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaMedia());*/

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("The Walking Dead");
        minhaSerie.setAnoDeLancamento(2010);
        minhaSerie.fichaTecnica();

        minhaSerie.setTemporadas(11);
        minhaSerie.setEpisodioPorTemporada(15);
        minhaSerie.setAtiva(true);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println(minhaSerie.getMinutosDeDuracao() + "minutos");
    }
}
