package Desafio1;

public class ContaBancaria {
    public static void main(String[] args) {
        ContaBancariaFuncao conta = new ContaBancariaFuncao();
        conta.setNumeroDaConta(1234);
        conta.setSaldo(3000);
        conta.setTitular("Danilo");

        conta.dadosDaConta();
    }
}





//Crie uma classe ContaBancaria com os seguintes atributos:
// numeroConta (privado), saldo (privado) e titular (publico).
// Implemente métodos getters e setters para os atributos privados.