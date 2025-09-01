package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDasAvaliacoes;
    private int minutosDeDuracao;



    public void setNome(String nome) {
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDasAvaliacoes() {
        return totalDasAvaliacoes;
    }

    public int getMinutosDeDuracao() {
        return minutosDeDuracao;
    }

    public void fichaTecnica(){
        System.out.println("O nome do filme é: "+ nome);
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
