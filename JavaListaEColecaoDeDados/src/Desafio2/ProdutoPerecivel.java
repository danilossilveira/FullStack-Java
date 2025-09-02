package Desafio2;

public class ProdutoPerecivel extends Produto {
    private double dataValidade;

    public ProdutoPerecivel(String produto, double preco, int quantidade, double dataValidade) {
        super(produto, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public double getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(double dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public void ficha() {
        System.out.println("Produto: " + getProduto() + " quantidade: " + getQuantidade() + " preço: " + getPreco() + " Validade: " + getDataValidade());
    }

    public String toString() {
        return "Produto: " + getProduto() + " Preço: " + getPreco() + " Quantidade: " + getQuantidade() + " Validade: " + getDataValidade();
    }
}
