package desafio_poo_01.veiculo_heranca;

public class Veiculo {
    protected String marca;
    protected int ano;

    //Método da Classe
    public void ligar(){
        System.out.println("Veículo ligado");
    }
    //Getters e Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
