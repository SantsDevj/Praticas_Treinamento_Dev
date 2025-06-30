package desafio_poo.projecto_biblioteca;

public class Livro {
    //Atributos
    private String title;
    private String autor;
    private int isbn;
    private boolean disponivel;

    //Constructor
    public Livro(String title, String autor, int isbn, boolean dispon){
        this.isbn = isbn;
        setTitle(title);
        setAutor(autor);
        setDisponivel(dispon);
    }
    //Getters e Setters
    //título
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    //autor
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    //Disponível
    public boolean getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    //ISBN
    public int getIsbn() {
        return isbn;
    }

    //Métodos públicos
    @Override
    public String toString() {
        System.out.println("----------------------------");
        System.out.println("|-----INFORMAÇÕES DO LIVRO-----|");
        System.out.println("----------------------------");
        return "Nome do Autor: " + getAutor() + "\n Título do livro: " + getTitle() + "\n ISBN: " + getIsbn() + "\n Disponiblidade: " + getDisponivel();
        
    }
}