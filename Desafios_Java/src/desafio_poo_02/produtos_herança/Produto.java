package desafio_poo_02.produtos_herança;

public class Produto {
    protected double preco;
    protected String nome_prod;

    //Getters e Setters
    public String getNome_prod() {
        return nome_prod;
    }
    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    //Método desta classe
    public void exibirInformacoes(){
        System.out.println("EXIBINDO AS INFORMAÇÕES DO PRODDUTO");
        System.out.println("---------------------------");
        System.out.println("NOME DO PRODUCTO: " + getNome_prod());
        System.out.println("PREÇO DO PRODUTO: " + getPreco());
        System.out.println("---------------------------");
    }
}
