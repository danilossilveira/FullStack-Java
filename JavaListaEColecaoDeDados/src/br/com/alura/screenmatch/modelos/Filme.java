package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo{
   private String diretor;



   //Construtor para por nome no new.
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {

        return "Filme: " + this.getNome() + "("+this.getAnoDeLancamento()+")";
    }
}