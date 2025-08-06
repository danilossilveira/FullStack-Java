package Desafio1;

public class Aluno {
    public static void main(String[] args) {
        AlunoFuncoes notaAluno = new AlunoFuncoes();
        notaAluno.setAluno("Danilo");
        notaAluno.fichaTecnica();
        notaAluno.calculo(10);
        notaAluno.calculo(10);
        notaAluno.calculo(9);
        System.out.println(notaAluno.somaMedia());
    }
}
