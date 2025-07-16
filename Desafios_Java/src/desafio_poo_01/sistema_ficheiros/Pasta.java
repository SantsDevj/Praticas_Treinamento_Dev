package desafio_poo.sistema_ficheiros;

public class Pasta implements InterfacePasta{
    //Atributos
    private String nome_pasta;
    private Arquivo arquivo_pasta;
    private Pasta subpasta;

    //Contructor
    public Pasta(String nome_pasta, Arquivo arquivoPasta, Pasta subpasta){
        setArquivo_pasta(arquivoPasta);
        setNome_pasta(nome_pasta);
        setSubpasta(subpasta);
    }

    //Getters e Setters
    //Nome do arquivo
    public String getNome_pasta() {
        return nome_pasta;
    }
    public void setNome_pasta(String nome_pasta) {
        this.nome_pasta = nome_pasta;
    }

    //Arquivo da Pasta
    public Arquivo getArquivo_pasta() {
        return arquivo_pasta;
    }
    public void setArquivo_pasta(Arquivo arquivo) {
        this.arquivo_pasta = arquivo;
    }
    
    //Subpasta
    public Pasta getSubpasta() {
        return subpasta;
    }
    public void setSubpasta(Pasta subpasta) {
        this.subpasta = subpasta;
    }
    //Método Público
    public void calcularTamanho(){

    }
    //Interface
    @Override
    public void adicionarPasta(Pasta pasta) {
        
    }

    @Override
    public void removerPasta(String nomePast) {
        
    }
}
