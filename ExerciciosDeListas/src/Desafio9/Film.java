package Desafio9;

public class Film {
    private String title;
    private String gender;
    private double assessment;

    public Film(String title, String gender, double assessment) {
        this.title = title;
        this.gender = gender;
        this.assessment = assessment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAssessment() {
        return assessment;
    }

    public void setAssessment(double assessment) {
        this.assessment = assessment;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", assessment=" + assessment;
    }
}


//Crie uma classe Filme com os atributos titulo, genero e avaliacao.
//Adicione filmes à lista e imprima os com avaliação acima de 8.