package Desafio5;

public class Car {
    private String model;
    private int year;
    private String  color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Model: " + model + " Year: " + year + " Color: " + color;
    }
}
//Crie uma classe Carro com os atributos modelo, ano e cor.
//Adicione carros à lista e imprima os que são da cor "vermelha".

