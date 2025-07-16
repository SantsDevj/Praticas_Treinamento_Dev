package desafio_poo_01.pessoa_exercicio;

public class Pessoa {
    private String nome;
    private  int idade;

    /*Métodos Especiais */
    //Constructor
    public Pessoa(String nome, int idade){
        setIdade(idade);
        setNome(nome);
    }
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

    //Métodos públicos
    public void mostrarDetails(){
        System.out.println("--------------------");
        System.out.println("O seu nome: " + getNome());
        System.out.println("A sua idade é: " + getIdade());
        System.out.println("--------------------");
    }
}