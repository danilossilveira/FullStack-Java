package Desafio2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var produto1 = new Produto("Carne", 30.0, 4);
        produto1.ficha();
        var produto2 = new Produto("Espeto", 15.0, 10);
        produto2.ficha();
        var produto3 = new Produto("Sal grosso", 5.0, 2);
        produto3.ficha();
        var produto4 = new Produto("Carvão", 20.0, 1);
        produto4.ficha();
        var produto5 = new Produto("Refrigerante", 10.0, 6);
        produto5.ficha();


        var produtoPerecivel1 = new ProdutoPerecivel("Queijo", 10.0, 10, 10.26);
        produtoPerecivel1.ficha();
        var produtoPerecivel2 = new ProdutoPerecivel("Iougurte", 8.0, 2, 11.25);
        produtoPerecivel2.ficha();


        ArrayList<Produto> list = new ArrayList<>();
        list.add(produto1);
        list.add(produto2);
        list.add(produto3);
        list.add(produto4);
        list.add(produto5);
        System.out.println("Quantidade de produtos: " + list.size());
        System.out.println(list);


        ArrayList<ProdutoPerecivel> list1 = new ArrayList<>();
        list1.add(produtoPerecivel1);
        list1.add(produtoPerecivel2);
        System.out.println("Quantidade de produtos pereciveis: " + list1.size());
        System.out.println(list1);
    }
}
