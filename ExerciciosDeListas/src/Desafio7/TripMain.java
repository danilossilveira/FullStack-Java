package Desafio7;

import java.util.ArrayList;

public class TripMain {
    public static void main(String[] args) {
        var trip1 = new Trip("Bosnia", 3);
        var trip2 = new Trip("Romenia", 1);
        var trip3 = new Trip("Marrocos", 9);
        var trip4 = new Trip("Marechal", 6);

        ArrayList<Trip> list = new ArrayList<>();
        list.add(trip1);
        list.add(trip2);
        list.add(trip3);
        list.add(trip4);
        System.out.println("Lugares marcados no mapa: " + list.size());
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
