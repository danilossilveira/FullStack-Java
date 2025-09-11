package Desafio3;

import java.util.ArrayList;

public class bookMain {
    public static void main(String[] args) {
        var livro = new book("O cartomante", "Machado de Assis", 1984);
        var livro2 = new book("O espelho", "Machado de Assis", 1882);
        var livro3 = new book("Livro do autentic", "Autentic Games", 2013);

        ArrayList<book> list = new ArrayList<>();
        list.add(livro);
        list.add(livro2);
        list.add(livro3);
        System.out.println(list.size());
        System.out.println(list);
        }

    }


//Crie uma classe Livro com os atributos titulo, autor e anoPublicacao.
//Adicione livros à lista, imprima todos e filtre os publicados após 2010.