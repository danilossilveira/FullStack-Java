package Desafio1;

public class IdadePessoaFuncao {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void nomeIdade(){
        System.out.println(nome);
        System.out.println(idade);
    }
}








//Crie uma classe IdadePessoa com os atributos privados nome e idade.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.