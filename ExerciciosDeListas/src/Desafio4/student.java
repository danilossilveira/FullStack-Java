package Desafio4;

public class student {
    private String name;
    private double notes;

    public student(String nome, double notes) {
        this.name = nome;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNotes() {
        return notes;
    }

    public void setNotes(double notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Nome:" + name + " Nota " + notes;
    }
}

//Crie uma classe Aluno com os atributos nome e nota.
//Adicione alunos, calcule a média das notas e imprima os aprovados (nota ≥ 7).
