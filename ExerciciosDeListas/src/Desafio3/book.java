package Desafio3;

public class book {
    private String title;
    private String author;
    private int yearPublication;

    public book(String titulo, String autor, int anoPublicacao) {
        this.title = titulo;
        this.author = autor;
        this.yearPublication = anoPublicacao;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Nome: " + title + " Autor: " + author + " ano: " + yearPublication;
    }
}

//Crie uma classe Livro com os atributos titulo, autor e anoPublicacao.
//Adicione livros à lista, imprima todos e filtre os publicados após 2010.
