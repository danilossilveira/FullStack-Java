import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeLivros gerenciador = new GerenciadorDeLivros();
        Scanner scan = new Scanner(System.in);
        int opcao;
        do {
            System.out.println(gerenciador.cabecario);

            while (!scan.hasNextInt()) {
                System.out.println("Digite um número válido.");
                scan.next();
            }
            opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao) {
                case 1:
                    gerenciador.adicionarLivro();
                    break;
                case 2:
                    gerenciador.listarLivros();
                    break;
                case 3:
                    gerenciador.buscarLivros();
                    break;
                case 4:
                    gerenciador.buscarAutor();
                    break;
                case 5:
                    gerenciador.removerLivros();
                    break;
                case 0:
                    System.out.println("Finalizado");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scan.close();
    }
}