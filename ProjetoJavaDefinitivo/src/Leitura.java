import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = Leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual ano de lançamento?");
        int anoLancamento = Leitura.nextInt();
        System.out.println("Qual nota você da para o filme?");
        double avaliacao = Leitura.nextDouble();
        System.out.println(avaliacao);
        System.out.println("O filme " + filme + " foi lançado em " + anoLancamento);
        System.out.println(filme + " " + anoLancamento);
    }
}