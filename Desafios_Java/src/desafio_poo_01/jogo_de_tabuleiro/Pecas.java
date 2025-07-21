package desafio_poo_01.jogo_de_tabuleiro;

public class Pecas {
    protected String cor;
    protected int posicao;
    //Constructor
    public Pecas(String cor, int posicao){
        setCor(cor);
        setPosicao(posicao);
    }
    //getters e setters
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getPosicao() {
        return posicao;
    }
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    //Métodos da classe Peça
    public void movimentoValido(){

    }
}
