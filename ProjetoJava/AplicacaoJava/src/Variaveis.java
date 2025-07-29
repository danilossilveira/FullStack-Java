public class Variaveis {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Scream math");
        System.out.println("Filme: Carros 2");
        int anoDeLancamento = 2011;
        System.out.println("Este fime foi lançado em:"+anoDeLancamento);
        boolean inclusoNoPlano=true;
        double notaDoFilme=5.7;
        //Média calculada por notas criadas na minha cabeça.
        double media = (9.5+3.8+7.4)/3;
        System.out.println(media);
        String sinopse;
        sinopse= """
                Filme de carros
                Muito bom
                Filme lançado:
                """ + notaDoFilme;
        System.out.println(sinopse);
        int classificacaoEstrelas;
        classificacaoEstrelas = (int) (media/2);
        System.out.println(classificacaoEstrelas);

    }
}