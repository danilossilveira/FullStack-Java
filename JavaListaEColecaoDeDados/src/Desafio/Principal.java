package Desafio;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Danilo");
        pessoa1.setIdade(19);


        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Carlos");
        pessoa2.setIdade(27);


        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Abner");
        pessoa3.setIdade(45);


        ArrayList<Pessoa> list = new ArrayList<>();
        list.add(pessoa1);
        list.add(pessoa2);
        list.add(pessoa3);
        System.out.println("Pessoas na lista: " + list.size());
        System.out.println(list);
    }
}
