package Desafio;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void fichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Idade: " + this.idade;
    }
}




//Crie uma classe Pessoa com atributos como nome,
// idade, e um métoodo toString que represente esses atributos.


//No métoodo main da classe Principal,
// crie um ArrayList de Pessoa chamado listaDePessoas.


//Adicione pelo menos três pessoas à lista utilizando o métoodo add.


//Imprima o tamanho da lista utilizando o métoodo size.


//Imprima a primeira pessoa da lista utilizando o métoodo get.


//Imprima a lista completa

