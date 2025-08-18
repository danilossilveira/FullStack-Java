package Classes;

import java.util.Random;

public class Personagem {
    private String nome;
    private String classe;
    private int vida;
    private int energia;
    private String especial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void fichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
        System.out.println("Especial: " + especial);
    }

    public int giroDados() {
        Random random = new Random();
        int dano = 20;
        double critico;
        int numero = random.nextInt(20 + 1);
        if (numero <= 19) {
            System.out.println(numero);
            System.out.println(dano);

        } else {
            critico = dano * 1.2;
            System.out.println(numero);
            System.out.println(critico);
        }

        return dano;
    }
    public void cabecario(){
        String cabecario = """
                  RPG SKILLO
                  Versão trial
                  Clique 1 para iniciar
                """;
        System.out.println(cabecario);
    }
    public void inicio(){
        System.out.println("Voce vai iniciar com o barbaro");
        System.out.println("Quer ver a ficha tecnica do barbaro? 1 para sim, 2 para não.");
    }
}