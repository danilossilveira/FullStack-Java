package Desafio6;

public class Animal {
    private String name;
    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;


    }

    @Override
    public String toString() {
        return "name=" + name + " species=" + species;
    }
}

//Crie uma classe Animal com os atributos nome e especie.
//Adicione animais à lista e imprima os da espécie "gato".
