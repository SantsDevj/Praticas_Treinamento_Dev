package projecto_poo.projecto_001;

public class Classe_Teste {
    public static void main(String[] args) {
        Livro[] livro = new Livro[2];

        livro[0] = new Livro("Deus, o criado dos Céus e a Terra", "Santos Eduardo Júnior", 2027);
        livro[1] = new Livro("O discípulo amado", "João", 100);
        System.out.println("___________________________");
        livro[0].mostrarInfo();
    }
}
