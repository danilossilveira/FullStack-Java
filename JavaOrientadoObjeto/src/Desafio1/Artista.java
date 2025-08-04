package Desafio1;

public class Artista {
    public static void main(String[] args) {
        ArtistaFuncoes musica= new ArtistaFuncoes();
        musica.titulo = "Como tudo deve ser";
        musica.artista = "Charlie Brown Jr";
        musica.lancamento = 2023;
        musica.fichaTecnica();
        musica.avalia(8);
        musica.avalia(7);
        musica.avalia(9);
        System.out.println("Nota: "+ musica.somaMedia());
    }
}
