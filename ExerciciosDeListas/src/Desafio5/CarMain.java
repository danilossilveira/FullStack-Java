package Desafio5;

import java.util.ArrayList;

public class CarMain {
    public static void main(String[] args) {
        var car1 = new Car("Vectra", 2011, "black");
        var car2 = new Car("Creta", 2024, "Silver");
        var car3 = new Car("Kicks", 2023, "Red");
        var car4 = new Car("Palio", 2002, "Gray");

        ArrayList<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        System.out.println("Temos " + list.size() + " carros na concecionária ");
        System.out.println(list);
    }
}
