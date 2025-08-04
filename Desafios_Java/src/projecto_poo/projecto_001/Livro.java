package projecto_poo.projecto_001;

public class Livro {
    private String autor;
    private String titulo;
    private String isbn;
    private int ano_Publicacao;
    private boolean disponivel;
    
    //Constructor
    public Livro(String autor, String titulo, String isbn, int ano_Publicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.ano_Publicacao = ano_Publicacao;
        this.disponivel = true;
    }
    //Getters e Setters
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getAno_Publicacao() {
        return ano_Publicacao;
    }
    public void setAno_Publicacao(int ano_Publicacao) {
        this.ano_Publicacao = ano_Publicacao;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    //Métodos da classe livro
    public void emprestar(){
        if (this.disponivel == true) {
            setDisponivel(false);
        }
    }

    public void devolver(){
        setDisponivel(true);
    }
    
    public void exibirDetalhes(){
        System.out.println("---------------------------\nEXIBIR DETALHES DO LIVRO\n---------------------------");
        System.out.println("Título do Livro: " + getTitulo() + "\nNome do Autor: " + getAutor() + "\nISBN: " + getIsbn() + "\nAno de Publicação: " + getAno_Publicacao() + "\nDisponível: " + isDisponivel());
    }
    
    
}
