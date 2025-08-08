package Desafio3;

public class Carrofuncao {
    private String carro;
    private String modelo;
    private double preco2011;
    private double preco2012;
    private double preco2013;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public void setPreco2013(double preco2013) {
        this.preco2013 = preco2013;
    }

    public void setPreco2012(double preco2012) {
        this.preco2012 = preco2012;
    }

    public void setPreco2011(double preco2011) {
        this.preco2011 = preco2011;
    }

    public void mediaPreco(){
        double precoMedio = (preco2011 + preco2012 + preco2013) / 3;
        double menorValor = Math.min(preco2011, Math.min(preco2012, preco2013));
        double maiorValor = Math.max(preco2011, Math.max(preco2012,preco2013));
        System.out.println("Nome: " + carro);
        System.out.println("Modelo: " + modelo);
        System.out.println("O preço médio do " +carro + " é " + precoMedio);
        System.out.println("O menor preço é " + menorValor);
        System.out.println("O maior preço é " + maiorValor);
    }
}










//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
// Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o
// menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a
// na classe principal para definir preços e mostrar informações.