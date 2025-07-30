import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNota = 0;
        while (nota != -1) {
            System.out.println("Digite sua nota, ou -1 para encerrar");
            nota = Leitura.nextDouble();
            if(nota != -1) {
                mediaAvaliacao += nota;
                totalDeNota++;
            }
        }
        System.out.println("A média de nota é " + mediaAvaliacao / totalDeNota);
    }
}