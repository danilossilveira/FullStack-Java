package Desafio1;

public class Produto {
    public static void main(String[] args) {
        ProdutoFuncao produto = new ProdutoFuncao();
        produto.setProduto("Picanha");
        produto.setPreco(1000);
        produto.produtos();
        produto.aplicarDesconto(20);
    }
}
