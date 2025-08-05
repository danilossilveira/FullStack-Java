package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nomeDoFilme;
    private int anoDeLancamento;
    private boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDasAvaliacoes;
    private int minutosDeDuracao;



    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setTotalDasAvaliacoes(int totalDasAvaliacoes) {
        this.totalDasAvaliacoes = totalDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setMinutosDeDuracao(int minutosDeDuracao) {
        this.minutosDeDuracao = minutosDeDuracao;
    }

    public void fichaTecnica(){
        System.out.println("O nome do filme é: "+ nomeDoFilme);
        System.out.println("O ano de lançamento é: "+ anoDeLancamento);
        System.out.println("O filme tem " + minutosDeDuracao + " minutos");
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }

    public double somaMedia() {
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }
}