package Desafio3;

public class Carro {
    public static void main(String[] args) {
        Carrofuncao cars = new Carrofuncao();
        cars.setCarro("Chevette");
        cars.setModelo("Tubarão");
        cars.setPreco2011(15000);
        cars.setPreco2012(20000);
        cars.setPreco2013(35000);
        cars.mediaPreco();
    }
}

//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
// Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o
// menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a
// na classe principal para definir preços e mostrar informações.