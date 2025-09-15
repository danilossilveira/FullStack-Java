package Desafio4;

import java.util.ArrayList;

public class studentMain {
    public static void main(String[] args) {
        var student = new student("Leon S. Kennedy", 10);
        var student2 = new student("Ada Wong", 5);
        var student3 = new student("Chris Redffield", 8);
        var student4 = new student("Jill Valentine",6);

        ArrayList<student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        System.out.println("Na sala possui " + list.size() + " alunos");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
    }
}

//Crie uma classe Aluno com os atributos nome e nota.
//Adicione alunos, calcule a média das notas e imprima os aprovados (nota ≥ 7).
