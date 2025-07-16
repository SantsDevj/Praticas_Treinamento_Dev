package desafio_poo_02.produtos_herança;

public final class Livro extends Produto{
    private String autor;

    //getter e setter
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    //Sobrescrever um método
    @Override
    public void exibirInformacoes(){
        System.out.println("EXIBINDO AS INFORMAÇÕES SOBRE O LIVRO");
        System.out.println("---------------------------");
        System.out.println("NOME DO LIVRO: " + getNome_prod());
        System.out.println("PREÇO DO LIVRO: " + getPreco());
        System.out.println("---------------------------");
    }
}
