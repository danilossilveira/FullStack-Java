package Desafio1;

public class ContaBancariaFuncao {
    private int numeroDaConta;
    private double saldo;
    private String titular;


    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void dadosDaConta(){
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println("Seu saldo é" + saldo);
        System.out.println("Titular: " + titular);
    }
}





//Crie uma classe ContaBancaria com os seguintes atributos:
// numeroConta (privado), saldo (privado) e titular (publico).
// Implemente métodos getters e setters para os atributos privados.