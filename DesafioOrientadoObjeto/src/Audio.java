public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int curtidas;
    private double classificacao;
    private double totalDasAvaliacoes;
    private double somaDasAvaliacoes;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public double getTotalDasAvaliacoes() {
        return totalDasAvaliacoes;
    }

    public void setTotalDasAvaliacoes(double totalDasAvaliacoes) {
        this.totalDasAvaliacoes = totalDasAvaliacoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }



    public void fichaTecnica(){
        setTitulo("abc");
        setDuracao(1.1);
        setTotalReproducoes(1);
        setCurtidas(1);

    }

    public void avalia(double nota){
        somaDasAvaliacoes=somaDasAvaliacoes+=nota;
        totalDasAvaliacoes++;

    }
    public double soma(){
        return somaDasAvaliacoes / totalDasAvaliacoes;


    }
}


/*audio.avalia(9);
        audio.avalia(8);
        audio.avalia(7);
        audio.avalia(10);*/