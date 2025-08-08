package projecto_poo.projecto_001;

import java.util.ArrayList;
import java.util.List;

public class Membro {
    private String nome;
    private String id_Membro;
    private String telefone;
    private String email;
    private List<Livro> livros_Emprestados = new ArrayList();

    //Constructor    
    public Membro(String nome, String id_Membro, String telefone, String email) {
        this.nome = nome;
        this.id_Membro = id_Membro;
        this.telefone = telefone;
        this.email = email;
    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getId_Membro() {
        return id_Membro;
    }
    public void setId_Membro(String id_Membro) {
        this.id_Membro = id_Membro;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Livro> getLivros_Emprestados() {
        return livros_Emprestados;
    }
    public void setLivros_Emprestados(Livro livros_Emprestados) {
        this.livros_Emprestados.add(livros_Emprestados);
    }
    
    //Métodos desta classe
    public void adicionar_LivroEmprestado(Livro livro){
        setLivros_Emprestados(livro);
    }
    
    public void remover_LivroEmprestado(Livro livro){
        livros_Emprestados.remove(livro);
    }
    @Override
    public String toString() {
        return "Membro [nome=" + nome + ", id_Membro=" + id_Membro + ", telefone=" + telefone + ", email=" + email
                + ", livros_Emprestados=" + livros_Emprestados + "]";
    }
    
}