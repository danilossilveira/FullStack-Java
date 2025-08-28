public class Musica extends Audio{
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void fichaTecnica() {
        setTitulo("Como tudo deve ser");
        setDuracao(3.0);
        setTotalReproducoes(1000);
        setCurtidas(2000);
        setAlbum("Chorão");
        setCantor("Charlie Brown Jr");
        setGenero("Rock nacional");

    }
}
