package desafio_poo_02.produtos_herança;

public final class Electronico extends Produto{
    private int garantiaMeses;
    //getter e setter
    public int getGarantiaMeses() {
        return garantiaMeses;
    }
    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
    //Sobrescrevendo o método da classe producto
    @Override
    public void exibirInformacoes(){
        System.out.println("EXIBINDO AS INFORMAÇÕES DO PRODUTO ELECTRÔNICO");
        System.out.println("---------------------------");
        System.out.println("NOME DO PRODUCTO ELECTRÔNICO: " + getNome_prod());
        System.out.println("PREÇO DO PRODUTO ELECTRÔNICO: " + getPreco());
        System.out.println("---------------------------");
    } 
}
