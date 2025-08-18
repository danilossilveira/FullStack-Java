package Classes;
//Boa sorte! E só para explicar, é um clérigo que usa magia divina, por isso causa dano.
public class Clerigo extends Personagem {
    public static void main(String[] args) {
        Personagem clerigo = new Personagem();
        clerigo.setNome("Clerigo");
        clerigo.setClasse("Clerigo");
        clerigo.setVida(160);
        clerigo.setEnergia(10);
        clerigo.setEspecial("Magia");
        clerigo.fichaTecnica();
    }

    @Override
    public int giroDados(){
        int dano = 14;
        return 0;
    }
}