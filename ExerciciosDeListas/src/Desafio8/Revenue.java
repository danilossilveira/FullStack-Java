package Desafio8;

public class Revenue {
    private String name;
    private double preparationTime;

    public Revenue(String name, double preparationTime) {
        this.name = name;
        this.preparationTime = preparationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(double preparationTime) {
        this.preparationTime = preparationTime;
    }

    @Override
    public String toString() {
        return "Nome: " + name + " Tempo de preparo: " + preparationTime;
    }
}

//Crie uma classe Receita com os atributos nome e tempoPreparo.
//Adicione receitas à lista e imprima as que levam menos de 30 minutos.
