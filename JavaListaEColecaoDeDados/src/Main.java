import br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class Main {
    public static <Arraylist> void main(String[] args) {
         Filme meuFilme = new Filme();
        meuFilme.setNome("O rei leão");
        meuFilme.setAnoDeLancamento(1994);
        meuFilme.setMinutosDeDuracao(130);

        meuFilme.fichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaMedia());

        var meuFilme2 = new Filme();
        meuFilme2.setNome("Carros 2");
        meuFilme2.setAnoDeLancamento(2006);
        meuFilme2.setMinutosDeDuracao(120);
        meuFilme2.fichaTecnica();
        meuFilme2.avalia(6);
        meuFilme2.avalia(9);
        meuFilme2.avalia(10);
        System.out.println(meuFilme.somaMedia());

    var meuFilme3 = new Filme();
        meuFilme3.setNome("Rampage");
        meuFilme3.setAnoDeLancamento(2017);
        meuFilme3.setMinutosDeDuracao(140);
        meuFilme3.fichaTecnica();
        meuFilme3.avalia(6);
        meuFilme3.avalia(7);
        meuFilme3.avalia(8);
        System.out.println(meuFilme.somaMedia());

        ArrayList<Filme> filmList = new ArrayList<>();
        filmList.add(meuFilme);
        filmList.add(meuFilme2);
        filmList.add(meuFilme3);
        System.out.println("Tamanho da lista: " + filmList.size());
        System.out.println("Primeiro filme: " + filmList.get(0).getNome());
        System.out.println("toString do filme: " + filmList.toString());
}
}
