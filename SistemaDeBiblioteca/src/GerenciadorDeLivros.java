import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeLivros{
    String cabecario = """
            -----MENU-----
        1. Adicionar livro
        2. Listar livros
        3. Buscar por título
        4. Buscar por autor
        5. Remover livro
        0. Sair
        Escolha uma opção:
            """;
    ArrayList<Livro> lista = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void adicionarLivro(){
        System.out.println("Título: ");
        String titulo = scan.nextLine();

        System.out.println("Ano: ");
        int ano = scan.nextInt();
        scan.nextLine();

        String[] autores = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Autor " + (i + 1) + " (ou ENTER para pular): ");
            String autor = scan.nextLine();
            if (autor.isEmpty()) break;
            autores[i] = autor;
        }

        lista.add(new Livro(titulo, ano, autores));
        System.out.println("Livro adicionado!");
    }

    public void listarLivros() {
        if(lista.size()==0){
            System.out.println("A lista está vazia");
        }
        else {
            System.out.println(lista);
        }
    }
    public void buscarLivros(){
        System.out.println("Digite o título: ");
        String titulo = scan.nextLine();
        for (Livro livro : lista) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro);
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
    public void buscarAutor(){
        System.out.println("Digite o nome do autor: ");
        String autor = scan.nextLine();
        for (Livro livro : lista) {
            if (livro.temAutor(autor)) {
                System.out.println(livro);
            }
        }

    } public void removerLivros(){
        System.out.println("Qual livro você quer remover?");
        String titulo = scan.nextLine();
        lista.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));
        System.out.println("Livro removido (se existia).");
    }
}
