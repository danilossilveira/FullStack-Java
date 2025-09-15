package Desafio10;

public class Athlete {
    private String name;
    private String modality;
    private int score;

    public Athlete(String name, String modality, int score) {
        this.name = name;
        this.modality = modality;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", modality='" + modality + '\'' +
                ", score=" + score;
    }
}

//Crie uma classe Atleta com os atributos nome, modalidade e pontuacao.
//Adicione atletas à lista e imprima o campeão (maior pontuação).