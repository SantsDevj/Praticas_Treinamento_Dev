package exercicios_genericos.ex001;

public class User {
    private String nome;
    private int idade;

    public User(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Obter idade
    public int getIdade(){
        return this.idade;
    }
}
