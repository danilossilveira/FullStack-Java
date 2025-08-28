public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void fichaTecnica() {
        setTitulo("Programação");
        setDuracao(1.30);
        setTotalReproducoes(4000);
        setCurtidas(6000);
        setApresentador("D'alessandro");
        setDescricao("Esse Podcast fala sobre programação");
    }
//Fazer as avaliações aqui
}
