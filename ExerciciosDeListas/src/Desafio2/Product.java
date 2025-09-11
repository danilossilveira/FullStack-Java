package Desafio2;

public class Product {
    private String name;
    private double value;

    public Product(String nome, double preco) {
        this.name = nome;
        this.value = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Produto: " + " Preço: R$" + value;
    }
}


//Crie uma classe Produto com os atributos nome e preco.
//Adicione produtos a um ArrayList, imprima o total de produtos e o produto mais caro.
