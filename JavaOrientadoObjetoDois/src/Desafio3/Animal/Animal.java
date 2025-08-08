package Desafio3.Animal;

public class Animal {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void ficha (){
        System.out.println("O nome do animal é: " + nome);
        System.out.println("O " + nome + " tem: " + idade + " anos");
    }

    public void emitirSom(){
        System.out.println("Barulho");
    }

}



////Crie uma classe Animal com um métoodo emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato,
//// que herdam da classe Animal. Adicione o métoodo emitirSom() nas subclasses, utilizando a anotação
//// @Override para indicar que estão sobrescrevendo o métoodo. Além disso, adicione métodos específicos para
//// cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.