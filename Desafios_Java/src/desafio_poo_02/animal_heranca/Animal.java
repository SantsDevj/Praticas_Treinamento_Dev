package desafio_poo_01.animal_heranca;

public class Animal {
    protected String nome;
    protected int idade;

    //Getters e Setters
    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //Métodos da classe
    public void fazerBarrulo(){
        System.out.println("Animal fazendo barulho!");
    }
}
