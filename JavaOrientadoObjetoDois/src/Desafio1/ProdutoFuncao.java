package Desafio1;

public class ProdutoFuncao {
    private String produto;
    private double preco;


    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
}



    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }


    public void produtos(){
        System.out.println(produto);
        System.out.println(preco);
    }
    public void aplicarDesconto(double percentual){
       double desconto = preco * (percentual / 100);
       preco -= desconto;
        System.out.println("O valor final ficou: "+preco + "E o desconto foi de: " + percentual);
    }
}




//Desenvolva uma classe Produto com os atributos privados nome e preco.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.