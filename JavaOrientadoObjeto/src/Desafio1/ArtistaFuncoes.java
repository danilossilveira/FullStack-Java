package Desafio1;

public class ArtistaFuncoes {
    String titulo;
    String artista;
    int lancamento;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;


    void fichaTecnica(){
        System.out.println("O nome da música é: " + titulo);
        System.out.println("O artista é: "+ artista);
        System.out.println("Lançamento: "+ lancamento);
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double somaMedia(){
       return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}






/*Crie uma classe Musica com atributos titulo, artista, anoLancamento,
avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música
 e calcular a média de avaliações.*/