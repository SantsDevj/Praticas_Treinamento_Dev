package desafio_poo_01.sistema_ficheiros;

public class Arquivo  implements InterfaceArquivo{
    private String nome_arquivo;
    private int data_criacao;
    private long tamanho;

    /*Constructor */
    public Arquivo(String nome, int data, long tamanho){
        setNome_arquivo(nome);
        setData_criacao(data);
        setTamanho(tamanho);
    }
    //Métodos Especiais -  Getters e Setters

    //Nome do arquivo
    public String getNome_arquivo() {
        return nome_arquivo;
    }
    public void setNome_arquivo(String nome) {
        this.nome_arquivo = nome;
    }

    //Data de Criação
    public int getData_criacao() {
        return data_criacao;
    }
    public void setData_criacao(int data) {
        this.data_criacao = data;
    }

    //tamanho
    public long getTamanho() {
        return tamanho;
    }
    public void setTamanho(long tamanho) {
        this.tamanho = tamanho;
    }
    
    //Método Público
    public void calcularTamanho(){

    }
    //Interface
    @Override
    public void adicionarArquivo(Arquivo arquivo) {
        
    }

    @Override
    public void removerArquivo(String nomeArq) {
        
    }
}
