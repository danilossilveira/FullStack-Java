package Desafio2;

public class Produto {
    private String produto;
    private double preco;
    private int quantidade;

    public Produto(String produto, double preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void ficha(){
        System.out.println("Produto: " + produto + " quantidade: " + quantidade + " preço: " + preco);
    }

    @Override
    public String toString() {
        return "Produto: " + produto + " Preço: " + preco + " Quantidade: " + quantidade;
    }
}
