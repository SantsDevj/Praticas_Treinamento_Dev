package projecto_poo.projecto_001;

import java.sql.Date;

public class Emprestimo {
    private Object livro;
    private Object membro;
    private Date data_Devolucao;
    private Date data_DevolucaoPrevita;
    private Date data_DevolucaoReal;

    

    public Emprestimo(Object livro, Object membro, Date data_Devolucao, Date data_DevolucaoPrevita,
            Date data_DevolucaoReal) {
        this.livro = livro;
        this.membro = membro;
        this.data_Devolucao = data_Devolucao;
        this.data_DevolucaoPrevita = data_DevolucaoPrevita;
        this.data_DevolucaoReal = data_DevolucaoReal;
        this.data_DevolucaoReal = null;
    }
    //Getters e Setters
    public Object getLivro() {
        return livro;
    }
    public void setLivro(Object livro) {
        this.livro = livro;
    }
    public Object getMembro() {
        return membro;
    }
    public void setMembro(Object membro) {
        this.membro = membro;
    }
    public Date getData_Devolucao() {
        return data_Devolucao;
    }
    public void setData_Devolucao(Date data_Devolucao) {
        this.data_Devolucao = data_Devolucao;
    }
    public Date getData_DevolucaoPrevita() {
        return data_DevolucaoPrevita;
    }
    public void setData_DevolucaoPrevita(Date data_DevolucaoPrevita) {
        this.data_DevolucaoPrevita = data_DevolucaoPrevita;
    }
    public Date getData_DevolucaoReal() {
        return data_DevolucaoReal;
    }
    public void setData_DevolucaoReal(Date data_DevolucaoReal) {
        this.data_DevolucaoReal = data_DevolucaoReal;
    }

    //Métodos desta classe
    public void registrarEmprestimo(){
        
    }
    public void registrarDevolucao(){

    }
    public void calcularMulta(){

    }

}
