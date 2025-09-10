package Desafio2;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + " Preço: R$" + preco;
    }
}


//Crie uma classe Produto com os atributos nome e preco.
//Adicione produtos a um ArrayList, imprima o total de produtos e o produto mais caro.
