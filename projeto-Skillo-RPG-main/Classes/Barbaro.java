package Classes;
//Boa sorte!
public class Barbaro extends Personagem {
    public static void main(String[] args) {
        Personagem barbaro = new Personagem();
    barbaro.setNome("Barbaro");
    barbaro.setClasse("Barbaro");
    barbaro.setVida(120);
    barbaro.setEnergia(15);
    barbaro.setEspecial("Ariete");
    barbaro.fichaTecnica();
    }

    @Override
    public int giroDados(){
        int dano = 20;
        return dano;
    }
}