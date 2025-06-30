package desafio_poo.projecto_biblioteca;

public class Membro {
    private String nome;
    private int membroID;
    private String email;
    private Livro[] livros = new Livro[10]; 
    
    //Constructor
    public Membro(){

    }
    //getters e setters
    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //membroID
    public int getMembroID() {
        return membroID;
    }
    //Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //Método toString
    @Override
    public String toString() {
         System.out.println("----------------------------");
        System.out.println("|-----INFORMAÇÕES DO MEMBRO-----|");
        System.out.println("----------------------------");
        return "Nome do Membro: " + getNome() + "\n ID do membro: " + getMembroID() + "\n E-mail: " + getEmail();
    }
}
