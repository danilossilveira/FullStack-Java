package Desafio1;

public class CarroFuncao {
    String modelo;
    int ano;
    String cor;
    int anoAtual;
    void fichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("cor: " + cor);
    }
    /*void calculoIdade (double idade){
    }*/
    double somaIdade(){
        return anoAtual - ano;
    }
}


/* Crie uma classe Carro com atributos modelo, ano, cor e métodos
para exibir a ficha técnica e calcular a idade do carro.*/