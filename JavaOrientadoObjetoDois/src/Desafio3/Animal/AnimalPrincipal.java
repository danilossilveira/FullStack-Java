package Desafio3.Animal;

public class AnimalPrincipal {
    public static void main(String[] args) {
        Cachorro oCachorro = new Cachorro();
        oCachorro.setNome("Pingo");
        oCachorro.setIdade(3);
        oCachorro.ficha();
        oCachorro.emitirSom();
        Gato oGato = new Gato();
        oGato.setNome("Kiara");
        oGato.setIdade(2);
        oGato.ficha();
        oGato.emitirSom();
    }
}
