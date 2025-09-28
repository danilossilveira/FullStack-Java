
public class Livro {
    private String titulo;
    private int ano;
    private String[] autores = new String[3];

    public Livro(String titulo, int ano, String[] autores) {
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String[] getAutores() {
        return autores;
    }
    public boolean temAutor(String nome) {
        for (String autor : autores) {
            if (autor != null && autor.equalsIgnoreCase(nome)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n" + "Título: " + titulo + ", Ano: " + ano + ", Autores: " + String.join(", ", autores );
    }
}
