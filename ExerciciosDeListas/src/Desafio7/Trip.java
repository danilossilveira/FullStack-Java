package Desafio7;

public class Trip {
    private String destination;
    private int minuteDuration;

    public Trip(String destination, int minuteDuration) {
        this.destination = destination;
        this.minuteDuration = minuteDuration;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getMinuteDuration() {
        return minuteDuration;
    }

    public void setMinuteDuration(int minuteDuration) {
        this.minuteDuration = minuteDuration;
    }

    @Override
    public String toString() {
        return "destination " + destination + " minuteDuration " + minuteDuration;
    }
}

//Crie uma classe Viagem com os atributos destino e duracaoDias.
//Adicione viagens à lista e imprima as que duram mais de 7 dias.
