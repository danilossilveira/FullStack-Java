package Desafio2;

import java.util.ArrayList;

public class ProdutoMain {
    public static void main(String[] args) {
        var produto1 = new Produto("Alho", 2);
        var produto2 = new Produto("Pão", 4);
        var produto3 = new Produto("Carne", 30);
        var produto4 = new Produto("Molho", 15);

        ArrayList<Produto> list = new ArrayList<>();
        list.add(produto1);
        list.add(produto2);
        list.add(produto3);
        list.add(produto4);
        System.out.println(list);
    }
}


//Crie uma classe Produto com os atributos nome e preco.
//Adicione produtos a um ArrayList, imprima o total de produtos e o produto mais caro.
