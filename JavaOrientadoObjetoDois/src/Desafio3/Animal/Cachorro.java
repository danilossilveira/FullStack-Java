package Desafio3.Animal;

public class Cachorro extends Animal {

     @Override
    public void emitirSom() {
        System.out.println("au au");
    }
}



//Crie uma classe Animal com um métoodo emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato,
// que herdam da classe Animal. Adicione o métoodo emitirSom() nas subclasses, utilizando a anotação
// @Override para indicar que estão sobrescrevendo o métoodo. Além disso, adicione métodos específicos para
// cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.