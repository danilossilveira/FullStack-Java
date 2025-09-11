package Desafio6;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        var animal1 = new Animal("Antonio", "Gato");
        var animal2 = new Animal("Zacarias", "Coelho");
        var animal3 = new Animal("Walter", "Cachorro");

        ArrayList<Animal> list = new ArrayList<>();
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);
        System.out.println("Neste zoológico tem " + list.size() + " especies de animais");
        System.out.println(list);
    }
}
