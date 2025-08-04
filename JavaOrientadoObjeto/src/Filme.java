public class Filme {
    String nomeDoFilme;
    int anoDeLancamento;
    boolean inclusoNoPlano;
    double somaDasAvaliacoes;
    int totalDasAvaliacoes;
    int minutosDeDuracao;

    void fichaTecnica(){
        System.out.println("O nome do filme é: "+ nomeDoFilme);
        System.out.println("O ano de lançamento é: "+ anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }

   double somaMedia() {
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }
}
