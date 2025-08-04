package projecto_poo.projecto_001;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo = new ArrayList<>();
    private List<Membro> membroRegistrado = new ArrayList<>();
    private List<Emprestimo> emprestimosActivos = new ArrayList<>();

    //Métodos da classe
    public void adicionarLivro(Livro livro){
        acervo.add(livro);
    }
    public void removerLivro(String isbn){
        
    }
}
