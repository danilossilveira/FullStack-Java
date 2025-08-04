public class Filme {
    String nomeDoFilme;
    int anoDeLancamento;
    boolean inclusoNoPlano;
    double avaliacao;
    int totalDeAvaliacao;
    int minutosDeDuracao;

    void fichaTecnica(){
        System.out.println("O nome do filme é: "+ nomeDoFilme);
        System.out.println("O ano de lançamento é: "+ anoDeLancamento);
    }
    void avalia(double nota){
        totalDeAvaliacao += nota;
        totalDeAvaliacao++;
    }
   double somaMedia(){
        return totalDeAvaliacao / avaliacao;
    }
}
