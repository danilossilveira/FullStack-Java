package Desafio1;

public class Carro {
    public static void main(String[] args) {
        CarroFuncao carros = new CarroFuncao();
        carros.anoAtual = 2025;
        carros.modelo = "Vectra Elite";
        carros.ano = 2011;
        carros.cor = "Preto";
        carros.fichaTecnica();
        System.out.println(carros.somaIdade() + " anos");
    }
}
