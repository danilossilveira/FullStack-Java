import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNomeDoFilme("O rei leão");
        meuFilme.setAnoDeLancamento(1994);
        meuFilme.setMinutosDeDuracao(130);

        meuFilme.fichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
//        System.out.println(meuFilme.setSomaDasAvaliacoes());
//        System.out.println(meuFilme.setTotalDasAvaliacoes());
        System.out.println(meuFilme.somaMedia());
    }
}

//import br.com.alura.screenmatch.modelos.Filme;