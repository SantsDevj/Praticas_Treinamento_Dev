package projecto_poo.projecto_001;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    //Constructor
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    //Método desta classe
    public void mostrarInfo(){
        System.out.println("INFORMAÇÕES DO AUTOR\n_____________________________");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAno());
    }
}
