public class Principal {
    public static void main(String[] args) {
        Filme meufilme = new Filme();
        meufilme.nomeDoFilme = "O rei leão";
        meufilme.anoDeLancamento = 1994;
        meufilme.fichaTecnica();
        meufilme.avalia(8);
        meufilme.avalia(9);
        meufilme.avalia(7);
        System.out.println(meufilme.somaMedia());


        Filme meuFilme2 = new Filme();
        meuFilme2.nomeDoFilme = "Rampage";
        meuFilme2.anoDeLancamento = 2019;
        meuFilme2.fichaTecnica();
    }
}