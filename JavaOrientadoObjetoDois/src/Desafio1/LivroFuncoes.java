package Desafio1;

public class LivroFuncoes {
    private String livro;
    private String autor;

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void informacoes(){
        System.out.println(livro);
        System.out.println(autor);
    }
}





//Desenvolva uma classe Livro com os atributos privados titulo e autor.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um métoodo exibirDetalhes que imprime o título e o autor do livro.