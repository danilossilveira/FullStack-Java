package Desafio3;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Re4remake");
        lista.add("Re2Classico");
        lista.add("Re2Revelations");
        for (String elemento : lista) {
            System.out.println(lista);
        }
    }
}