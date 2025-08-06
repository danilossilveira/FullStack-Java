package Desafio1;

public class AlunoFuncoes {
    private String aluno;
    private double somaDasAvaliacoes;
    private int totalDasAvaliacoes;


    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDasAvaliacoes(int totalDasAvaliacoes) {
        this.totalDasAvaliacoes = totalDasAvaliacoes;
    }
    public void calculo(double nota){
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }
    public double somaMedia() {
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }
    public void fichaTecnica() {
        System.out.println(aluno);
    }
}





//Desenvolva uma classe Aluno com os atributos privados nome e notas.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um métoodo calcularMedia que retorna a média das notas do aluno.