package Desafio2;

import java.util.ArrayList;

public class ProductMain {
    public static void main(String[] args) {
        var product1 = new Product("Alho", 2);
        var product2 = new Product("Pão", 4);
        var product3 = new Product("Carne", 30);
        var product4 = new Product("Molho", 15);

        ArrayList<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        System.out.println(list);


    }
}


//Crie uma classe Produto com os atributos nome e preco.
//Adicione produtos a um ArrayList, imprima o total de produtos e o produto mais caro.
